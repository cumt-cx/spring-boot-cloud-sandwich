package com.lovepi.sandwich.web;

import com.lovepi.sandwich.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cumt_cx on 2017/1/11.
 */
@RestController
public class ControllerTest {
    @Autowired
    private ServiceTest serviceTest;

    @RequestMapping(value="/restTempleCall",method = RequestMethod.GET)
    public ResponseEntity<String> restTmpleCall(){
        String callResult = serviceTest.getDataBaseSourceName();
        return new ResponseEntity<String>(callResult, HttpStatus.OK);
    }
}
