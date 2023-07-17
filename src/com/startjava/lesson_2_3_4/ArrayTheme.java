package com.startjava.lesson_2_3_4;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива\n");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        System.out.print("До реверса: ");
        output(numbers);
        System.out.print("После реверса: ");
        reverseArray(numbers);

        System.out.println("\n2.Вывод произведения элементов массива: \n");
        int[] numbers2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        productOfNumbers(numbers2);

        System.out.println("\n3.Удаление элементов массива: \n");
        double[] numbers3 = new double[15];
        deleteElement(numbers3);
    }

    private static void output(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void productOfNumbers(int[] array) {
        StringBuilder stringbuilder = new StringBuilder();
        int result = 1;
        int length = array.length;
        for (int i = 1; i < length - 1; i++) {
            result *= (array[i] != length - 1 ? array[i] : 1);
            stringbuilder.append(i).append(i != length - 2 ? " * " : " = ");
        }
        String string = new String(stringbuilder);
        System.out.println(string + result);
    }

    private static void reverseArray(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length / 2; i++) {
            int tempArray = numbers[i];
            numbers[i] = numbers[length - i - 1];
            numbers[length - i - 1] = tempArray;
        }
        output(numbers);
    }

    private static void deleteElement(double[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            numbers[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        outputThreeDecimalPlaces(numbers);

        int indexMiddleArray = numbers.length / 2;
        double valueMiddleArray = numbers[indexMiddleArray];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] > valueMiddleArray) {
                numbers[i] = 0;
                count++;
            }
        }
        System.out.println("Измененный массив:");
        outputThreeDecimalPlaces(numbers);

        System.out.println("Количество обнуленных ячеек: " + count);
    }

    private static void outputThreeDecimalPlaces(double[] numbers) {
        int indexMiddleArray = numbers.length / 2 - 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i == indexMiddleArray + 2) {
                System.out.println();
            }
            System.out.printf("%.3f%s", numbers[i], " ");
        }
        System.out.println();
    }
}


