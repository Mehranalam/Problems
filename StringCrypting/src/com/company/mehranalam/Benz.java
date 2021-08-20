package com.company.mehranalam;

public class Benz extends Car{
    public Benz() {
        super(6, "Benz");
    }

    @Override
    public String startEngine() {
        return "this called Benz.StartEngine() Benz turn on";
    }
}
