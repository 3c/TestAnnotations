package com.testannotations.module;

import com.testannotations.model.Vehicle;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by cx on 9/7/15.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();

}