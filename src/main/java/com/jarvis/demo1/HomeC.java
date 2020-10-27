package com.jarvis.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController
@CrossOrigin
public class HomeC {

    private String uid;

    @RequestMapping("/")
    public String home(){

        System.out.println("HI");
        return "hi";
    }

    @GetMapping("/validate")
    public String validate( String uid,String pwd){
        String id ="admin";
        String password="1234";
        if(id==uid&&password==pwd){
            return ":)";
        }
        else {
            return ":(";
        }
    }

    @GetMapping("/time")
    public LocalTime time(){
        LocalTime myObj = LocalTime.now(); // Create a date object
        System.out.println(myObj);
        return myObj;
    }

    @GetMapping("/date")
    public LocalDate date(){
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj);
        return myObj;
    }
}
