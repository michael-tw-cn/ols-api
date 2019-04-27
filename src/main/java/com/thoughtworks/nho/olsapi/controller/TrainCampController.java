package com.thoughtworks.nho.olsapi.controller;

import com.thoughtworks.nho.olsapi.entity.TrainCampSimpleInfo;
import com.thoughtworks.nho.olsapi.service.traincamp.TrainCampService;
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
    public void createTrainCamp(TrainCampSimpleInfo simpleInfo) {
        trainCampService.create(simpleInfo);
    }


    @ApiOperation(value = "可参加训练营列表")
    @GetMapping("/list")
    public List<TrainCampSimpleInfo> listAvailableTrainCamp() {
        return trainCampService.list();
    }

}
