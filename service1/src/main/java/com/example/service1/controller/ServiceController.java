/*
 * @ (#) $NAME.java         3/18/2024
 *
 * Copyright (c) 2024 IUH.
 *
 */

package com.example.service1.controller;

/*
 * @description: ...
 * @author: Vinh Trung Pham
 * @studentID: 20119821
 * @date: 3/18/2024
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/")
public class ServiceController {
    @GetMapping(name = "/say", value = "/say")
    public String hello() {
        return "Hello from Service1";
    }
}
