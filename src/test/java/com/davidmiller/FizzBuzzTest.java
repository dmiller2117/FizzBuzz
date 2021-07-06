package com.davidmiller;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizz() {
        for (int i = 1; i < 300; i++) {
            int multipleOfThree = i * 3;
            if (multipleOfThree % 5 == 0) {
                continue;
            }
            assertEquals("Fizz", fizzBuzz.play(multipleOfThree));
        }
    }

    @Test
    public void testBuzz() {
        for (int i = 1; i < 300; i++) {
            int multipleOfFive = i * 5;
            if (multipleOfFive % 3 == 0) {
                continue;
            }
            assertEquals("Buzz", fizzBuzz.play(multipleOfFive));
        }
    }

    @Test
    public void testFizzBuzzTrue() {
        assertTrue(fizzBuzz.isDivisibleBy3(15));
        assertTrue(fizzBuzz.isDivisibleBy3(30));
        assertTrue(fizzBuzz.isDivisibleBy3(45));
        assertTrue(fizzBuzz.isDivisibleBy3(60));
        assertTrue(fizzBuzz.isDivisibleBy3(75));
        assertTrue(fizzBuzz.isDivisibleBy3(90));
        assertTrue(fizzBuzz.isDivisibleBy3(-90));
        assertTrue(fizzBuzz.isDivisibleBy3(-75));
        assertTrue(fizzBuzz.isDivisibleBy3(-60));
        assertTrue(fizzBuzz.isDivisibleBy3(-45));
        assertTrue(fizzBuzz.isDivisibleBy3(-30));
        assertTrue(fizzBuzz.isDivisibleBy3(-15));
    }

    @Test
    public void testIsDivisibleBy3True(){
        assertTrue(fizzBuzz.isDivisibleBy3(3));
        assertTrue(fizzBuzz.isDivisibleBy3(-3));
        assertTrue(fizzBuzz.isDivisibleBy3(6));
        assertTrue(fizzBuzz.isDivisibleBy3(347329723*3));
    }

    @Test
    public void testIsDivisibleBy3False(){
        assertFalse(fizzBuzz.isDivisibleBy3(0));
        assertFalse(fizzBuzz.isDivisibleBy3(-10));
        assertFalse(fizzBuzz.isDivisibleBy3(7));
        assertFalse(fizzBuzz.isDivisibleBy3(347329723*2));
    }
}