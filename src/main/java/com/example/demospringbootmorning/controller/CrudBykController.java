package com.example.demospringbootmorning.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;



@RestController
public class CrudBykController {

    ArrayList<String> Byk= new ArrayList<>();
    int i=1;

    //C = CREATE
    @RequestMapping("/addByk/{Name}")
    // url Syntax - localhost:8082/addByk/NinjaX
    public String addByk(@PathVariable String Name){
        Byk.add(Name);
        Name = "Added Byk "+i+" Name : "+Name;
        i++;
        return Name;

    }

    //R = Read
    @RequestMapping("/getByk")
    // url Syntax - localhost:8082/getByk
    public ArrayList<String> getByk(){
        return Byk;
    }

    //U = Update
    @RequestMapping("/updateByk")
    // url Syntax - localhost:8082/updateByk?Name=NinjaY&index=1
    public String updateByk (@RequestParam String Name,@RequestParam int index){
        Byk.set(index,Name);
        return "Byk Name Successfully Updated : At index - "+index+" Name - "+Name;
    }

    //D = Delete
    @RequestMapping("/removeByk/{index}")
    // url Syntax - localhost:8082/removeByk
    public String removeByk(@PathVariable int index){
        Byk.remove(index);
        return "Successfully removed Byk name";
    }
}
