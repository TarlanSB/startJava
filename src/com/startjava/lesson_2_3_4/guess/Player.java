package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;

    private int[] storage = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getStorage() {
        return Arrays.copyOf(storage, storage.length);
    }

    public void setStorage(int index, int value) {
        storage[index] = value;

    }
}