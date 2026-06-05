package com.example.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String colour="white";
    private final Engine engine;
    @Autowired
    public Car(Engine engine){  //Spring injects the Engine bean here //constructor-based injection
        this.engine=engine;
    }
    public String startCar(){
        return engine.start(); //Calling Engine method
    }
    
}
