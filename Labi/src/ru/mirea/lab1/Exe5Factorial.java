package ru.mirea.lab1;

public class Exe5Factorial {
    private static long getFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(getFactorial(number));
    }
}
