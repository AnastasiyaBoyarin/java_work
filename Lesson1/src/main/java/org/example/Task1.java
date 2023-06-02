package org.example;

public class Task1 {

    // sum numbers from 1 to n
    public void sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        System.out.println("Sum of " + n + " is " + result);
    }
}
