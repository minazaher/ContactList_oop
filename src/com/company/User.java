package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class User extends Contact {
    public static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contact> contacts;

    public User(String name, String number) {
        super(name, number);
    }

    public static void showInitialOptions() {
        System.out.println("Choose the Operation You want : ");
        System.out.println("\t1- Manage Contacts\n\t2- Manage Messages\n\t3- Quit ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                ManageContacts();
                break;
            case 2:
                ManageMessages();
                break;
            case 3:
                System.out.println("Bye Bye");
                break;
            default:
                break;
        }
    }

    private static void ManageContacts() {
        System.out.println("\t1- View All Contacts \n\t2- Add a new Contact \n\t3- Search for a contact \n\t4- Delete a contact \n\t5- Go Back ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("showing all Contacts\n----------------");
                showAllContacts();
                showInitialOptions();
                break;

            case 2:
                System.out.println("Adding A new Contact\n----------------");
                addContact();
                showInitialOptions();
                break;
            case 3:
                searchForContact();
                showInitialOptions();
                break;
            case 4:
                removeContact();
                showInitialOptions();
                break;
            default:
                System.out.println("this is default case");
                showInitialOptions();

        }

    }

    private static void showAllContacts() {
        for (Contact c : contacts) {
            System.out.println(c.toString());
        }
    }

    public static void addContact() {
        System.out.println("Enter Contact Name: ");
        String Name = scanner.next();
        System.out.println("Enter Contact Number");
        String Number = scanner.next();
        ArrayList<Message> messages = new ArrayList<>();
        Contact contact = new Contact(Name, Number, messages);
        if (contacts.add(contact)) {
            System.out.println("Added Successfully");
        } else {
            System.out.println("Try Again");
        }
    }

    public static void removeContact() {
        System.out.println("Enter Contact Name");
        String Name = scanner.next();
        for (Contact c : contacts) {
            if (c.getName().equals(Name)) {
                contacts.remove(c.getName());
                System.out.println("Removed Successfully");
                break;
            } else {
                System.out.println("Contact Not Found");
            }
        }
    }

    public static void searchForContact() {
        System.out.println("Enter Contact Name");
        String Name = scanner.next();
        for (Contact c : contacts) {
            if (c.getName().equals(Name)) {
                System.out.println(c);
                break;
            } else
                System.out.println("Contact Not Found");
        }
    }

    private static void ManageMessages() {
        System.out.println("\t1- Send A new Message \n\t2- View All Messages \n\t3- Go Back ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                sendMessage();
                showInitialOptions();
                break;
            case 2:
                viewMessages();
                showInitialOptions();
                break;
            case 3:
                System.out.println("this is default case");
                showInitialOptions();
        }
    }

    private static void viewMessages() {
        for (Contact c : contacts) {
            System.out.println(c.getMessages().toString());
        }
    }

    private static void sendMessage() {
        System.out.println(" Enter The Receiver Name: ");
        String rName = scanner.next();
        for (Contact c : contacts) {
            if (c.getName().equals(rName)) {
                System.out.println("Enter The Message Body : ");
                String Body = scanner.next();
                Message message = new Message(c, Body);
                c.addMessage(message);
            } else {
                System.out.println("Receiver Not Found");
                System.out.println("press 1 to add the contact you want to send a message or press 2 toGo To Main Menu");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Add A new Contact");
                        addContact();
                    case 2:
                        System.out.println("Main Menu");
                        showInitialOptions();
                }
                sendMessage();
            }
        }
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        User.contacts = contacts;
    }
}