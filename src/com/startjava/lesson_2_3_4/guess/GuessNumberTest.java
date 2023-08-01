package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Введите имя (первый игрок)");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();

        System.out.println("Введите имя (второй игрок)");
        String name2 = scanner.next();

        GuessNumber game = new GuessNumber(name1, name2);
        String option = "yes";

        do {
            if (option.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            option = scanner.nextLine().toLowerCase();

        } while (!option.equals("no"));
    }
}