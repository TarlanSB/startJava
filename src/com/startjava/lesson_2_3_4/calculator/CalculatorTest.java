package com.startjava.lesson_2_3_4.calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        NumberFormat nf = NumberFormat.getInstance();
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение в формате: 2 ^ 10 ");
                String mathExpression = scanner.nextLine();
                double result = calculator.calculate(mathExpression);
                if (result != Double.MIN_VALUE) {
                    System.out.println(calculator.getFirstNumber() + " " + calculator.getSign() + " "
                            + calculator.getSecondNumber() + " = " + nf.format(result));
                }
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine().toLowerCase();
            if (answer.equals("no")) {
                break;
            }
        } while (!answer.equals("no"));
    }
}