package com.thoughtworks.nho.olsapi.service.traincamp;

import com.thoughtworks.nho.olsapi.common.OlsServiceException;
import com.thoughtworks.nho.olsapi.entity.TrainCampSimpleInfo;

import java.util.List;

public interface TrainCampService {

    void create(TrainCampSimpleInfo trainCamp) throws OlsServiceException;

    List<TrainCampSimpleInfo> list();
}
