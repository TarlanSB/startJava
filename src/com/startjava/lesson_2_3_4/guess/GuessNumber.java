package com.startjava.lesson_2_3_4.guess;

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
            if (compareNums(player1, guessedNum)) {
                break;
            }
            if (compareNums(player2, guessedNum)) {
                break;
            }
        }
        output(player1, player2);
    }

    public boolean compareNums(Player player, int guessedNum) {
        int num = inputNum(player);
        if (num == guessedNum) {
            System.out.println("Игрок " + player.getName() + " угадал " + guessedNum
                    + " с " + (player.getAttempt()) + " попытки");
            return true;
        }
        if (num > guessedNum) {
            System.out.println("Число " + num + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
        }
        return false;
    }

    public int inputNum(Player player) {
        System.out.println(player.getName() + " введите число");
        return player.addNum(scanner.nextInt());
    }

    public void output(Player... players) {
        for (Player player : players) {
            System.out.print("Названные числа игрока " + player.getName() + ":");
            for (int element : player.getStorage()) {
                System.out.print(" " + element);
            }
            System.out.println();
            player.clean();
        }
    }
}

