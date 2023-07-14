package com.startjava.lesson_2_3.guess;

import java.util.Scanner;
import com.startjava.lesson_2_3.guess.Player;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        int guessedNum = 1 + (int) (Math.random() * 100);

        while (true) {
            System.out.println(player1.getName() + " введите число");
            player1.setNumber(scanner.nextInt());

            if (player1.getNumber() == guessedNum) {
                System.out.println(player1.getName() + " Вы победили!");
                break;
            }
            if (player1.getNumber() > guessedNum) {
                System.out.println("Число " + player1.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player1.getNumber() + " меньше того, что загадал компьютер");
            }

            System.out.println(player2.getName() + " введите число");
            player2.setNumber(scanner.nextInt());

            if (player2.getNumber() == guessedNum) {
                System.out.println(player2.getName() + " Вы победили!");
                break;
            }
            if (player2.getNumber() > guessedNum) {
                System.out.println("Число " + player2.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player2.getNumber() + " меньше того, что загадал компьютер");
            }
        }
    }
}