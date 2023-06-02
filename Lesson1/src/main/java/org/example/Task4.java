package org.example;

public class Task4 {
    public void callCalculator(double num1, double num2, char op) {
        double result = 0;

        switch (op) {
            // case to add two numbers
            case '+':
                result = num1 + num2;
                break;

            // case to subtract two numbers
            case '-':
                result = num1 - num2;
                break;

            // case to multiply two numbers
            case '*':
                result = num1 * num2;
                break;

            // case to divide two numbers
            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("You enter wrong input");
        }

        System.out.println("The final result:");
        System.out.println();

        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                + " = " + result);
    }
}
