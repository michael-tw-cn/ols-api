package com.thoughtworks.nho.olsapi.service.traincamp;

import java.util.List;

public interface TrainCampTaskCardService {

    /**
     * 批量新增训练营与任务卡关系
     * @param trainCampId
     * @param taskCardIds
     */
    void batchInsert(Long trainCampId, List<Integer> taskCardIds);

}
