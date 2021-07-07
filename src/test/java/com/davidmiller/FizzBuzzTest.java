package com.davidmiller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

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

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90, -90, -75, -60, -45, -30, -15})
    public void testFizzBuzzTrue(int candidate) {
        assertTrue(fizzBuzz.isDivisibleBy3and5(candidate));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, -3, 6, 347329723 * 3})
    public void testIsDivisibleBy3True(int candidate) {
        assertTrue(fizzBuzz.isDivisibleBy3(candidate));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -10, 7, 347329723 * 2})
    public void testIsDivisibleBy3False(int candidate) {
        assertFalse(fizzBuzz.isDivisibleBy3(candidate));
        assertFalse(fizzBuzz.isDivisibleBy3(-10));
        assertFalse(fizzBuzz.isDivisibleBy3(7));
        assertFalse(fizzBuzz.isDivisibleBy3(347329723 * 2));
    }
}