package com.company.mehranalam;

import java.util.ArrayList;

public class List {
    private ArrayList<String> listOfCalla = new ArrayList<String>();

    public void addItem(String item) {
        listOfCalla.add(item);
    }

    public void removeItem(String item) {
        int indexOfItem = listOfCalla.indexOf(item);
        listOfCalla.remove(indexOfItem);

    }

    public void showItem() {
        for (int i = 0; i < listOfCalla.size(); i++) {
            System.out.println(i + ". "+listOfCalla.get(i));
        }
    }
}
