package com.example.demospringbootmorning.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CubeController {

    @RequestMapping("/cube")
    public String cube (){
        int num = 7;
        int cube =  num*num*num;
        return "Cube of " + num + " is = " + cube;
    }



}
