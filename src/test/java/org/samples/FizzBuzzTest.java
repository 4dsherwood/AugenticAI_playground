package org.samples;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void testDivisibleBy3ReturnsFizz() {
        assertEquals("Fizz", FizzBuzz.of(3));
    }

    @Test
    void testDivisibleBy5ReturnsBuzz() {
        assertEquals("Buzz", FizzBuzz.of(5));
    }

    @Test
    void testDivisibleBy3And5ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.of(15));
    }

    @Test
    void testNotDivisibleBy3Or5ReturnsNumber() {
        assertEquals("2", FizzBuzz.of(2));
    }

    @Test
    void testEdgeCases() {
        assertEquals("FizzBuzz", FizzBuzz.of(0));
        assertEquals("Fizz", FizzBuzz.of(-3));
    }

    @Test
    void testLargeNumbers() {
        assertEquals("FizzBuzz", FizzBuzz.of(3000));
    }

}
