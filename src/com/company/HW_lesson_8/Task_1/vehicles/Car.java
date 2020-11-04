package com.company.HW_lesson_8.Task_1.vehicles;

import com.company.HW_lesson_8.Task_1.details.Engine;
import com.company.HW_lesson_8.Task_1.professions.Driver;

public class Car {
    private String carModel; //brand of the vehicle
    private String carClass; //executive, luxury, low-price, medium ...
    private int carWeight; //
    private Driver driver;
    private Engine engine;

    public Car(String carModel, String carClass, int carWeight, Driver driver, Engine engine) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.driver = driver;
        this.engine = engine;
    }


    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    void start (){
        System.out.println("let's go!");
    }

    void stop (){
        System.out.println("lay off!");
    }

    void turnRight (){
        System.out.println("a turn to the right");
    }

    void turnLeft (){
        System.out.println("a turn to the left");
    }

    public String printInfo(){
        return carModel + " is " + carClass +
                "car and its weight is " + carWeight +
                "kg. The driver names ";
    }


}
