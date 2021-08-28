package com.company.mehranalam;

import java.util.Scanner;

public class Main {

    private static Scanner inputUser = new Scanner(System.in);

    public static void main(String[] args) {
        List newEmptyListBuying = new List();
        info();
        System.out.print("your Choose : ");
        int choose = inputUser.nextInt();
        boolean check = true;

        while (check) {
            switch (choose) {
                case 0:
                    info();
                    System.out.print("your Choose : ");
                    choose = inputUser.nextInt();
                    break;
                case 1:
                    System.out.print("Please Add your item : ");
                    String newItem = inputUser.nextLine();
                    inputUser.nextLine();
                    newEmptyListBuying.addItem(newItem);
                    System.out.print("your Choose : ");
                    choose = inputUser.nextInt();
                    break;
                case 2:
                    System.out.print("please Enter your old item for remove : ");
                    String oldItem = inputUser.nextLine();
                    inputUser.nextLine();
                    newEmptyListBuying.removeItem(oldItem);
                    System.out.print("your Choose : ");
                    choose = inputUser.nextInt();
                    break;
                case 3:
                    newEmptyListBuying.showItem();
                    System.out.print("your Choose : ");
                    choose = inputUser.nextInt();
                    break;
                case 4:
                    check = false;
                    break;

            }
        }
    }

    public static void info() {
        System.out.println("Menu :");
        System.out.println("\t0 - show menu .");
        System.out.println("\t1 - add new item .");
        System.out.println("\t2 - remove item from list .");
        System.out.println("\t3 - show items from list .");
        System.out.println("\t4 - quit from this app .");
    }
}
