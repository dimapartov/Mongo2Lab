package com.example.mongosecondlab.models;

public class Card {

    private String number;
    private Double balance;

    public Card(String number, Double balance) {
        this.number = number;
        this.balance = balance;
    }
    public Card() {}

    public String getNumber() {
        return number;
    }
    public Double getBalance() {
        return balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}