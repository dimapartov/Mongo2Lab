package com.example.mongosecondlab.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "clients")
public class Client {

    @Id
    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private String status;
    private Account[] accounts;
    private int index;

    public Client(String name, String surname, String patronymic, String status, Account[] accounts, int index) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.status = status;
        this.accounts = accounts;
        this.index = index;
    }
    public Client() {}

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public String getStatus() {
        return status;
    }
    public Account[] getAccounts() {
        return accounts;
    }
    public int getIndex() {
        return index;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", status='" + status + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                ", index=" + index +
                '}';
    }
}