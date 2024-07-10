package com.example.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunControllers {

    private Coach MyCoach;

    @Autowired
    public FunControllers(@Qualifier("cricketCoach") Coach MyCoach){
        this.MyCoach=MyCoach;
    }

    @GetMapping("/workout")
    public String workoutController(){
        return MyCoach.dailyworkout();
    }
}
