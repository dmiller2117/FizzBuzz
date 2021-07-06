package com.davidmiller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        GameRunner gameRunner = new GameRunner(new FizzBuzz());
        gameRunner.run();
    }

}