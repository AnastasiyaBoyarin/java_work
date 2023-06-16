package org.example;

public class Task1 {
    public void Div(double a, double b) {
        if (b == 0){
            throw new ArithmeticException("Division by zero is not possible");
        }
        else {
            System.out.println(a/b);
        }
    }

    public void FindNumberByIndex(int[] myArray, int index) {
        if (index > myArray.length-1) {
            throw new ArrayIndexOutOfBoundsException("The index is greater than the length of the array. " +
                    "Element with this index does not exist");}
        else {
            System.out.println("The element with the entered index is equal to: " + myArray[index]);
        }
    }

    public int FindStringLength(String myString) {
        if (myString == null){
            throw new NullPointerException();
        }
        else{
            return myString.length();
        }
    }
}
