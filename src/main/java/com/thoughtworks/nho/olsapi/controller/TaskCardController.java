package com.thoughtworks.nho.olsapi.controller;

import com.thoughtworks.nho.olsapi.entity.TaskCard;
import com.thoughtworks.nho.olsapi.service.TaskCardService;
import com.thoughtworks.nho.olsapi.util.ResponseCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taskCard")
public class TaskCardController {

    @Autowired
    TaskCardService service;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addTaskCard(@ModelAttribute TaskCard taskCard){

        try {
            service.addTaskCard(taskCard);
            return ResponseCode.SUCCESS;
        }catch (Exception ex){
            System.out.println(ex);
            return ResponseCode.FAILED;
        }
    }
}
