package com.yyit.springoauthresourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yyit
 */
@RestController
public class HelloRest {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

}
