package com.company;

public class CreditCard {
    private long number;

    public CreditCard(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.number);
        return stringBuilder.toString();
    }
}
