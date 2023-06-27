package org.example;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the maximum number of toys in the database: ");
        Integer maxCount = scan.nextInt();

        ToyHelper toyHelper = new ToyHelper();
        toyHelper.generateToys(maxCount);
        toyHelper.createToysAndWriteToDatabase();

        System.out.print("Enter count of toys which should be participated in game: ");

        Integer count = scan.nextInt();

        ToyManager manager = new ToyManager();
        PriorityQueue<Toy> firstQueue = new PriorityQueue<>();
        for (int i = 0; i < count; i++) {
            firstQueue.offer(manager.nextToy(false));
        }
        for (int i = 0; i < count; i++) {
            manager.appendResults(firstQueue.poll());
        }
    }
}