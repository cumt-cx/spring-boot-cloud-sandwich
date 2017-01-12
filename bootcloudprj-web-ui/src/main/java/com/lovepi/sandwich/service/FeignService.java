package com.lovepi.sandwich.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cumt_cx on 2017/1/12.
 */
@FeignClient(name = "bootcloudprj-server")
public interface FeignService {

    @RequestMapping(value = "/feginCallTest", method = RequestMethod.GET)
    String feginCallTest();
}
