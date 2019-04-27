package com.thoughtworks.nho.olsapi.controller;

import com.thoughtworks.nho.olsapi.common.OlsServiceException;
import com.thoughtworks.nho.olsapi.entity.TrainCampSimpleInfo;
import com.thoughtworks.nho.olsapi.entity.WebResponse;
import com.thoughtworks.nho.olsapi.service.traincamp.TrainCampService;
import com.thoughtworks.nho.olsapi.util.WebResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("训练营服务")
@RestController
@RequestMapping("/v1/traincamp")
public class TrainCampController {

    @Autowired
    private TrainCampService trainCampService;

    @ApiOperation(value = "add 训练营")
    @PostMapping("/add")
    public WebResponse createTrainCamp(TrainCampSimpleInfo simpleInfo) throws OlsServiceException {
        trainCampService.create(simpleInfo);
        return WebResponseBuilder.SUCCESS();
    }


    @ApiOperation(value = "可参加训练营列表")
    @GetMapping("/list")
    public WebResponse<List<TrainCampSimpleInfo>> listAvailableTrainCamp() {
        return WebResponseBuilder.build(trainCampService.list());
    }

}
