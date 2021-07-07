package com.davidmiller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzApplication implements CommandLineRunner {

    private final Game fizzBuzz;
    private final int maxNumber;
    @Autowired
    public FizzBuzzApplication(Game fizzBuzz, @Value("${maxNumber}") int maxNumber) {
        this.fizzBuzz = fizzBuzz;
        this.maxNumber = maxNumber;
    }

    public static void main(String[] args) {
        SpringApplication.run(FizzBuzzApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Max number to run: " + maxNumber);
        for (int i = 1; i <= maxNumber; i++) {
            String gameValue = fizzBuzz.play(i);
            System.out.println(gameValue);
        }
    }
}