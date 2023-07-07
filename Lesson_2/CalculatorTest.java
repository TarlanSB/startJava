import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
       
        OUTER:
        while (true) {
            System.out.print("Введите первое число: ");

            int scanNum1 = scanner.nextInt();

            System.out.print("Введите знак математической операции: ");

            char mathOperator = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");

            int scanNum2 = scanner.nextInt();

            calculator.calculate(scanNum1, scanNum2, mathOperator);

            INNER:
            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                
                String carryOn = scanner.next();
                carryOn = carryOn.toLowerCase();

                if (carryOn.equals("yes")) {
                    continue OUTER;
                } else if (carryOn.equals("no")) {
                    break OUTER;
                } else {
                    continue INNER;
                }
            }
        }
    }
}