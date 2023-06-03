package org.example;

import java.util.Collections;
import java.util.LinkedList;

public class Task1 {

    private static LinkedList<Object> linkedList = new LinkedList<Object>();

    private static void createLinkedList() {
        linkedList.add("fsdf");
        linkedList.add(123);
        linkedList.add("jhdfg");
        linkedList.add("&%$");
        linkedList.add(7345);
        System.out.println("Original list: " + linkedList);
    }

    public void reverseLinkedList() {
        createLinkedList();

        Collections.reverse(linkedList);
        System.out.println("Reversed list: " + linkedList);
    }
}
