package com.lovepei.sandwich.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cumt_cx on 2017/1/10.
 */
@RestController
public class ControllerTest {
    @Value("${spring.datasource.name}")
    private String datasourceName;

    @RequestMapping("/datasourceName")
    public String getDatasourceName() {
        return datasourceName;
    }
}
