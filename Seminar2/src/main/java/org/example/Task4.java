package org.example;

import java.util.Scanner;

public class Task4 {
    public void isDataEmpty(String data) {
        if (!data.isEmpty()){
            System.out.println("You entered: " + data);
        } else {
            throw new RuntimeException("You did not enter any data!");
        }
    }
}
