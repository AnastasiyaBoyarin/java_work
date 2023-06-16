package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task1
        Scanner sc = new Scanner(System.in);
        try {
            Task1 task1 = new Task1();
            System.out.println("double a = ");
            double a = sc.nextDouble();
            System.out.println("double b = ");
            double b = sc.nextDouble();
            int[] myArray = {75, 88, 95, 14, 27, 33};
            System.out.println("int index = ");
            int index = sc.nextInt();
            System.out.println("String myStr = ");
            String myString = sc.nextLine();
            task1.Div(a, b);
            task1.FindNumberByIndex(myArray, index);
            task1.FindStringLength(myString);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
        finally {
            sc.close();
        }

        //Task2
        String[][] array1 = new String[][]{{"1", "0", "1"}, {"1", "0", "2"}, {"2", "2", "3"}};
        String[][] array2 = null;
        try {
            Task2 task2 = new Task2();
            task2.sum2d(array1);
            task2.sum2d(array2);
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getStackTrace() + exception.getMessage());
        }

        //Task3
        int[] myArray1 = new int [] {1, 3, 5};
        int[] myArray2 = new int [] {4, 6, 8};
        int[] myArray3 = new int [] {4, 6, 8, 5};
        int[] myArray4 = null;
        try {
            Task3 task3 = new Task3();
            int result1[] = task3.getArray(myArray1, myArray2);
            System.out.println("Result: " + Arrays.toString(result1));
            int result2[] = task3.getArray(myArray1, myArray3);
            System.out.println("Result: " + Arrays.toString(result2));
            int result3[] = task3.getArray(myArray1, myArray4);
            System.out.println("Result: " + Arrays.toString(result3));

        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}