package org.example;

public class Task2 {
    public void improveSampleCode() {
        int[] intArray = new int[] {2, 4, 8, 1, 5, 7, 8, 5, 9, 20, 32};
        int d = 0;
        int index = 8;
        double catchedRes1 = 0;
        if (d == 0) {
            System.out.println("Denominator can not be zero.");
        } else if (intArray == null) {
            System.out.println("Array is null.");
        } else if (index < 0 || index >= intArray.length) {
            System.out.println("Index out of range.");
        } else {
            catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }

}
