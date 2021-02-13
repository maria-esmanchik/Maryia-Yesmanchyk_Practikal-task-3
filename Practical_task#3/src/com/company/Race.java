package com.company;


import java.util.Queue;

public class Race {
    protected Integer number;

    public Race(Integer number) {
        this.number = number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.number);
        return stringBuilder.toString();
    }
}