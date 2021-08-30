package com.company.mehranalam;

import java.util.Scanner;

public class MobilePhone extends Contact{
    private Scanner inputUser = new Scanner(System.in);

    public void runApp(boolean is_notStop){
        mainMenu();
        System.out.print("Please Enter your number choose : ");
        int choose = inputUser.nextInt();
        while (is_notStop){
            switch (choose){
                case 1:
                    mainMenu();
                    System.out.println("Please Enter your number choose : ");
                    choose = inputUser.nextInt();
                    inputUser.nextLine();
                    break;
                case 2:
                    showContacts();
                    System.out.println("Please Enter your number choose : ");
                    choose = inputUser.nextInt();
                    inputUser.nextLine();
                    break;
                case 3:
                    System.out.println("Please Enter your add new Contect : ");
                    String newItem = inputUser.nextLine();
                    inputUser.nextLine();
                    super.addNewContact(newItem);
                    System.out.println("Please Enter your number choose : ");
                    choose = inputUser.nextInt();
                    inputUser.nextLine();
                    break;
                case 4:
                    super.updateContact();
                    System.out.println("Please Enter your number choose : ");
                    choose = inputUser.nextInt();
                    inputUser.nextLine();
                    break;
                case 5:
                    System.out.println("Please Enter Element for remove : ");
                    String item = inputUser.nextLine();
                    super.removeContact(item);
                    System.out.println("Please Enter your number choose : ");
                    choose = inputUser.nextInt();
                    inputUser.nextLine();
                    break;
                case 6:
                    super.SearchContact();
                    System.out.println("Please Enter your number choose : ");
                    choose = inputUser.nextInt();
                    inputUser.nextLine();
                    break;
                case 7:
                    is_notStop = false;
                    break;
            }
        }
    }
    public void mainMenu(){
        System.out.println("Menu:");
        System.out.println("\t1.show menu .");
        System.out.println("\t2.print list of contacts .");
        System.out.println("\t3.add new contacts .");
        System.out.println("\t4.update existing contact .");
        System.out.println("\t5.remove Contact .");
        System.out.println("\t6.search/find contact .");
        System.out.println("\t7.Quit from this app");
    }
}
