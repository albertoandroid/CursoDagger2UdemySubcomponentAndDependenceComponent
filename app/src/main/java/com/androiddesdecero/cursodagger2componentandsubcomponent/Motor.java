package com.androiddesdecero.cursodagger2componentandsubcomponent;

/**
 * Created by albertopalomarrobledo on 5/1/19.
 */

public class Motor {
    private String tipoMotor;

    public Motor(String tipoMotor){
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor(){
        return ("Motor: " + tipoMotor);
    }
}
