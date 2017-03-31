package cs;

import cs.thread.Consumer;
import cs.thread.Producer;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("How to use wait and notify method in Java");
        System.out.println("Solving Producer Consumper Problem");

        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 100;

        Thread producer = new Producer(buffer, maxSize, "PRODUCER");
        Thread consumer = new Consumer(buffer, maxSize, "CONSUMER");

        producer.start();
        consumer.start();
    }


}
