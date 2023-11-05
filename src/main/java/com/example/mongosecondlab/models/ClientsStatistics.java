package com.example.mongosecondlab.models;

public class ClientsStatistics {

    private String _id;
    private Double averageBalance;

    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public Double getAverageBalance() {
        return averageBalance;
    }
    public void setAverageBalance(Double averageBalance) {
        this.averageBalance = averageBalance;
    }


    @Override
    public String toString() {
        return "ClientsStatistics{" +
                "_id='" + _id + '\'' +
                ", averageBalance=" + averageBalance +
                '}';
    }
}