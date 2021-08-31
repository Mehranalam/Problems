package com.company.mehranalam;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    private ArrayList<String> contactStore = new ArrayList<String>();
    private ArrayList<String> numberStore = new ArrayList<String>();
    private Scanner inputHandler = new Scanner(System.in);

    public void showContacts() {
        System.out.println(numberStore);
        System.out.println(contactStore);
        if (contactStore.size() > 0 && numberStore.size() > 0) {
            for (int i = 0; i < contactStore.size(); i++) {

                String element = contactStore.get(i);
                String numberPhoneElement = numberStore.get(i);
                System.out.println(i + ". " + element+" ; number phone is "+ numberPhoneElement);
            }
        } else {
            System.out.println("this Array in now **Empty** ....");
        }
    }

    public void addNewContact() {
        // please add name and number phone with this pattern >> NAME : NUMBER
        // such as mehran : +989211756034
        System.out.print("Please Enter your add new name of Contact : ");
        String newItem = inputHandler.nextLine();
        System.out.print("Please Enter your add new number of Contact : ");
        String newNumberPhone = inputHandler.nextLine();
        numberStore.add(newNumberPhone);contactStore.add(newItem);

    }

    public void updateContact() {
        System.out.println("Please Enter **old** name Contact : ");
        String oldItem = inputHandler.next();
        System.out.println("Please Enter new name Contact : ");
        String newItem = inputHandler.next();
        System.out.println("Please Enter new numberPhone Contact : ");
        String numberPhone = inputHandler.next();
        int index = contactStore.indexOf(oldItem);
        contactStore.remove(index);
        numberStore.remove(index);
        contactStore.add(index, newItem);
        numberStore.add(index , numberPhone);
    }

    public void removeContact(String item) {
        int index = contactStore.indexOf(item);
        contactStore.remove(index);
        numberStore.remove(index);
    }

    public void SearchContact() {
        System.out.println("Please Enter contact for search ... : ");
        String contact = inputHandler.next();

        int is_already = contactStore.indexOf(contact);
        String numberPhone = numberStore.get(is_already);
        if (is_already < 0) {
            System.out.println(contact +" not found ...");
        } else {
            System.out.println(contact +" >> "+numberPhone+ "found this element already ..");
        }
    }
}
