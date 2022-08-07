package com.package5.CopyOnWriteArrayListAndMap;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class _1CopyOnWriteArrayListRunner {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>(); // CopyOnWriteArrayList synchronize only the write operations on ArrayList
        // by making a fresh copy of the underlying array for every write operation, thus u don't need to synchronize the write operations as well
        // giving a performance boost .Only use if traversal operations vastly outnumbers the write operations, since it is very costly.

        // Scenario for using CopyOnWriteArrayList

        // Assume you only have 3 threads writing into the List
        list.add("Ant");
        list.add("Bat");
        list.add("Cat");

        // Assume you have 1000 threads reading from the List
        for(String element: list) {
            System.out.println(element);
        }
    }
}