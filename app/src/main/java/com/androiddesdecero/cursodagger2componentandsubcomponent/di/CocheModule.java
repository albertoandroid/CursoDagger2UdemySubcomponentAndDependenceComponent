package com.androiddesdecero.cursodagger2componentandsubcomponent.di;

import com.androiddesdecero.cursodagger2componentandsubcomponent.Coche;
import com.androiddesdecero.cursodagger2componentandsubcomponent.Motor;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 5/1/19.
 */

@Module
public class CocheModule {

    @Provides
    public Coche prividesCocheMotorDiesel(Motor motor){
        return new Coche(motor);
    }

    @Named("coche_electrico")
    @Provides
    public Coche prividesCocheMotorElectrico(@Named("electrico")Motor motor){
        return new Coche(motor);
    }

    @Named("coche_gasolina")
    @Provides
    public Coche prividesCocheMotorGasolina(@Named("gasolina")Motor motor){
        return new Coche(motor);
    }
}
