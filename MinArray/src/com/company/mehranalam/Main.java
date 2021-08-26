package com.company.mehranalam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("final Answer is "+findMin(readIntegers(4)));
    }

    public static int[] readIntegers(int count){
        int[] listOfIntegersNumber = new int[count];
        Scanner inputUser = new Scanner(System.in);
        int i = 0;
        do {
            System.out.print("please Enter "+i+" number : ");
            int number = inputUser.nextInt();
            listOfIntegersNumber[i] = number;
            i++;
        }while (i < count);

        return listOfIntegersNumber;
    }

    public static int findMin(int[] array){
        int min = 999999999;
        for (int i = 0;i < array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }

        return min;
    }
}
