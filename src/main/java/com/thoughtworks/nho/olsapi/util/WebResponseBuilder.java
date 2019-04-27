package com.thoughtworks.nho.olsapi.util;

import com.thoughtworks.nho.olsapi.entity.WebResponse;

import java.util.Date;

public class WebResponseBuilder {

    public static WebResponse SUCCESS(){
        WebResponse response = new WebResponse();
        response.setCode("0");
        response.setMessage("SUCCESS");
        response.setTimeStamp(new Date());
        return response;
    }

    public static <T> WebResponse build(T t){
        WebResponse response = new WebResponse();
        response.setCode("0");
        response.setMessage("SUCCESS");
        response.setTimeStamp(new Date());
        response.setObj(t);
        return response;
    }

    public static WebResponse FAIL(){
        WebResponse response = new WebResponse();
        response.setCode("-1");
        response.setMessage("FAIL");
        response.setTimeStamp(new Date());
        return response;
    }
}
