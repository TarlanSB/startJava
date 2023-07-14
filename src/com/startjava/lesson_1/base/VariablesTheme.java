package com.startjava.lesson_1.base;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1.Вывод характеристик компьютера\n");

        byte numberOfCpuCores = 4;
        short tdp = 95;
        int frequency = 3700;
        long transistors = 2_411_000_000L;
        float ram = 8.0f;
        double voltage = 1.275;
        char socketNumbers = '1';
        boolean isWindows = true;

        System.out.println(numberOfCpuCores + " - количество процессоров\n"
                + tdp + " W - TDP\n"
                + frequency + " MHz - frequency\n"
                + transistors + " - transistors\n"
                + ram + " Gb - ram\n"
                + voltage + " V - voltage\n"
                + socketNumbers + " - socketNumbers\n"
                + isWindows + " - система Windows");

        System.out.println("\n\n2.Расчёт стоимости товара со скидкой");
     
        int penCost = 100;
        int bookCost = 200;
        int discount = 11;
        int sumWithoutDiscount = penCost + bookCost;
        double discountPrice = (penCost + bookCost) * 11 / 100;

        System.out.println("\nОбщая стоимость товара без скидки: " + sumWithoutDiscount
                + "\nСумма скидки: " + discountPrice
                + "\nОбщая стоимость товаров со скидкой: " + (sumWithoutDiscount - discountPrice));

        System.out.println("\n\n3.Вывод слова JAVA\n"
                + "   J    a  v     v  a\n"
                + "   J   a a  v   v  a a\n"
                + "J  J  aaaaa  V V  aaaaa\n"
                + " JJ  a     a  V  a     a");

        System.out.println("\n\n4.Вывод min и max значений целых числовых типов");
    
        byte byteMaxValue = 127;
        short shortMaxValue = 32767;
        int intMaxValue = Integer.MAX_VALUE;
        long longMaxValue = Long.MAX_VALUE;
    
        System.out.println("\nПервоначальное значение byte: " + byteMaxValue
                + "\nЗначение byte после инкремента: " + (++byteMaxValue)
                + "\nЗначение byte после декремента: " + (--byteMaxValue)
                + "\n\nПервоначальное значение short: " + shortMaxValue
                + "\nЗначение short после инкремента: " + (++shortMaxValue)
                + "\nЗначение short после декремента: " + (--shortMaxValue)
                + "\n\nПервоначальное значение int: " + intMaxValue
                + "\nЗначение int после инкремента: " + (++intMaxValue)
                + "\nЗначение int после декремента: " + (--intMaxValue)
                + "\n\nПервоначальное значение long: " + longMaxValue
                + "\nЗначение long после инкремента: " + (++longMaxValue)
                +"\nЗначение long после декремента: " + (--longMaxValue));

        System.out.println("\n\n5.Перестановка значений переменных");
        int number1 = 2;
        int number2 = 5;

        System.out.println("\nПерестановка значений с помощью третьей переменной:"
                + "\nисходные значения переменных number1 и number2 соответственно: " 
                + number1 + " "+ number2); 

        int tmp = number1;
        number1 = number2;
        number2 = tmp;

        System.out.println("новые значения переменных number1 и number2 соответственно: " 
                + number1 + " " + number2
                + "\n\nПерестановка значений с помощью арифметических операций:"
                + "\nисходные значения переменных number1 и number2 соответственно: " 
                + number1 + " "+ number2); 

        number1 = number2 - number1;
        number2 -= number1;
        number1 += number2;

        System.out.println("новые значения переменных number1 и number2 соответственно: " 
                + number1 + " " + number2
                + "\n\nПерестановка значений с помощью побитовой операции ^:"
                + "\nисходные значения переменных number1 и number2 соответственно: " 
                + number1 + " "+ number2); 

        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;

        System.out.println("новые значения переменных number1 и number2 соответственно: " 
                + number1 + " " + number2);

        System.out.println("\n\n6.Вывод символов и их кодов");

        char symbolNumber = '#';
        char ampersand = '&';
        char atSign = '@';
        char caret = '^';
        char underscore = '_';

        System.out.println("\nКод символа : соответствующий коду символ из ASCII:\n\n" 
                + (int) symbolNumber + " : " + symbolNumber + "\n" 
                + (int) ampersand + " : " + ampersand + "\n" 
                + (int) atSign + " : " + atSign + "\n" 
                + (int) caret + " : " + caret + "\n" 
                + (int) underscore + " : " + underscore);

        System.out.println("\n\n7.Вывод в консоль ASCII-арт Дюка");

        char slash = '/';
        char backSlash = '\\';
        char openBracket = '(';
        char closeBracket = ')';
    
        System.out.println("\n    "+ slash + backSlash + "\n   " 
                + slash + "  " + backSlash + "\n  " 
                + slash + underscore + openBracket + " " + closeBracket + backSlash + "\n " 
                + slash + "      " + backSlash + "\n" 
                + slash + underscore + underscore + underscore + underscore + slash + backSlash 
                + underscore + underscore + backSlash);

        System.out.println("\n\n8.Вывод количества сотен, десятков и единиц числа");

        int number = 123;
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;

        System.out.println("\nЧисло " + number + " содержит:\n"
                + ones + " единиц\n"
                + tens + " десятков\n"
                + hundreds + " сотен"
                + "\nсумма его цифр: " + (ones + tens + hundreds)
                + "\nпроизведение: " + (ones * tens * hundreds));

        System.out.println("\n\n9.Вывод времени");

        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = totalSeconds / 60 % 60;
        int seconds = totalSeconds % 60;

        System.out.println("\n" + hours + ":" + minutes + ":" + seconds);
    }
}