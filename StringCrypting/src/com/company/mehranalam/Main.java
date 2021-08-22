package com.company.mehranalam;

import javax.lang.model.type.NullType;

// polymorphism exercise
public class Main {

    public static void main(String[] args) {
        int n = 1;
        do{ // change
            Car newMachine = generatorClass(n);
            System.out.println(newMachine.startEngine());
            n++;
        }while (n < 4);
    }

    public static Car generatorClass(int number){
        if (number == 1){
            return new BMW();
        } else if(number == 2){
            return new Benz();
        } else{
            return new Car(-1 , "NULL NAME");
        }
    }
}
