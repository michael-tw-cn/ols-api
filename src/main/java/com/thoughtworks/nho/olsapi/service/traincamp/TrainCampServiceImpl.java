package com.thoughtworks.nho.olsapi.service.traincamp;

import com.thoughtworks.nho.olsapi.common.OlsServiceException;
import com.thoughtworks.nho.olsapi.entity.TrainCamp;
import com.thoughtworks.nho.olsapi.entity.TrainCampSimpleInfo;
import com.thoughtworks.nho.olsapi.repository.TrainCampRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainCampServiceImpl implements TrainCampService {

    @Autowired
    private TrainCampRepository trainCampRepository;
    @Autowired
    private TrainCampTaskCardService trainCampTaskCardService;


    @Override
    public void create(TrainCampSimpleInfo simpleInfo) throws OlsServiceException {
        List<Integer> taskCardIds = simpleInfo.getTaskCardIds();
        if (CollectionUtils.isEmpty(taskCardIds)) {
            throw new OlsServiceException("必须选择任务卡");
        }

        TrainCamp trainCamp = new TrainCamp();
        BeanUtils.copyProperties(simpleInfo,trainCamp);
        trainCampRepository.save(trainCamp);
        trainCampTaskCardService.batchInsert(trainCamp.getId(),simpleInfo.getTaskCardIds());
    }

    @Override
    public List<TrainCampSimpleInfo> list() {
        List<TrainCampSimpleInfo> results = null;
        List<TrainCamp> availableTranCamps = trainCampRepository.findAvailableTranCamps();
        if (!CollectionUtils.isEmpty(availableTranCamps)) {
            results = new ArrayList<>(availableTranCamps.size());
            for (TrainCamp availableTranCamp : availableTranCamps) {
                TrainCampSimpleInfo trainCampSimpleInfo = new TrainCampSimpleInfo();
                BeanUtils.copyProperties(availableTranCamp,trainCampSimpleInfo);
                results.add(trainCampSimpleInfo);
            }
        }
        return results;
    }
}
