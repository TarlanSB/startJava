package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    int[] storage = new int[10];
    private int number;
    int indexStorage;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getStorage() {
        if (storage[indexStorage] != 0) {
            return Arrays.copyOf(storage, indexStorage + 1);
        } else {
            return Arrays.copyOf(storage, indexStorage);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void addNum(int index, int num) {
        storage[index] = num;
    }
}
