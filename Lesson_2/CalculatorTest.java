import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
       
        while (true) {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите знак математической операции: ");
            char mathOperator = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            calculator.calculate(num1, num2, mathOperator);

            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                
                String carryOn = scanner.next();
                carryOn = carryOn.toLowerCase();

                if (carryOn.equals("yes")) {
                    break;
                } else if (carryOn.equals("no")) {
                    return;
                } else {
                    continue;
                }
            }
        }
    }
}