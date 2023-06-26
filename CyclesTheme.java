public class CyclesTheme {
    public static void main (String[] args){

        System.out.println("1.Подсчет суммы четных и нечетных чисел\n");

        int num1 = -10;
        int num2 = 21;
        int evenNumSum = 0;
        int oddNumSum = 0;
        int temp = num1;

        do {
            if (temp % 2 == 0) {
                evenNumSum += temp;
            } else {
                oddNumSum += temp;
            }
        } while (temp++ < num2);

        System.out.println("\nВ промежутке [" + num1 + ", " + num2 + "] сумма четных чисел = " 
                + evenNumSum + ", а нечетных = " + oddNumSum);

        System.out.println("\n\n2.Вывод чисел в интервале (min и max) в порядке убывания\n");

        int num3 = 10;
        int num4 = 5;
        int num5 = -1;
        int max = num3;
        int min = num4;

        if (min > max) {
            max = min;
            min = max;
        }
        if (num5 > max) {
            max = num5;
        }
        if (num5 < min) {
            min = num5;
        }

        System.out.println ("Минимальное число = " + min + ", максимальное число = "+ max);

        for (int k = max -1; k > min; k--){
            System.out.print(k);
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр\n");

        int num6 =  1234;
        int sum = 0;

        while (num6 != 0) {
            sum += (num6 % 10);
            int reverseNum =  num6 % 10;
            num6 /= 10;

            System.out.print(reverseNum);

            if (num6 == 0) {
                System.out.println("\nСумма цифр реверсивного числа = " + sum);
            }
        }

        System.out.println("\n\n4.Вывод чисел на консоль в несколько строк\n");

        int num7 = 1;
        int num8 = 24;
        int count = 0;

        for (int i = num7; i < num8; i += 2) {
            if (count < 4) {
                System.out.printf("%5d", i);
            } else {
                System.out.printf("%5d", i);
                System.out.println();
                count = -1;
           }
            count++;
        }

        int missingNumZero = 5 - (num8 / 2) % 5;

        if (missingNumZero < 5) {
            for (int i = 0; i < missingNumZero; i++) {
                System.out.printf("%5d", 0);
            }
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность\n");

        int num9 = 3242592;
        int desiredNum = 2;
        int countTwos = 0;
        int temp2 = num9;

        while (temp2 > 0) {
            if (temp2 % 10 == desiredNum) {
                countTwos++;
            }
            temp2 /= 10;
        }

        String evenOrOddCountTwos = "четное";

        if (countTwos % desiredNum != 0) {
            evenOrOddCountTwos = "нечетное";
        }

        System.out.println("число " + num9 + " содержит " + countTwos + " (" 
            + evenOrOddCountTwos + ") количество " +  desiredNum);

        System.out.println("\n\n6.Отображение фигур в консоли\n");

        for (int i = 0; i < 5; i++) {
            System.out.print("*");
                for (int k = 0; k < 9; k++) {
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

        int verticalLine = 1;

        do {
            int horizontalLine = 1;
            do {
                System.out.print("$");
            } while (horizontalLine++ < verticalLine);
            System.out.println();
        } while (verticalLine++ < 3); 

        verticalLine = 2;

        do {
            int horizontalLine = 1;
            do {
                System.out.print("$");
            } while (horizontalLine++ < verticalLine);
        System.out.println();
        } while (verticalLine-- > 1);

        System.out.println("\n\n7.Отображение ASCII-символов\n");

        System.out.printf("%11s%11s%n", "DECIMAL", "CHARACTER");


        for (int i = 34; i < 48; i++) {
            char symbol = (char) i;
            if (i % 2 == 0) {
                   System.out.printf("%11s%11s%n", i, symbol);
            }
        }

        for (int j = 97; j <= 122; j++) {
            char littleLetter = (char) j;
            if (j % 2 != 0) {
                System.out.printf("%11s%11s%n", j, littleLetter);
            }
        }

        System.out.println("\n\n8.Проверка, является ли число палиндромом\n");

        int num10 = 1234321;
        int sum2 = 0;

        for (int i = num10; i > 0; i /= 10) {
            sum2 = sum2 * 10 + i % 10;
        }
       
        if (sum2 == num10) {
            System.out.println("Число " + num10 + " является палиндромом");
        } else {
            System.out.println("Число " + num10 + " не является палиндромом");
        }

        System.out.println("\n\n9.Определение, является ли число счастливым\n");

        int num11 = 123456;
        int numberOfDigit = 0;

        for (int j = num11; j > (j / 1000); j /= 10) {
            numberOfDigit++;
        }

        numberOfDigit -= 3;

        int firstSum = 0;
        int lastSum = 0;

        for (int i = num11; i > (num11 / 1000); i /= 10) {
            lastSum  += (i % 10);
            firstSum += (num11 / ((int) Math.pow(10, numberOfDigit++))) % 10;
        }

        if (firstSum == lastSum) {
            System.out.println ("Число " + num11 + " является счастливым");
       } else {
            System.out.println ("Число " + num11 + " является несчастливым");
       }

       System.out.println("\n\n10.Вывод таблицы умножения Пифагора\n");

       System.out.printf("%25s%n", "ТАБЛИЦА   ПИФАГОРА");

       for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.printf("%4s", "|");
            } else {
                System.out.printf("%3d%s", i, "|");
            }
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
                if (i == 1 && i*j == 9) {
                    System.out.print("\n");
                    System.out.printf("%s","----------------------------");
                }
            }

            System.out.println();
        }

    }
}