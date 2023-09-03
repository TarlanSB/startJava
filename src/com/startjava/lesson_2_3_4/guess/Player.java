package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] storage = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getStorage() {
        return Arrays.copyOf(storage, attempt);
    }

    public int addNum(int num) {
        return storage[attempt++] = num;
    }

    public int getAttempt() {
        return attempt;
    }

    public void clear() {
        Arrays.fill(storage, 0, attempt, 0);
        attempt = 0;
    }
}

