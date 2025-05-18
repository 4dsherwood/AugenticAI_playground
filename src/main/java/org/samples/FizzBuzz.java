package org.samples;

public class FizzBuzz {

    public static String of(int n) {
        if (isDivisibleBy(n, 15)) {
            return "FizzBuzz";
        }
        if (isDivisibleBy(n, 3)) {
            return "Fizz";
        }
        if (isDivisibleBy(n, 5)) {
            return "Buzz";
        }
        return String.valueOf(n);
    }

    private static boolean isDivisibleBy(int n, int divisor) {
        return n % divisor == 0;
    }
}
