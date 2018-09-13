package com.example.demo1.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TargetController {
    @Value("${com.example.demo1.target}")
    String target;

    @Value("${com.example.demo1.desc}")
    String desc;

    @Value("${com.example.demo1.value}")
    String randomString;

    @RequestMapping("target")
    String target(){
        System.out.println("中文输出");
        return target;
    }

    @RequestMapping("desc")
    String printDesc(){
        String randomStringcopy = randomString;
        return desc+"<br/>"+randomString+"<br/>"+randomStringcopy;
    }


}
