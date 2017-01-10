package com.lovepei.sandwich;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by cumt_cx on 2017/1/9.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
/*    @ResponseBody
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home() {
        return "Hello World!";
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
