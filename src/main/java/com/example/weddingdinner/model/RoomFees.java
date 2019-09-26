package com.example.weddingdinner.model;

public class RoomFees {

    public int tables;
    private int fees;
    private int hour;
    private int hourprice;


    public RoomFees() {
    }

    public RoomFees(int tables, int fees, int hour, int hourprice) {
        this.tables = tables;
        this.fees = fees;
        this.hour = hour;
        this.hourprice = hourprice;
    }


    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHourprice() {
        return hourprice;
    }

    public void setHourprice(int hourprice) {
        this.hourprice = hourprice;
    }

    @Override
    public String toString() {
        return "RoomFees{" +
                "tables=" + tables +
                ", fees=" + fees +
                ", hour=" + hour +
                ", hourprice=" + hourprice +
                '}';
    }
}
