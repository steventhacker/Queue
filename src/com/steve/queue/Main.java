package com.steve.queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 1; i < 6; i++) {
            queue.put(i);
        }

        queue.pop();

        queue.print();

        System.out.println("Size: " + queue.getSize());

        queue.clear();

        System.out.println("Size 2: " + queue.getSize());
    }
}
