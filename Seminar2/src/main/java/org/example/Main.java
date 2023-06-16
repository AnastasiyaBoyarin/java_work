package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task1
        Task1 task1 = new Task1();
        task1.getFloatNumber();

        // Task2
        Task2 task2 = new Task2();
        task2.improveSampleCode();

        // Task3
        Task3 task3 = new Task3();
        task3.improveSampleCode();

        // Task4
        Task4 task4 = new Task4();
        Scanner sc = new Scanner(System.in);
        Boolean isExit = false;

        while (!isExit) {
            System.out.print("Enter data: ");
            String data = sc.nextLine();
            try {
                task4.isDataEmpty(data);
                isExit = true;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}