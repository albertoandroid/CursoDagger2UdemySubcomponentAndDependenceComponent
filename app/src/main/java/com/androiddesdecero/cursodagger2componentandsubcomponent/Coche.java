package com.androiddesdecero.cursodagger2componentandsubcomponent;

/**
 * Created by albertopalomarrobledo on 5/1/19.
 */

public class Coche {

    private Motor motor;

    public Coche(Motor motor){
        this.motor = motor;
    }

    public String getCoche(){
        return ("Coche con " + motor.getTipoMotor());
    }
}
