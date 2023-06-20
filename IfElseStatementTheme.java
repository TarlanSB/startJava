public class IfElseStatementTheme {

    public static void main(String[] args) {
        int age = 3;
        String sex = "Male";
        double hight = 1.8;
        String name = "Peter";

        System.out.println("1.Перевод псевдокода на язык Java\n");

        if (age > 20) {
            System.out.println("Возраст больше 20 лет и составляет " + age);
        } else {
            System.out.println("Возраст меньше или равен 20 лет");
        }

        if (!sex.equals("Male")) {
            System.out.println("Пол - женский");
        } else {
            System.out.println("Пол мужской");
        }

        if (hight < 1.8) {
            System.out.println("Рост меньше 1.8 м");
        } else {
            System.out.println("Рост равен или больше 1.8 м");
        }

        if (name.charAt(0) == 'M') {
            System.out.println("Имя начинается на букву \"М\"");
        } else if (name.charAt(0) == 'I') {
            System.out.println("Имя начинается на букву \"I\"");
        } else {
            System.out.println("Первая буква имени не \"М\" и не \"I\"");
        }

        System.out.println("\n\n2.Поиск max и min числа\n");

        int num1 = 20;
        int num2 = 25;

        if (num1 - num2 > 0) {
            System.out.println("Первое число больше второго.");
        } else if (num1 - num2 < 0) {
            System.out.println("Второе число больше первого.");
        } else {
            System.out.println("Числа равны.");
        }

        System.out.println("\n\n3.Проверка числа\n");

        int num5 = 5;

        if (num5 == 0) {
            System.out.println("Число является нулем");
        } else if (num5 > 0) {
            if (num5 % 2 == 0) {
                System.out.println(num5 + " - положительное четное число ");
            } else {
                System.out.println(num5 + " - положительное нечетное число ");
            }
        } else {
            if (num5 % 2 > 0) {
                System.out.println(num5 + " - отрицательное четное число ");
            } else {
                System.out.println(num5 + " - отрицательное нечетное число ");
            }
        }

        System.out.println("\n\n4.Поиск одинаковых цифр в числах\n");

        int num3 = 123;
        int num4 = 223;

        System.out.println("Исходные числа: " + num3 + " и " + num4);

        boolean numDigit1 = num3 % 10 == num4 % 10;
        boolean numDigit2 = (num3 / 10 % 10) == (num4 / 10 % 10);
        boolean numDigit3 = num3 / 100 == num4 / 100;

        if (numDigit1) {
            System.out.println(num3 % 10 + " - первый разряд одинаковый");
        }

        if (numDigit2) {
            System.out.println(num3 / 10 % 10 + " - второй разряд одинаковый");
        }

        if (numDigit3) {
            System.out.println(num3 / 100 + " - третий разряд одинаковый");
        }

        if (!numDigit1 && !numDigit2 && !numDigit3) {
            System.out.println("Равных чисел нет");
        }

        System.out.println("\n\n5.Определение символа по его коду\n");

        char symbol = '\u0057';

        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("маленькая буква");
        } else if (symbol >= 0 && symbol <= 9) {
            System.out.println("число");
        } else {
            System.out.println ("не буква и не число");
        }

        System.out.println("\n\n6.Подсчет суммы вклада и начисленных банком %\n");

        int deposit = 300_000;
        int interestRate1 = 5;
        int interestRate2 = 7;
        int interestRate3 = 10;
        int interest = 0;

        System.out.println("Сумма вклада: " + deposit);

        if (deposit < 100_000) {
            interest = deposit * interestRate1 / 100;
            System.out.println("Начисленный процент: " + interest);
        } else if (deposit >= 100_000 && deposit < 300_000) {
            interest = deposit * interestRate2 / 100;
            System.out.println("Начисленный процент: " + interest);
        } else {
            interest = deposit * interestRate3 / 100;
            System.out.println("Начисленный процент: " + interest);
        }

        System.out.println("\n\n7.Определение оценки по предметам\n");

        int historyGrade = 59;
        int programmingGrade = 91;
        int historyMark = 0;
        int programmingMark = 0;

        if (historyGrade <= 60) {
            historyMark = 2;
        } else if (historyGrade > 60 && historyGrade <= 73) {
            historyMark = 3;
        } else if (historyGrade > 73 && historyGrade <= 91) {
            historyMark = 4;
        } else {
            historyMark = 5;
        }

        if (programmingGrade <= 60) {
            programmingMark = 2;
        } else if (programmingGrade > 60 && programmingGrade <= 73) {
            programmingMark = 3;
        } else if (programmingGrade > 73 && programmingGrade <= 91) {
            programmingMark = 4;
        } else {
            programmingMark = 5;
        }

        System.out.println(historyMark + " - история\n" + programmingMark + " - программирование\n"
                + (historyMark + programmingMark) / 2 + " - средний балл оценок по предметам\n"
                + (historyGrade + programmingGrade) / 2 + " - средний % по предметам");

        System.out.println("\n\n8.Расчет прибыли за год\n");

        int rent = 5000;
        int sales = 13000;
        int firstCost = 9000;
        int profit = (sales - (rent + firstCost)) * 12;

        if (profit > 0) {
            System.out.println("Годовая прибыль: +" + profit);
        } else {
            System.out.println("Годовая прибыль: " + profit);
        }

        System.out.println("\n\n9.Подсчет количества банкнот\n");

        int withdrawal = 567;
        int oneDollarBillAtAtm = 50;
        int tenDollarBillAtAtm = 5;
        int hundredDollarBillAtAtm = 10;
        int hundredDollarBill = 0;
        int tenDollarBill = 0;
        int oneDollarBill = 0;
        int hundreds = withdrawal / 100;
        int tens = (withdrawal - hundreds * 100) / 10;
        int ones = withdrawal - hundreds * 100 - tens * 10;
        int cashAtAtm = oneDollarBillAtAtm + tenDollarBillAtAtm * 10 + hundredDollarBillAtAtm * 100;

        if (withdrawal < cashAtAtm) { 
            if (hundreds <= hundredDollarBillAtAtm) { 
                hundredDollarBill = hundreds;
                if (tens <= tenDollarBillAtAtm) {
                    tenDollarBill = tens;
                    if (ones <= oneDollarBillAtAtm) {
                        oneDollarBill = ones;
                    } else {
                        System.out.println("Не хватает банкнот");
                    }
                } else {
                    if (oneDollarBillAtAtm >= ones) {
                        tenDollarBill = tenDollarBillAtAtm;
                        oneDollarBill = withdrawal - hundredDollarBill * 100 - tenDollarBill * 10;
                    } else {
                        System.out.println("Не хватает банкнот");
                    }
                }
            } else {
                if (tenDollarBillAtAtm >= tens) {
                    hundredDollarBill = hundredDollarBillAtAtm;
                    tenDollarBill = tens;
                } else {
                    if (oneDollarBillAtAtm >= ones) {
                        tenDollarBill = tenDollarBillAtAtm;
                        oneDollarBill = withdrawal - hundredDollarBill * 100 - tenDollarBill * 10;
                    } else {
                        System.out.println("Не хватает банкнот");
                    }
                }
            }
        } else {
            System.out.println("Не хватает банкнот");
        }

        System.out.println("Банкнота номиналом 1 доллар: " + oneDollarBill + " шт.\n"
                + "Банкнота номиналом 10 долларов: " + tenDollarBill + " шт.\n"
                + "Банкнота номиналом 100 долларов: " + hundredDollarBill + " шт.\n"
                + "Сумма: " + (oneDollarBill + tenDollarBill * 10 + hundredDollarBill * 100));
    }
}