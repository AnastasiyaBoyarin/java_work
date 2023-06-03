package org.example;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    public void readDataFromJsonFile() {
        try {
            InputStream stream = new BufferedInputStream(new FileInputStream("test.json"));
            Scanner iScanner = new Scanner(stream, "utf-8").useDelimiter("\\A");
            String inStr = iScanner.hasNext() ? iScanner.next() : "";
            iScanner.close();
            System.out.println(inStr);

            showData(inStr);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showData(String string) {
        String [] newStr = string.replaceAll("[\\s{}\\[\\]\"]", "").split("[:,]");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < newStr.length; i+=6) {
            result.append("Student "+newStr[i+1]);
            result.append(" gets "+newStr[i+3]);
            result.append(" on subject "+newStr[i+5]+ "\n");
        }
        System.out.println (result);
    }
}
