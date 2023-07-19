package com.startjava.lesson_2_3_4;

public class ArrayTheme {

    public static void main(String[] args) {
        outputReverse();
        productOfNumbers();
        deleteElements();
        outputStairs();
        fillWithUniqueNumbers();
    }

    private static void outputReverse() {
        System.out.println("1.������ �������� �������\n");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        System.out.print("�� �������: ");
        output(numbers);
        System.out.print("����� �������: ");
        reverseArray(numbers);
    }

    private static void output(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void reverseArray(int[] numbers) {
        int maxIndex = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[maxIndex];
            numbers[maxIndex] = temp;
            maxIndex--;
        }
        output(numbers);
    }

    private static void productOfNumbers() {
        System.out.println("\n2.����� ������������ ��������� �������: \n");
        int[] setOfPoints = new int[10];
        int length = setOfPoints.length;
        for (int i = 0; i < length; i++) {
            setOfPoints[i] = i;
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
        System.out.println("\n3.�������� ��������� �������: \n");
        double[] points = new double[15];
        int length = points.length;
        for (int i = 0; i < length; i++) {
            points[i] = Math.random();
        }
        System.out.println("�������� ������:");
        print(points);

        double middleCellValue = points[points.length / 2];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (points[i] > middleCellValue) {
                points[i] = 0;
                count++;
            }
        }
        System.out.println("���������� ������:");
        print(points);
        System.out.println("���������� ���������� �����: " + count);
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
        System.out.println("\n4.����� ��������� ������� ��������\n");
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
        System.out.println("\n5.���������� ������� ����������� �������\n");
        int[] points = new int[30];
        int length = points.length;

        for (int i = 0; i < length; ++i) {
            boolean status;
            do {
                points[i] = (int) (60 + Math.random() * 40);
                status = true;
                for (int j = 0; j < i; ++j) {
                    if ((points[i] == points[j])) {
                        status = false;
                        break;
                    }
                }
            } while (!status);
        }
        sort(points);
        output(points, 10);
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


