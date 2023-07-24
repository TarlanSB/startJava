package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        String sign = elements[1];
        int firstNumber = Integer.parseInt(elements[0]);
        int secondNumber = Integer.parseInt(elements[2]);
        switch (sign) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "^":
                return Math.pow(firstNumber, secondNumber);
            case "%":
                return firstNumber % secondNumber;
            case "/":
                return (double) firstNumber / secondNumber;
            default:
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                return Double.MIN_VALUE;
        }
    }
}