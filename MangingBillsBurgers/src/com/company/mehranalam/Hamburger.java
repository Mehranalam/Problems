package com.company.mehranalam;

public class Hamburger {
    // when add additional .,, also add to price and hamburger ..

    private boolean isAdditional = false;
    private String beard;
    private String roll;
    private String type;
    private String meat; // + 4 additional
    //////////////////////////////
    private String lettuce = "null";
    private String tomato = "null";
    private String carrot = "null";

    public Hamburger(String beard ,String roll ,String type ,String meat ,boolean isAdditional){
        this.beard = beard;
        this.roll = roll;
        this.type = type;
        this.meat = meat;
        this.isAdditional = isAdditional;
    }
    public String yourPrice(int count){
        int finalPrice = 0;//$
        // base hambutger is 5$
        if(isAdditional){
            finalPrice += count;
        }

        finalPrice += 5;
        return "your final price is "+finalPrice+"$";
    }
    public String yourPrice(){
        int finalPrice = 0;//$
        // base hambutger is 5$
        if(isAdditional){
            finalPrice += 2;
        }

        finalPrice += 5;
        return "your final price is "+finalPrice+"$";
    }

    public void wentAdditional(String lettuce ,String tomato ,String carrot){
        if (isAdditional){
            this.carrot = carrot;// 2$
            this.lettuce = lettuce;// 2$
            this.tomato = tomato;// 2$
            yourPrice(6);
        }else {
            System.out.println("oh you dont have requests ... please isAdditinols tobe true ..");
        }
    }
    public void wentAdditional(String lettuce ,String tomato){
        if (isAdditional){
            this.lettuce = lettuce;
            this.tomato = tomato;
            yourPrice(4);
        }else {
            System.out.println("oh you dont have requests ... please isAdditinols tobe true ..");
        }
    }
    public void wentAdditional(String lettuce){
        if (isAdditional){
            this.lettuce = lettuce;
            yourPrice(2);
        }else {
            System.out.println("oh you dont have requests ... please isAdditinols tobe true ..");
        }
    }
}
