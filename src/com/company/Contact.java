package com.company;

import java.util.ArrayList;

public class Contact {
    private String Name ;
    private String Number ;
    ArrayList<Message> messages;

    public Contact(String name, String number) {
        Name = name;
        Number = number;
    }

    public Contact(String name, String number, ArrayList<Message> messages) {
        Name = name;
        Number = number;
        this.messages = messages;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
    public void addMessage(Message m){
        messages.add(m);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Name='" + Name + '\'' +
                ", Number='" + Number + '\'' +
                ", messages=" + messages +
                '}';
    }
}
