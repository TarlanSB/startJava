public class Calculator {

    public void calculate(int inputNum1, int inputNum2, char mathOperation) {
        int result;

        switch(mathOperation) {
            case '+' :
                result = inputNum1 + inputNum2;
                break;
            case '-' :
                result = inputNum1 - inputNum2;
                break;
            case '*' :
                result = inputNum1 * inputNum2;
                break;
            case '^' :
                result = inputNum1;
                for (int i = 1; i < inputNum2; i++) {
                    result *= inputNum1;
                }
                break;
            case '%' :
                result = inputNum1 % inputNum2;
                break;
            case '/' :
                result = inputNum1 / inputNum2;
                break;
            default :
                System.out.println("введенная мат. операция не поддерживается");
                return;
        }

        System.out.println(inputNum1 + " " + mathOperation + " " + inputNum2 + " = " + result);
    }
}