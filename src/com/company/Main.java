package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Mina" , "01271805480");
        if (user.getContacts() == null){
            ArrayList<Contact>contacts = new ArrayList<Contact>();
            user.setContacts(contacts);
        }
        user.showInitialOptions();
    }
}
