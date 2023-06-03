package org.example;

import java.util.*;

public class Main {
    private static List<Integer> ints = new ArrayList<>();

    public static void main(String[] args) {
        removeEvenNumbers();
        findMaxNumber();
        findMinNumber();
        findAverageNumber();
    }

    public static void createList() {
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            ints.add(rnd.nextInt(100));
        }
    }

    public static void removeEvenNumbers() {
        createList();

        System.out.println(ints);

        Iterator<Integer> it = ints.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }

        System.out.println(ints);
    }

    public static void findMaxNumber() {
        System.out.println(Collections.max(ints));
    }

    public static void findMinNumber() {
        System.out.println(Collections.min(ints));
    }

    public static void findAverageNumber() {
        double result = 0;
        for (int i = 0; i < ints.size(); i++) {
            result += ints.get(i);
        }
        System.out.println(result / ints.size());
    }
}