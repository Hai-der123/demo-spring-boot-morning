package com.example.demospringbootmorning.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcPathVariable {

    @RequestMapping("/addition/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){
        String output;
        int result=a+b;
        return output = "This is Addition "+a+" + "+b+" = "+result;
    }
    @RequestMapping("/subtraction/{a}/{b}")
    public String sub(@PathVariable int a,@PathVariable int b){
        String output;
        int result=a-b;
        return output = "This is Subtraction "+a+" - "+b+" = "+result;
    }
    @RequestMapping("/multiplication/{a}/{b}")
    public String mul(@PathVariable int a,@PathVariable int b){
        String output;
        int result=a*b;
        return output = "This is Multiplication "+a+" * "+b+" = "+result;
    }
    @RequestMapping("/division/{a}/{b}")
    public String div(@PathVariable int a,@PathVariable int b){
        String output;
        int result=a/b;
        return output = "This is Division "+a+" / "+b+" = "+result;

    }
}

