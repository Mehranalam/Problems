package com.company.mehranalam;

public class Main {

    public static void main(String[] args) {
	    // pattern : 2 , -4 , 8 , -16 , ...
        // sum 100 part ... by formula
        int n = 0;
        long first = 1;
        long sum = 0;
        while (n < 10){
            long second =(long) first * -2;
            System.out.println("number is "+second);
            sum += second;
            first = second;
            n++;
        }
        // with formula ...
        int withFormula = snFormula(1 , -2 , 10);

        System.out.println("with formula : "+ withFormula);
        System.out.println("without formula : "+ sum);
    }

    public static int snFormula(int A1 , int d , int count){
        int formula = A1 * (1 - d^count) / (1 - d);

        return formula;
    }
}
