package com.example.demospringbootmorning.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PercentageController {

    @RequestMapping("/percentage")
    public String percentage (){
        double num = 5000, per = 50;
        double result = (num*per)/100;

        return per+" Percentage is "+num+" is : "+result;
    }


    // Using Path Variable
    @RequestMapping("/percent/{number}/{per}")
    public String percent (@PathVariable double number,@PathVariable double per){
        double percentage = (number*per)/100;
        return per+" Percentage is "+number+" is : "+percentage;
    }

    // Using Request Param

    //url syntax - http://localhost:8082/percent?number=2300&per=12
    @RequestMapping("/percent")
    public String percentparam (@RequestParam int number, @RequestParam int per){
        double percentage = (double) (number*per)/100;
        return per+" Percentage is "+number+" is : "+percentage;
    }
}
