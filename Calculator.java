public class Calculator {

    public static void main(String[] args) {
        int inputNum1 = 5;
        int inputNum2 = 5;
        int result = 0;
        char mathOperation = '^';
        
        if (mathOperation != '/') {
            if (mathOperation == '+') {
                result = inputNum1 + inputNum2;
            }
            if (mathOperation == '-') {
                result = inputNum1 - inputNum2;
            }
            if (mathOperation == '*') {
                result = inputNum1 * inputNum2;
            }
            if (mathOperation == '^') {
                int raisedToPowerNum1 = inputNum1;
                for (int i = 1; i < inputNum2; i++) {
                    raisedToPowerNum1 *= inputNum1;
                }
                result = raisedToPowerNum1;
            }
            if (mathOperation == '%') {
                result = inputNum1 % inputNum2;
            }
            System.out.println(inputNum1 + " " + mathOperation + " " + inputNum2 + " = " + result);
        } else if ( inputNum2 != 0 ) {
            result = inputNum1 / inputNum2;
            System.out.println(inputNum1 + " " + mathOperation + " " + inputNum2 + " = " + result);
        } else {
            System.out.println ("На ноль делить нельзя");
        }
    }
}