package com.company;

public class Newspaper {
    Newspaper(String name, int year, int month, int dayOfMonth, boolean isFinnish) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.isFinnish = isFinnish;
    }

    public String toString() {
        return name + ", " + year + ", " + dayOfMonth + ", " + isFinnish;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear() {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setDayOfMonth() {
        this.dayOfMonth = dayOfMonth;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setIsFinnish() {
        this.isFinnish = isFinnish;
    }

    public boolean getIsFinnish() {
        return isFinnish;
    }

    private String name;
    private int year, month, dayOfMonth;
    private boolean isFinnish;
}