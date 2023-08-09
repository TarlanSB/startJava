package com.startjava.lesson_2_3_4.calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalculatorTest {

    static NumberFormat nf = NumberFormat.getInstance();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение в формате: 2 ^ 10 ");
                String mathExpression = scanner.nextLine();
                double result = Calculator.calculate(mathExpression);
                output(mathExpression, result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine().toLowerCase();
        } while (!answer.equals("no"));
    }

    static void output(String mathExpression, double result) {
        System.out.println((result != Double.MIN_VALUE) ? mathExpression + " = " + nf.format(result) : "");
    }
}