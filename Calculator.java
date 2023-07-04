public class Calculator {

    public static void main(String[] args) {
        int inputNum1 = 5;
        int inputNum2 = 5;
        int result = 0;
        char mathOperation = '/';

        if (mathOperation == '+') {
            result = inputNum1 + inputNum2;
        } else if (mathOperation == '-') {
            result = inputNum1 - inputNum2;
        } else if (mathOperation == '*') {
            result = inputNum1 * inputNum2;
        } else if (mathOperation == '^') {
            result = inputNum1;
            for (int i = 1; i < inputNum2; i++) {
                result *= inputNum1;
            }
        } else if (mathOperation == '%') {
            result = inputNum1 % inputNum2;
        } else if (mathOperation == '/') {
            result = inputNum1 / inputNum2;
        }

        System.out.println(inputNum1 + " " + mathOperation + " " + inputNum2 + " = " + result);
    }
}
