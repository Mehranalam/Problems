package com.company.mehranalam;

public class Car {
    private boolean engine;
    private int wheel;
    private int cylinders;
    private String name;
    private String appropritate;

    public Car(int cylinders ,String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheel = 4;
    }

    public String getappropritate(){
        return appropritate;
    }

    public String startEngine(){
        return "this called Car.StartEngine and car is turn on ...";
    }

}
