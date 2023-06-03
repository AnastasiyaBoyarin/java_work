package org.example;

import java.util.LinkedList;

public class Task2 {
    private static LinkedList<Integer> queue = new LinkedList<Integer>();

    public void enqueue(int element) {
        queue.addLast(element);
        System.out.println(queue);
    }

    public int dequeue() {
        int first = queue.removeFirst();
        System.out.println(first);
        System.out.println(queue);
        return first;
    }

    public int first() {
        int first = queue.getFirst();
        System.out.println(first);
        System.out.println(queue);
        return first;
    }
}
