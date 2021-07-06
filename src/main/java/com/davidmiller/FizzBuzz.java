package com.davidmiller;

public class FizzBuzz implements Game {

    @Override
    public String play(int number) {
        if (number == 0) {
            return Integer.toString(number);
        }
        if (isDivisibleBy3(number) && isDivisibleBy5(number)) {
            return "FizzBuzz";
        } else if (isDivisibleBy3(number)) {
            return "Fizz";
        } else if (isDivisibleBy5(number)) {
            return "Buzz";
        }
        return Integer.toString(number);
    }

    boolean isDivisibleBy3(int number) {
        if(number == 0) return false;
        return number % 3 == 0;
    }

    boolean isDivisibleBy5(int number) {
        if(number == 0) return false;
        return number % 5 == 0;
    }
}