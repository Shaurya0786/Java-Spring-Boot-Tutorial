package com.example.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach{

    @Override
    public String dailyworkout(){
        return "Run for 15Min Daily";
    }
}
