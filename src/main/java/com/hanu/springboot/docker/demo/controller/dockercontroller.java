package com.hanu.springboot.docker.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hanumantharao Bitragunta
 */

@RestController
public class dockercontroller {

    @RequestMapping("/greet")
    public String showGreetings() {
        return "<h1>Hey ! congratulations.</h1>";
    }
}
