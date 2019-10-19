package com.company;

public abstract class Car {
    private int year;
    private String color;
    private double volume;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    public abstract void m1(int i, String white, double v);

    public abstract void m2(double v, int i, String black);
}