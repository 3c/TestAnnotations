package com.testannotations.model;

/**
 * Created by cx on 9/7/15.
 */


import javax.inject.Inject;

/**
 * Created by kerry on 14/02/15.
 */
public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}
