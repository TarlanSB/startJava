package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        String answer = "";
       
        while (!answer.equals("no")) {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите знак математической операции: ");
            char mathOperator = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            calculator.calculate(num1, num2, mathOperator);
    
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}