package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел\n");

        int startSegment = -10;
        int endSegment = 21;
        int sumEvenNums = 0;
        int sumOddNums = 0;
        int counter = startSegment;

        do {
            if (counter % 2 == 0) {
                sumEvenNums += counter;
            } else {
                sumOddNums += counter;
            }
        } while (counter++ < endSegment);

        System.out.println("В промежутке [" + startSegment + ", " + endSegment + "] сумма четных чисел = " 
                + sumEvenNums + ", а нечетных = " + sumOddNums);

        System.out.println("\n\n2.Вывод чисел в интервале (min и max) в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;

        if (min > max) {
            max = min;
            min = max;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num3 < min) {
            min = num3;
        }

        System.out.println("Минимальное число = " + min + ", максимальное число = "+ max);

        for (int i = max - 1; i > min; i--) {
            System.out.print(i);
        }

        System.out.println("\n\n\n3.Вывод реверсивного числа и суммы его цифр\n");

        int num =  1234;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;

            System.out.print(digit);
        }

        System.out.println("\nСумма цифр реверсивного числа = " + sum);

        System.out.println("\n\n4.Вывод чисел на консоль в несколько строк\n");

        int start = 1;
        int end = 30;
        int counter1 = 0;

        for (int i = start; i < end; i += 2) {
            System.out.printf("%5d", i);
            if (counter1 > 3) {
                System.out.println();
                counter1 = -1;
            } 
            counter1++;
        }

        int missingNumZero = 5 - (end / 2) % 5;

        if (missingNumZero < 5) {
            for (int i = 0; i < missingNumZero; i++) {
                System.out.printf("%5d", 0);
            }
        }

        System.out.println("\n\n\n5.Проверка количества двоек на четность/нечетность\n");

        int num4 = 3242592;
        int countTwos = 0;
        int copyNum1 = num4;

        while (copyNum1 > 0) {
            if (copyNum1 % 10 == 2) {
                countTwos++;
            }
            copyNum1 /= 10;
        }

        String status = "четное";

        if (countTwos % 2 != 0) {
            status = "нечетное";
        }

        System.out.println("Число " + num4 + " содержит " + countTwos 
            + " (" + status + ") количество двоек");

        System.out.println("\n\n6.Отображение фигур в консоли\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int numOfRows = 5;

        while (numOfRows > 0) {
            int numOfColumns = 0;
            while (numOfColumns < numOfRows) {
                System.out.print("#");
                numOfColumns++;
            }
            System.out.println();
            numOfRows--;
        }

        int counter2 = 0;
        int num7 = 0;
        boolean current = true;

        do {
            int num8 = 0;

            do {
                System.out.print("$");
            } while (num8++ < num7);

            System.out.println();

            counter2++;

            if (counter2 < 3) {
                current = num7++ < 3;
            } else { 
                current = num7-- > 0;
            }
        } while (current);

        System.out.println("\n\n7.Отображение ASCII-символов\n");

        System.out.printf("%s%10s%n", "DECIMAL", "CHARACTER");

        for (int i = 33; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%6s%11s%n", i, (char) i);
            }
        }

        for (int i = 98; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%6s%11s%n", i, (char) i);
            }
        }

        System.out.println("\n\n8.Проверка, является ли число палиндромом\n");

        int num9 = 1234321;
        int reverseNum = 0;

        for (int i = num9; i > 0; i /= 10) {
            reverseNum = reverseNum * 10 + i % 10;
        }

        System.out.printf("Число " + num9);

        if (reverseNum == num9) {
            System.out.println(" является палиндромом");
        } else {
            System.out.println(" не является палиндромом");
        }

        System.out.println("\n\n9.Определение, является ли число счастливым\n");

        int num10 = 123456;
        int leftHalfNum3 = num10 / 1000;
        int sum3 = 0;
        int copyLeftHalfNum3 = leftHalfNum3;
        int sum4 = 0;
        int rightHalfNum3 = num10 % 1000;
        int copyRightHalfNum3 = rightHalfNum3;

        for (int i = 0; i < 3; i++) {
            sum3 += (copyLeftHalfNum3 % 10);
            copyLeftHalfNum3 /= 10;
            sum4 += (copyRightHalfNum3 % 10);
            copyRightHalfNum3 /= 10;
        }

        System.out.println("Сумма цифр " + leftHalfNum3 + " равна " + sum3 
                + "\nСумма цифр " + rightHalfNum3 + " равна " + sum4
                + "\nЧисло " + num10 + " является " 
                + (sum3 == sum4 ? "счастливым" : "несчастливым"));

        System.out.println("\n\n10.Вывод таблицы умножения Пифагора\n");
        
        System.out.printf("%25s%n", "ТАБЛИЦА   ПИФАГОРА");

        System.out.println("   |  2  3  4  5  6  7  8  9" + "\n" +
        "----------------------------");

        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d%s", i, "|");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}