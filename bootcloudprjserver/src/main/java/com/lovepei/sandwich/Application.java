package com.lovepei.sandwich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;

/**
 * Created by cumt_cx on 2017/1/10.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    void setEnvironment(Environment env) {
        System.out.println("my-config.appName from env: " + env.getProperty("spring.datasource.name"));
    }
}
