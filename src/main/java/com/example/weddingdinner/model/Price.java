package com.example.weddingdinner.model;

public class Price {

    private int max;
    private int min;
    private int person;


    public Price(){

    }
    public Price(int max, int min,int person) {
        this.max = max;
        this.min = min;
        this.person= person;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Price{" +
                "max=" + max +
                ", min=" + min +
                ", person=" + person +
                '}';
    }
}
