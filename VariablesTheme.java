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
        double discountSum = (penCost + bookCost) * 11 / 100;

        System.out.println("\nОбщая стоимость товара без скидки: " + sumWithoutDiscount
                + "\nСумма скидки: " + discountSum
                + "\nОбщая стоимость товаров со скидкой: " + (sumWithoutDiscount - discountSum));

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
        int data1 = 2;
        int data2 = 5;

        System.out.println("\nПерестановка значений с помощью третьей переменной:"
                + "\nисходные значения переменных data1 и data2 соответственно: " + data1 + " "+ data2); 

        int data3 = data1;
        data1 = data2;
        data2 = data3;

        System.out.println("новые значения переменных data1 и data2 соответственно: " + data1 + " " + data2
                + "\n\nПерестановка значений с помощью арифметических операций:"
                + "\nисходные значения переменных data1 и data2 соответственно: " + data1 + " "+ data2); 

        data1 = data2- data1;
        data2 = data2 - data1;
        data1 += data2;

        System.out.println("новые значения переменных data1 и data2 соответственно: " + data1 + " " + data2
                + "\n\nПерестановка значений с помощью побитовой операции ^:"
                + "\nисходные значения переменных data1 и data2 соответственно: " + data1 + " "+ data2); 

        data1 ^= data2;
        data2 ^= data1;
        data1 ^= data2;

        System.out.println("новые значения переменных data1 и data2 соответственно: " + data1 + " " + data2);

        System.out.println("\n\n6.Вывод символов и их кодов");

        char symbol35 = 35;
        char symbol38 = 38;
        char symbol64 = 64;
        char symbol94 = 94;
        char symbol95 = 95;

        System.out.println("\nКод символа : соответствующий коду символ из ASCII:"
                + "\n\n" + (int)symbol35 + " : " + symbol35
                + "\n" + (int)symbol38 + " : " + symbol38
                + "\n" +  (int)symbol64 + " : " + symbol64
                + "\n" + (int)symbol94 + " : " + symbol94
                + "\n" + (int)symbol95 + " : " + symbol95);

        System.out.println("\n\n7.Вывод в консоль ASCII-арт Дюка");

        char forwardSlash = 47;
        char backwardSlash = 92;
        char underscore = 95;
        char openBracket = 40;
        char closeBracket = 41;
    
        System.out.println("\n    "+ forwardSlash + backwardSlash
                + "\n   " + forwardSlash + "  " + backwardSlash
                + "\n  " + forwardSlash + underscore + openBracket + " " + closeBracket + backwardSlash
                + "\n " + forwardSlash + "      " + backwardSlash
                + "\n" + forwardSlash + underscore + underscore + underscore + underscore + forwardSlash + backwardSlash+ underscore + underscore  + backwardSlash);

        System.out.println("\n\n8.Вывод количества сотен, десятков и единиц числа");

        int number = 123;
        int unitsNumber = number % 10;
        int tensNumber = number / 10 % 10;
        int hundredsNumber = number / 100;

        System.out.println("\nЧисло " + number + " сордержит:\n"
                + unitsNumber + " единиц\n"
                + tensNumber + " десятков\n"
                + hundredsNumber + " сотен"
                + "\nсумма его цифр: " + (unitsNumber + tensNumber + hundredsNumber)
                + "\nпроизведение: " + (unitsNumber * tensNumber * hundredsNumber));

        System.out.println("\n\n9.Вывод времени");

        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = totalSeconds % 3600 / 60;
        int seconds = totalSeconds % 3600 % 60;

        System.out.println("\n" + hours + ":" + minutes + ":" + seconds);
    }
}