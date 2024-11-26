package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //inject properties for coach.name and team.name from resources/application.properties file
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String getWelcome(){
        return "Welcome to Earth";
    }

    //expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getWorkout(){
        return "Run a hard 5K!";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is your lucky day.";
    }
}
