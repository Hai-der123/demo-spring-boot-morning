package com.example.demospringbootmorning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalcController {

    @RequestMapping("/add")
    public String add(){
        int a=10;
        int b=15;

        int sum=a+b;

        return "This is Addition "+a+" + "+b+" = "+sum;

    }
    @RequestMapping("/sub")
    public String sub (){
        int a=10;
        int b=5;
        int sub = a-b;

        return "This is Subtraction "+a+" - "+b+" = "+sub;
    }

    @RequestMapping("/multiply")
    public String multiply (){
        int a= 10;
        int b=2;
        int multi = a*b;

        return "This is Multiplication "+a+" * "+b+" = "+multi;
    }
    @RequestMapping("/divide")
    public String divide (){
        double a= 15;
        double b=5;
        double div = a/b;

        return "This is Divide "+a+" / "+b+" = "+div;
    }
}
