package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        while (!answer.equals("no")) {
            System.out.print("Введите математическое выражение в формате: 2 ^ 10 ");
            String mathExpression = scanner.nextLine();

            calculator.calculate(mathExpression);
            calculator.output();

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}