package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String sign;
    private int variables1;
    private int variables2;
    private double result;

    public double calculate(String mathExpression) {
        String[] varsOrSign = mathExpression.split(" ");
        sign = varsOrSign[1];
        variables1 = Integer.parseInt(varsOrSign[0]);
        variables2 = Integer.parseInt(varsOrSign[2]);
        switch (sign) {
            case "+":
                result = variables1 + variables2;
                break;
            case "-":
                result = variables1 - variables2;
                break;
            case "*":
                result = variables1 * variables2;
                break;
            case "^":
                result = Math.pow(variables1, variables2);
                break;
            case "%":
                result = variables1 % variables2;
                break;
            case "/":
                result = (double) variables1 / variables2;
                break;
            default:
                result = Double.MIN_VALUE;
                break;
        }
        return result;
    }

    public void output() {
        if (result != Double.MIN_VALUE) {
            double copyResult = result;
            int sumFractionalPart = 0;
            String stringResult = String.format("%.0f", result);
            for (int i = 0; i < 3; i++) {
                copyResult *= 10;
                sumFractionalPart += (int) (copyResult % 10);
                if (sumFractionalPart > 0) {
                    stringResult = String.format("%.3f", result);
                    break;
                }
            }
            System.out.println(variables1 + " " + sign + " " + variables2 + " = " + stringResult);
        } else {
            System.out.println("Ошибка: знак " + sign + " не поддерживается");
        }
    }
}