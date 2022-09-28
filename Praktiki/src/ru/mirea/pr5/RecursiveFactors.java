package ru.mirea.pr5;

public class RecursiveFactors {
    private static void factors(int n, int i) {
        if (i <= n) {
            if (n % i == 0)
                System.out.println(i);
            factors(n, i + 1);
        }
    }

    public static void main(String[] args) {
        int n = 16;
        factors(n, 1);
    }
}
