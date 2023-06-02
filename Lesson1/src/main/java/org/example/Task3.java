package org.example;

public class Task3 {

    private boolean isPrime(int n) {
        // Check if number is <= 1
        if (n <= 1) return false;

        // Check for factors
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public void displayPrimeNumbers() {
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
