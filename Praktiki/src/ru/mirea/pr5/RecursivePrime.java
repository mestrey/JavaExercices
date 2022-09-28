package ru.mirea.pr5;

public class RecursivePrime {
    private static boolean isPrime(int n, int i) {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 12;

        if (isPrime(n, 2))
            System.out.println("YES");
        else
            System.out.println("NO");

        n = 7;

        if (isPrime(n, 2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
