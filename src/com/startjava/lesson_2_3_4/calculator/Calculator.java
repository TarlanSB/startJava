package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] elements = expression.split(" ");
        double result = 0;

        try {
            if (elements.length > 3) {
                throw new ArrayIndexOutOfBoundsException("Длина выражение больше, чем требуется " +
                        "- Математическое выражение должно быть в формате: \"2 ^ 10\"");
            }
            int firstNumber = Integer.parseInt(elements[0]);
            String sign = elements[1];
            String lastNum = String.valueOf(elements.length);
            System.out.println(lastNum);
            int secondNumber = Integer.parseInt(elements[2]);
            boolean isCorrectNumbers = state(firstNumber, secondNumber);
            if (!isCorrectNumbers) {
                throw new NumberFormatException("Недопустимы ввод - числа должны быть от 1 до 100 включительно");
            }

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
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Математическое выражение должно быть в формате: 2 ^ 10");
        } catch (NumberFormatException e) {
            System.out.println("Недопустимы ввод - числа должны быть от 1 до 100 включительно");
        }
        return result;
    }

    public static boolean state(int number1, int number2) {
        return (number1 > 0 && number1 <= 100) && (number2 > 0 && number2 <= 100);
    }
}
