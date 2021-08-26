package com.company.mehranalam;

public class Main {

    public static void main(String[] args) {
	    int[] myArray = {2 , 3 ,5 ,6 ,11 ,9};
	    int[] reverseList = reverseIntegerOfArray(myArray);
	    for (int i = 0;i < reverseList.length;i++){
            System.out.println("Element of "+ i + " and value is "+ reverseList[i]);
        }
    }

    private static int[] reverseIntegerOfArray(int[] array){
        int[] newListOfReversed = new int[array.length];
        int n = 0;
        for (int i = array.length-1;i > -1;i--){
            newListOfReversed[n] = array[i];
            n++;
        }

        return newListOfReversed;
    }
}
