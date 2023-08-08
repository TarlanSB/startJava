package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] elements = expression.split(" ");
        double result = 0;

        try {
            if (elements.length > 3) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int firstNumber = Integer.parseInt(elements[0]);
            String sign = elements[1];
            int secondNumber = Integer.parseInt(elements[2]);
            checkNumbers(firstNumber, secondNumber);

            return result = switch (sign) {
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                case "^" -> Math.pow(firstNumber, secondNumber);
                case "%" -> firstNumber % secondNumber;
                case "/" -> (double) firstNumber / secondNumber;
                default -> {
                    System.out.println("Ошибка: знак " + sign + " не поддерживается");
                    yield Double.MIN_VALUE;
                }
            };
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Длина выражение больше, чем требуется - " +
                    "математическое выражение должно быть в формате: \"2 ^ 10\"");
        } catch (NumberFormatException e) {
            System.out.println("Недопустимы ввод - числа должны быть от 1 до 100 включительно");
        }
        return result;
    }

    public static boolean checkNumbers(int number1, int number2) {
        if ((number1 > 0 && number1 <= 100) && (number2 > 0 && number2 <= 100)) {
            return true;
        } else {
            throw new NumberFormatException();
        }
    }
}

