package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private final Scanner scanner = new Scanner(System.in);

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        System.out.println("Игра началась! У каждого игрока по 10 попыток");
        int guessedNum = 1 + (int) (Math.random() * 100);

        while (player1.getAttempt() < 10) {
            if (compareNum(player1, guessedNum)) {
                break;
            }
            if (compareNum(player2, guessedNum)) {
                break;
            }
        }
        output(player1, player2);
        clean(player1, player2);
    }

    public boolean compareNum(Player player, int guessedNum) {

        inputNum(player);
        if (namedNum(player) == guessedNum) {
            System.out.println("Игрок " + player.getName() + " угадал " + guessedNum
                    + " с " + (player.getAttempt() + 1) + " попытки");
            return true;
        }
        if (namedNum(player) > guessedNum) {
            System.out.println("Число " + namedNum(player)
                    + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + namedNum(player)
                    + " меньше того, что загадал компьютер");
        }

        player.setAttempt(player.getAttempt() + 1);
        return false;
    }

    public void inputNum(Player player) {
        System.out.println(player.getName() + " введите число");
        player.addNum(scanner.nextInt());
    }

    public int namedNum(Player player) {
        return player.getStorage()[player.getAttempt()];
    }

    public void output(Player... players) {
        for (Player player : players) {
            System.out.print("Названные числа игрока " + player.getName() + ":");
            for (int i = 0; i < player.getStorage().length; i++) {
                if (player.getStorage()[i] != 0) {
                    System.out.print(" " + player.getStorage()[i]);
                }
            }
            System.out.println();
        }
    }

    public void clean(Player... players) {
        for (Player player : players) {
            Arrays.fill(player.getStorage(), 0, player.getAttempt() + 1, 0);
            player.setAttempt(0);
        }
    }
}

