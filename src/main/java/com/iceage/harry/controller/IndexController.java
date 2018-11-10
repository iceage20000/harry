package com.iceage.harry.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author Harry Feng
 * since 11/10/2018
 */
@Api(description = "hello")
@RestController
@Slf4j
public class IndexController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World！";
    }

    @PostMapping("/github-webhook")
    public String hook() {
        log.info("webhook");
        return "webhook";
    }

}
