package com.sample.springboot.controller;

import com.sample.springboot.domain.Hello;
import com.sample.springboot.domain.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "hello")
public class HelloController {
    @GetMapping()
    public Hello get() {
        return new Hello(0, "Hello Spring Boot!");
    }

    @PostMapping()
    public Hello post(@RequestBody Param param) {
        String msg = "Data1 : " + param.getData1() + ", Data2 : " + param.getData2();
        Hello hello = new Hello(0, msg);
        return hello;
    }
}