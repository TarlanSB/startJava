package com.startjava.lesson_2_3_4.calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalculatorTest {

    static NumberFormat nf = NumberFormat.getInstance();

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение в формате: 2 ^ 10 ");
                String mathExpression = scanner.nextLine();
                output(calculator, mathExpression);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine().toLowerCase();
        } while (!answer.equals("no"));
    }

    static void output(Calculator calculator, String mathExpression) {
        double result = calculator.calculate(mathExpression);
        if (result != Double.MIN_VALUE) {
            System.out.println(mathExpression + " = " + nf.format(result));
        }
    }
}