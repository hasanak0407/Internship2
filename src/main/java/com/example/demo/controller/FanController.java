package com.example.demo.controller;

import com.example.demo.Services.FanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FanController {
    private FanServices fanServices;
    @Autowired
    public FanController(FanServices fanServices){
        this.fanServices=fanServices;
    }
    @GetMapping("/fan/switchon/{fanNumber}")
    public void switchOn(@PathVariable Integer fanNumber){
        System.out.println("Fan number to switch on : "+ fanNumber);
        fanServices.switchOnTheFan(fanNumber);
    }
    @GetMapping("/fan/switchoff/{fanNumber}")
    public void switchOff(@PathVariable Integer fanNumber){
        fanServices.switchOff(fanNumber);

    }
    @GetMapping("/fan/increasespeed/{fanNumber}")
    public void increaseSpeed(@PathVariable Integer fanNumber){
        fanServices.increaseSpeed(fanNumber);


    }
    @GetMapping("/fan/decreasespeed/{fanNumber}")
    public void decreaseSpeed(@PathVariable Integer fanNumber){
        fanServices.decreaseSpeed(fanNumber);

    }
    @GetMapping("/fan/report")
    public void report(){
        fanServices.report();

    }

}
