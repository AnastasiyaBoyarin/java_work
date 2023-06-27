package org.example;

import java.io.*;
import java.util.Random;
public class ToyHelper {

    private Toy[] toysArray;
    public void generateToys(int maxToys) {
        toysArray = new Toy[maxToys];
        Random random = new Random();

        for (int i = 0; i < maxToys; i++) {
            Toy toy = new Toy(Integer.toString(i + 1),
                    generateToyName(random), Integer.toString(random.nextInt(101)));
            toysArray[i] = toy;
        }
    }

    public void createToysAndWriteToDatabase() {
        try {
            FileWriter writer = new FileWriter("toys_db.csv");

            for (int i = 0; i < toysArray.length; i++) {
                writer.append(toysArray[i].getId());
                writer.append(",");
                writer.append(toysArray[i].getName());
                writer.append(",");
                writer.append(toysArray[i].getFreqFall());
                writer.append("\n");
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generateToyName(Random random) {
        String[] toyNames = {"Bear", "Doll", "Spider man", "Robot", "Car", "Soft toy", "Lego"};
        return toyNames[random.nextInt(toyNames.length)];
    }
}
