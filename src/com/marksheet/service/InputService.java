package com.marksheet.service;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class InputService {

    private final Scanner scanner;
    private final BlockingQueue<String> inputQueue;
    private final Thread inputThread;

    public InputService() {

        scanner = new Scanner(System.in);
        inputQueue = new LinkedBlockingQueue<>();

        inputThread = new Thread(() -> {

            while (!Thread.currentThread().isInterrupted()) {

                try {

                    String input = scanner.nextLine();

                    inputQueue.put(input);

                } catch (Exception e) {
                    break;
                }
            }

        });

        inputThread.setDaemon(true);
        inputThread.start();
    }

    public String getInputWithin20Seconds() {

        try {

            return inputQueue.poll(20, TimeUnit.SECONDS);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
            return null;
        }
    }

    public void shutdown() {

        inputThread.interrupt();
        scanner.close();
    }
}