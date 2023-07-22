package com.startjava.lesson_2_3_4;

public class ArrayTheme {

    public static void main(String[] args) {
        reverseArray();
        productOfNumbers();
        deleteElements();
        outputStairs();
        fillWithUniqueNumbers();
    }

    private static void reverseArray() {
        System.out.println("1.Реверс значений массива\n");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        System.out.print("До реверса: ");
        output(numbers);
        System.out.print("После реверса: ");
        reverse(numbers);
    }

    private static void reverse(int[] numbers) {
        int maxIndex = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[maxIndex];
            numbers[maxIndex] = temp;
            maxIndex--;
        }
        output(numbers);
    }

    private static void output(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void productOfNumbers() {
        System.out.println("\n2.Вывод произведения элементов массива: \n");
        int[] multipliers = new int[10];
        int length = multipliers.length;
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }

        StringBuilder sb = new StringBuilder();
        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= i;
            sb.append(i).append(i != length - 2 ? " * " : " = ");
        }
        System.out.println(sb + "" + result);
    }

    private static void deleteElements() {
        System.out.println("\n3.Удаление элементов массива: \n");
        double[] randomNumbers = new double[15];
        int length = randomNumbers.length;
        for (int i = 0; i < length; i++) {
            randomNumbers[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        print(randomNumbers);

        double middleCellValue = randomNumbers[randomNumbers.length / 2];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (randomNumbers[i] > middleCellValue) {
                randomNumbers[i] = 0;
                count++;
            }
        }
        System.out.println("Измененный массив:");
        print(randomNumbers);
        System.out.println("Количество обнуленных ячеек: " + count);
    }

    private static void print(double[] numbers) {
        int indexMiddleArray = numbers.length / 2 - 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i == indexMiddleArray + 2) {
                System.out.println();
            }
            System.out.printf("%.3f%s", numbers[i], " ");
        }
        System.out.println();
    }

    private static void outputStairs() {
        System.out.println("\n4.Вывод элементов массива лесенкой\n");
        char letter = 'A';
        char[] letters = new char[26];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = letter++;
        }
        for (int i = 0; i < letters.length; i++) {
            int length = letters.length;
            for (int j = 0; j <= i; j++) {
                System.out.print(letters[--length]);
            }
            System.out.println();
        }
    }

    private static void fillWithUniqueNumbers() {
        System.out.println("\n5.Заполнение массива уникальными числами\n");
        int[] uniqueNumbers = new int[30];
        int length = uniqueNumbers.length;

        for (int i = 0; i < length; i++) {
            boolean status;
            do {
                uniqueNumbers[i] = (int) (60 + Math.random() * 40);
                status = true;
                for (int j = 0; j < i; j++) {
                    if ((uniqueNumbers[i] == uniqueNumbers[j])) {
                        status = false;
                        break;
                    }
                }
            } while (!status);
        }
        sort(uniqueNumbers);
        output(uniqueNumbers, 10);
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void output(int[] numbers, int amountNumbersInRow) {
        for (int i = 0; i < numbers.length; i++) {
            if (i % amountNumbersInRow == 0) {
                System.out.println();
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}


