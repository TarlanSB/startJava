package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток");
        int guessedNum = 1 + (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        boolean state1 = true;

        while (state1) {
            System.out.println(player1.getName() + " введите число");
            player1.setNumber(scanner.nextInt());
            player1.addNum(player1.indexStorage, player1.getNumber());
            boolean state2 = compareNum(player1, player1.indexStorage, player1.getNumber(), guessedNum);
            player1.indexStorage++;
            if (!state2) {
                break;
            }

            System.out.println(player2.getName() + " введите число");
            player2.setNumber(scanner.nextInt());
            player2.addNum(player2.indexStorage, player2.getNumber());
            state1 = compareNum(player2, player2.indexStorage, player2.getNumber(), guessedNum);
            player2.indexStorage++;

            if (player1.indexStorage > 8) {
                output();
                break;
            }
        }
    }

    public void output() {
        System.out.println("Названные числа игрока " + player1.getName() + ": "
                + (Arrays.toString(player1.getStorage()).replaceAll("[\\[\\],]", ""))
                + "\nназванные числа игрока " + player2.getName() + ": "
                + (Arrays.toString(player2.getStorage())).replaceAll("[\\[\\],]", ""));
    }

    public boolean compareNum(Player player, int indexStorage, int playerNumber, int guessedNum) {
        if (playerNumber == guessedNum) {
            System.out.println("Игрок " + player.getName() + " угадал " + guessedNum
                    + " с " + (++indexStorage) + " попытки");
            output();
            return false;
        } else if (playerNumber > guessedNum) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
            return true;
        } else {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
            return true;
        }
    }

    public void clean() {
        Arrays.fill(player1.getStorage(), 0, player1.indexStorage, 0);
        Arrays.fill(player2.getStorage(), 0, player2.indexStorage, 0);
        player1.indexStorage = 0;
        player2.indexStorage = 0;
    }
}

