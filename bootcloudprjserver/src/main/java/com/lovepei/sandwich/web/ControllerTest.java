package com.lovepei.sandwich.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cumt_cx on 2017/1/10.
 */
@RestController
public class ControllerTest {
    @Value("${spring.datasource.name}")
    private String datasourceName;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/datasourceName")
    public String getDatasourceName() {
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("/datasourceName, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" );
        return datasourceName;
    }
}
