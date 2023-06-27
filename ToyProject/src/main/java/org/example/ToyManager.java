package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.PriorityQueue;
import java.util.Random;

public class ToyManager {
    private PriorityQueue<Toy> allToys = new PriorityQueue<>();
    private int totalWeight = 0;
    private final String pathToDB = "toys_db.csv";
    private final Random r = new Random();

    public ToyManager() {
        setQueue();
    }

    private void setQueue() {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(this.pathToDB), StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(",");
                this.totalWeight += Integer.parseInt(split[2]);
                allToys.add(new Toy(split[0], split[1], split[2]));
            }
        } catch (IOException e) {
            System.out.println("There's been an IO exception while dealing with datafile");
            System.out.println(e.getMessage());
        }
    }

    public Toy nextToy(boolean removeAfterGetting) {
        if (allToys.isEmpty()) return null;

        int randInt = r.nextInt(totalWeight) + 1;
        Toy chosenToy = null;
        int currentWeight = 0;

        for (Toy toy : allToys) {
            currentWeight += Integer.parseInt(toy.getFreqFall());
            if (currentWeight >= randInt) {
                chosenToy = toy;
                break;
            }
        }

        if (removeAfterGetting) {
            removeToy(chosenToy);
        }
        return chosenToy;
    }

    public void appendResults(Toy toy) throws IOException {
        if (toy == null) return;

        String pathToResult = "result.txt";
        append(toy, pathToResult);
    }

    private void append(Toy toy, String path) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(path, true));
            writer.write(toy.toString() + '\n');
        } catch (IOException e) {
            throw e;
        } finally {
            writer.close();
        }
    }

    private void removeToy(Toy toy) {
        allToys.remove(toy);

        try (Writer writer = Files.newBufferedWriter(Paths.get(this.pathToDB), StandardCharsets.UTF_8)) {
            for (Toy t : allToys) {
                writer.write(t.toString() + '\n');
            }
        } catch (IOException e) {
            System.out.println("There's been an IO exception in method removeToy");
            e.printStackTrace();
        }

        allToys.clear();
        totalWeight = 0;
        setQueue();
    }
}
