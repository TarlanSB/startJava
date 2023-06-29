public class CyclesTheme {
    public static void main(String[] args) {

        System.out.println("1.Подсчет суммы четных и нечетных чисел\n");

        int startSegment = -10;
        int endSegment = 21;
        int evenNumSum = 0;
        int oddNumSum = 0;
        int counter = startSegment;

        do {
            if (counter % 2 == 0) {
                evenNumSum += counter;
            } else {
                oddNumSum += counter;
            }
        } while (counter++ < endSegment);

        System.out.println("В промежутке [" + startSegment + ", " + endSegment + "] сумма четных чисел = " 
                + evenNumSum + ", а нечетных = " + oddNumSum);

        System.out.println("\n\n2.Вывод чисел в интервале (min и max) в порядке убывания\n");

        int point1 = 10;
        int point2 = 5;
        int point3 = -1;
        int max = point1;
        int min = point2;

        if (min > max) {
            max = min;
            min = max;
        }
        if (point3 > max) {
            max = point3;
        }
        if (point3 < min) {
            min = point3;
        }

        System.out.println("Минимальное число = " + min + ", максимальное число = "+ max);

        int intervalPoint = max - 1;

        while (intervalPoint > min) {
            System.out.print(intervalPoint);
            intervalPoint--;
        }

        System.out.println("\n\n\n3.Вывод реверсивного числа и суммы его цифр\n");

        int num =  1234;
        int sum = 0;

        while (num > 0) {
            int reverseNum = num % 10;
            sum += reverseNum;
            num /= 10;

            System.out.print(reverseNum);
        }

        System.out.println("\nСумма цифр реверсивного числа = " + sum);

        System.out.println("\n\n4.Вывод чисел на консоль в несколько строк\n");

        int startPoint = 1;
        int endPoint = 30;
        int counter1 = 0;

        for (int i = startPoint; i < endPoint; i += 2) {
            System.out.printf("%5d", i);
            if (counter1 > 3) {
                System.out.println();
                counter1 = -1;
            } 
            counter1++;
        }

        int missingNumZero = 5 - (endPoint / 2) % 5;

        if (missingNumZero < 5) {
            for (int i = 0; i < missingNumZero; i++) {
                System.out.printf("%5d", 0);
            }
        }

        System.out.println("\n\n\n5.Проверка количества двоек на четность/нечетность\n");

        int num1 = 3242592;
        int counterTwos = 0;
        int copyNum1 = num1;

        while (copyNum1 > 0) {
            if (copyNum1 % 10 == 2) {
                counterTwos++;
            }
            copyNum1 /= 10;
        }

        String status = "четное";

        if (counterTwos % 2 != 0) {
            status = "нечетное";
        }

        System.out.println("Число " + num1 + " содержит " + counterTwos 
            + " (" + status + ") количество двоек");

        System.out.println("\n\n6.Отображение фигур в консоли\n");

        for (int i = 0; i < 5; i++) {
            System.out.print("*");
                for (int j = 0; j < 9; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }

        int cathet1 = 5;

        while (cathet1 > 0) {
            int cathet2 = 0;
            while (cathet2 < cathet1) {
                System.out.print("#");
                cathet2++;
            }
            System.out.println();
            cathet1--;
        }

        int side1 = 1;

        do {
            int side2 = 1;
            do {
                System.out.print("$");
            } while (side2++ < side1);
            System.out.println();
        } while (side1++ < 3); 

        side1 = 2;

        do {
            int side2 = 1;
            do {
                System.out.print("$");
            } while (side2++ < side1);
            System.out.println();
        } while (side1-- > 1);

        System.out.printf("%n%n7.Отображение ASCII-символов" 
                + "%n%n%11s%11s%n", "DECIMAL", "CHARACTER");

        for (int i = 33; i < 48; i++) {
            char symbol = (char) i;
            if (i % 2 != 0) {
                   System.out.printf("%11s%11s%n", i, symbol);
            }
        }

        for (int j = 98; j < 123; j++) {
            char littleLetter = (char) j;
            if (j % 2 == 0) {
                System.out.printf("%11s%11s%n", j, littleLetter);
            }
        }

        System.out.println("\n\n8.Проверка, является ли число палиндромом\n");

        int num2 = 1234321;
        int sum2 = 0;

        for (int i = num2; i > 0; i /= 10) {
            sum2 = sum2 * 10 + i % 10;
        }

        System.out.printf("Число " + num2);

        if (sum2 == num2) {
            System.out.println(" является палиндромом");
        } else {
            System.out.println(" не является палиндромом");
        }

        System.out.println("\n\n9.Определение, является ли число счастливым\n");

        int num3 = 123456;
        int threeNum1 = num3 / 1000;
        int sum3 = 0;
        int copyThreeNum1 = threeNum1;

        for (int i = 0; i < 3; i++) {
            sum3 += (copyThreeNum1 % 10);
            copyThreeNum1 /= 10;
        }

        System.out.println("Сумма цифр " + threeNum1 + " равна " + sum3);

        int sum4 = 0;
        int threeNum2 = num3 % 1000;
        int copyThreeNum2 = threeNum2;

        for (int i = 0; i < 3; i++) {
            sum4 += (copyThreeNum2 % 10);
            copyThreeNum2 /= 10;
        }

        System.out.println("Сумма цифр " + threeNum2 + " равна " + sum4
                + "\nЧисло " + num3 + " является " 
                + (sum3 == sum4 ? "счастливым" : "несчастливым"));

        System.out.printf("%n%n10.Вывод таблицы умножения Пифагора" 
                + "%n%n%25s%n", "ТАБЛИЦА   ПИФАГОРА");

       for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.printf("%4s", "|");
            } else {
                System.out.printf("%3d%s", i, "|");
            }

            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
                if (i == 1 && i * j == 9) {
                    System.out.printf("%n%s","----------------------------");
                }
            }
            
            System.out.println();
        }
    }
}