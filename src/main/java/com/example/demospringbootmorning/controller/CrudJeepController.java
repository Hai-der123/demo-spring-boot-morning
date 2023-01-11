package com.example.demospringbootmorning.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.naming.Name;
import java.util.ArrayList;


@RestController
public class CrudJeepController {

    ArrayList<String> jeeps = new ArrayList<>();

    //C- CREATE
    @RequestMapping("/add_jeeps/{Name}")
    // url Syntax - localhost:8082/add_jeeps/SUV
    public String getjeeps(@PathVariable String Name){
        jeeps.add(Name);

        return "This is a Mahindra jeep : " +Name;
    }

    //R- READ or get
    @RequestMapping("/get_all_jeeps")
    // url Syntax - localhost:8082/get_all_jeeps
    public ArrayList<String> getJeeps(){
        return jeeps;

    }
    //U- UPDATE
    @RequestMapping("/update_jeeps")
    // url Syntax - localhost:8082/update_jeeps?Name=XUV&index=0
    public String update_jeeps(@RequestParam String Name,@RequestParam int index){
        jeeps.set(index, Name);
        return "This name is updated successfully : "+Name;
    }

    //D- DELETE
    @RequestMapping("/delete_jeep/{index}")
    // url Syntax - localhost:8082/remove_jeep/1
    public String delete_jeep(@PathVariable int index){
        jeeps.remove(index);
        return "This name is successfully deleted ";
    }
}

