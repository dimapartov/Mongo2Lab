package com.example.mongosecondlab.models;

import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Arrays;

public class Account {

    @Indexed(unique = true)
    private String number;
    private String status;
    private Card[] cards;

    public Account(String number, String status, Card[] cards) {
        this.number = number;
        this.status = status;
        this.cards = cards;
    }
    public Account() {}

    public String getNumber() {
        return number;
    }
    public String getStatus() {
        return status;
    }
    public Card[] getCards() {
        return cards;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", status='" + status + '\'' +
                ", cards=" + Arrays.toString(cards) +
                '}';
    }
}