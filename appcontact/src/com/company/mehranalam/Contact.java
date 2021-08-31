package com.company.mehranalam;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    private ArrayList<String> contactStore = new ArrayList<String>();
    private ArrayList<String> numberStore = new ArrayList<String>();
    private Scanner inputHandler = new Scanner(System.in);

    public void showContacts() {
        if (contactStore.size() > 0) {
            for (int i = 0; i < contactStore.size(); i++) {

                String element = contactStore.get(i);
                System.out.println(i + ". " + element);
            }
        } else {
            System.out.println("this Array in now **Empty** ....");
        }
    }

    public void addNewContact(String item) {
        // please add name and number phone with this pattern >> NAME : NUMBER
        // such as mehran : +989211756034
        String[] data = item.split(" : ");
        if (data.length > 1){
            contactStore.add(item);
        } else {
            System.out.println("ignore data ... !!!");
        }

    }

    public void updateContact() {
        System.out.println("Please Enter **old** Contact : ");
        String oldItem = inputHandler.next();
        System.out.println("Please Enter new Contact : ");
        String newItem = inputHandler.next();
        int index = contactStore.indexOf(oldItem);
        contactStore.remove(index);
        contactStore.add(index, newItem);
    }

    public void removeContact(String item) {
        int index = contactStore.indexOf(item);
        contactStore.remove(index);
    }

    public void SearchContact() {
        System.out.println("Please Enter contact for search ... : ");
        String contact = inputHandler.next();

        int is_already = contactStore.indexOf(contact);
        if (is_already < 0) {
            System.out.println(contact + " not found ...");
        } else {
            System.out.println(contact + " 1 found this element already ..");
        }
    }
}
