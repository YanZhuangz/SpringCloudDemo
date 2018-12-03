package com.yanzhuangz.eurekaclient.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWordController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name){
        return "hi " + name + " ,I am from port:" + port;
    }
}
