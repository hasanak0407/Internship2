package com.example.demo.Services;

import com.example.demo.Fan.Fan;
import com.example.demo.InternshipApplication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class FanServices {
    ArrayList<Fan> fansArrayList = new ArrayList<>();
    public FanServices() {
        int i = 1;
        while (i <= 180) {
            Fan f = new Fan();
            fansArrayList.add(f);
            i++;


        }
    }


    int overAllCount=0;
    int countOfFansOn=0;
    int totalCount=0;

    public void switchOnTheFan(Integer fanNumber){
        Fan f1 = fansArrayList.get(fanNumber);
        if (f1.isOn()==false) {
            System.out.println("Switching on the fan");
            f1.switchOnTheFan();
            overAllCount++;
            countOfFansOn++;
        } else {
            System.out.println("Fan is already running");
        }

    }
    public void switchOff(Integer fanNumber){
        Fan f1 = fansArrayList.get(fanNumber);
        if (f1.isOn() == false) {

            System.out.println("Fan is already off");
            //System.out.println("Switching off the fan");
        } else {
            f1.switchOfTheFan();
            countOfFansOn--;
            overAllCount++;

        }



    }
    public void increaseSpeed(Integer fanNumber){
        Fan f1 = fansArrayList.get(fanNumber);
        f1.increaseSpeed();
        overAllCount++;
        System.out.println("Fan speed is : " + f1.getSpeed());
    }
    public void decreaseSpeed(Integer fanNumber){
        Fan f1 = fansArrayList.get(fanNumber);
        f1.decreaseSpeed();
        overAllCount++;
        System.out.println("Fan speed is : " + f1.getSpeed());
    }
    public void report(){

        System.out.println("No. of fans in switched on status : " + countOfFansOn);
        System.out.println("Total no. of buttons pressed : "+overAllCount);
    }


}
