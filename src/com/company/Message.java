package com.company;

public class Message {
    private User sender;
    private Contact Receiver ;
    private String Body;

    public Message(Contact receiver, String body) {
        Receiver = receiver;
        Body = body;
    }

    public Message(User sender, Contact receiver, String body) {
        this.sender = sender;
        Receiver = receiver;
        Body = body;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Contact getReceiver() {
        return Receiver;
    }

    public void setReceiver(Contact receiver) {
        Receiver = receiver;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender +
                ", Receiver=" + Receiver +
                ", Body='" + Body + '\'' +
                '}';
    }
}

