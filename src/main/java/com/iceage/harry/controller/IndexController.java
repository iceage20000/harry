package com.iceage.harry.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author Harry Feng
 * since 11/10/2018
 */
@Api(description = "hello")
@RestController
public class IndexController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
