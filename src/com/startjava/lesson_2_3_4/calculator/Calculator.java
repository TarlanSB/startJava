package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String sign;
    private int firstNumber;
    private int secondNumber;

    public String getSign() {
        return sign;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public Calculator() {
    }

    public double calculate(String mathExpression) {
        String[] compositionOfExpression = mathExpression.split(" ");
        sign = compositionOfExpression[1];
        firstNumber = Integer.parseInt(compositionOfExpression[0]);
        secondNumber = Integer.parseInt(compositionOfExpression[2]);
        double result;
        switch (sign) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "^":
                result = Math.pow(firstNumber, secondNumber);
                break;
            case "%":
                result = firstNumber % secondNumber;
                break;
            case "/":
                result = (double) firstNumber / secondNumber;
                break;
            default:
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                result = Double.MIN_VALUE;
                break;
        }
        return result;
    }
}