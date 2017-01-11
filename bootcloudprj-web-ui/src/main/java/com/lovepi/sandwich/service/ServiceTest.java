package com.lovepi.sandwich.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by cumt_cx on 2017/1/11.
 */
@Service
public class ServiceTest {

    @Autowired
    RestTemplate restTemplate;

    private final static String SERVER_NAME = "bootcloudprj-server";

    @HystrixCommand(fallbackMethod = "fallBackSayHello")
    public String getDataBaseSourceName(){
        return restTemplate.getForObject("\"http://\"+SERVICE_NAME+\"/datasourceName",String.class);
    }

    private String fallBackSayHello(){
        System.out.println("HystrixCommand fallbackMethod handle!");
        return "restTmplateFail And retrn back [Hello]";
    }

}
