package com.company;

public class Main {
    public static void main(String[] args) {


        Toyota toyota = new Toyota();
        printInfo(toyota);
        Ford ford = new Ford();
        printInfo(ford);
    }

    private static void printInfo(Car car) {
        System.out.println(car.getYear() + " " + car.getColor() + " " + car.getVolume());
        car.m1(2015, "White", 3.5);
        car.m2(2.5, 2017, "Black");
    }
}















