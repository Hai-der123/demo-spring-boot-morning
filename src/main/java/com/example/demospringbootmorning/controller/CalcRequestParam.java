package com.example.demospringbootmorning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcRequestParam {

    @RequestMapping("/addition_param")
    public String add(@RequestParam int a, @RequestParam int b){
        String output;
        int result=a+b;
        return output = "Addition of "+a+" + "+b+" = "+result;
    }
    @RequestMapping("/subtraction_param")
    public String sub(@RequestParam int a,@RequestParam int b){
        String output;
        int result=a-b;
        return output = "Subtraction of "+a+" - "+b+" = "+result;
    }
    @RequestMapping("/multiplication_param")
    public String mul(@RequestParam int a,@RequestParam int b){
        String output;
        int result=a*b;
        return output = "Multiplication of "+a+" * "+b+" = "+result;
    }
    @RequestMapping("/division_param")
    public String div(@RequestParam int a,@RequestParam int b){
        String output;
        double result=(double) a/b;
        return output = "Division of "+a+" / "+b+" = "+result;

    }
}

