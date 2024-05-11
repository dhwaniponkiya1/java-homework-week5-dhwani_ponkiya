package calculate;

public class Calculator {

    public void division(int a, int b) {
        if (b != 0) {
            int result = a / b;
            System.out.println("Division of " + a + " by " + b + " is: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is: " + result);
    }

    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition of " + a + " and " + b + " is: " + result);
    }

    public void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is: " + result);
    }

    public void calculateResult(int a, int b, char symbol) {
        switch (symbol) {
            case '/':
                division(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            default:
                System.out.println("Invalid symbol. Please use from /, *, + or -.");
        }
    }
}
