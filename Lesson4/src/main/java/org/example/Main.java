package org.example;

public class Main {
    public static void main(String[] args) {

        // Task 1
        Task1 task1 = new Task1();
        task1.reverseLinkedList();

        // Task 2
        Task2 task2 = new Task2();
        task2.enqueue(1);
        task2.enqueue(2);
        task2.enqueue(3);
        task2.enqueue(4);
        task2.enqueue(5);
        task2.enqueue(6);
        task2.enqueue(7);
        task2.enqueue(8);
        task2.dequeue();
        task2.first();
        task2.dequeue();
        task2.first();
        task2.dequeue();
    }
}