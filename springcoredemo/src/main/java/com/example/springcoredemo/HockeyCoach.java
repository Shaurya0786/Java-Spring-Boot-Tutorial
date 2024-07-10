package com.example.springcoredemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class HockeyCoach implements Coach{
    @Override
    public String dailyworkout(){
        return "4hr Hockey Training";
    }
}
