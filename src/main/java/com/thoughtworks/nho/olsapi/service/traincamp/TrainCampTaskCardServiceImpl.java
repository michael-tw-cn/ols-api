package com.thoughtworks.nho.olsapi.service.traincamp;

import com.thoughtworks.nho.olsapi.entity.TrainCampTaskCard;
import com.thoughtworks.nho.olsapi.repository.TrainCampTaskCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainCampTaskCardServiceImpl implements TrainCampTaskCardService {

    @Autowired
    private TrainCampTaskCardRepository trainCampTaskCardRepository;

    @Override
    public void batchInsert(Long trainCampId, List<Integer> taskCardIds) {
        for (Integer taskCardId : taskCardIds) {
            TrainCampTaskCard trainCampTaskCard = new TrainCampTaskCard(trainCampId, taskCardId);
            trainCampTaskCardRepository.save(trainCampTaskCard);
        }
    }
}
