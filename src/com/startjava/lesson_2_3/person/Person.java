package com.startjava.lesson_2_3.person;

public class Person {

    char sex = 'm';
    String name = "Peter";
    double height = 1.75;
    double weight = 75.5;
    int age = 30;

    public void move() {
        System.out.println("идет");
    }

    public void sit() {
        System.out.println("сидит");
    }

    public String run() {
        return "бежит";
    } 

    public String speak() {
        return "говорит";
    }

    public void study() {
        System.out.println("учит Java");
    } 
}