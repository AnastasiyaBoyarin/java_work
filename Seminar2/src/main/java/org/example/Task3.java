package org.example;

import java.io.FileNotFoundException;

public class Task3 {

    public void improveSampleCode() {
        try {
            int a = 90;
            int b = 3;
            if (b != 0) {
                System.out.println(a / b);
            }
            printSum(23, 234);
            int[] abc = {1, 2};
            int index = 3;
            if (index >= 0 && index < abc.length) {
                abc[index] = 9;
            }
        } catch (NullPointerException ex) {
            System.out.println("A pointer cannot point to null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("The array is out of its size!");
        } catch (Throwable ex) {
            System.out.println("Something went wrong...");
        }
    }
    private void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
