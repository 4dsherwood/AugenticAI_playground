package org.samples;

public class FizzBuzz {

    public static String of(int n) {
        if (isDivisibleBy15(n)) {
            return "FizzBuzz";
        }
        if (isDivisibleBy3(n)) {
            return "Fizz";
        }
        if (isDivisibleBy5(n)) {
            return "Buzz";
        }
        return String.valueOf(n);
    }

    private static boolean isDivisibleBy3(int n) {
        return n % 3 == 0;
    }

    private static boolean isDivisibleBy5(int n) {
        return n % 5 == 0;
    }

    private static boolean isDivisibleBy15(int n) {
        return n % 15 == 0;
    }
}
