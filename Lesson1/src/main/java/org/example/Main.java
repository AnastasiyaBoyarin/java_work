package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1.");
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number1 = scanner.nextInt();

        Task1 task1 = new Task1();
        task1.sum(number1);

        // Task 2
        System.out.println("Task 2.");
        System.out.println("==================================");
        System.out.println("Enter number:");
        int number2 = scanner.nextInt();
        Task2 task2 = new Task2();
        task2.factorial(number2);

        // Task 3
        System.out.println("Task 3.");
        System.out.println("==================================");
        Task3 task3 = new Task3();
        task3.displayPrimeNumbers();

        // Task 4
        System.out.println("Enter the numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Enter the operator (+,-,*,/):");
        char op = scanner.next().charAt(0);

        Task4 task4 = new Task4();
        task4.callCalculator(num1, num2, op);
    }
}