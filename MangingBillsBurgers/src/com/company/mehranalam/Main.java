package com.company.mehranalam;

public class Main {

    public static void main(String[] args) {
        Hamburger BillsStore = new Hamburger("fantezy" ,"with holg" ,"yoy" ,
                                        "sheep" ,false);

        BillsStore.wentAdditional("toto");
        String myPrice = BillsStore.yourPrice();
        System.out.println(myPrice);
    }
}
