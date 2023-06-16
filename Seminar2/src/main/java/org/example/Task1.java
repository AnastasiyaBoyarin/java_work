package org.example;

import java.util.Scanner;

public class Task1 {
    public void getFloatNumber() {
        Scanner sc = new Scanner(System.in);
        Boolean isExit = false;

        while (!isExit) {
            System.out.print("Enter float number: ");
            String num = sc.nextLine();
            try {
                float floatNum = Float.parseFloat(num);
                isExit = true;
                System.out.println("Your number is: " + floatNum);
            } catch (NumberFormatException e) {
                System.out.println("Entered number is not float. Repeat operation:");
            }
        }
    }
}
