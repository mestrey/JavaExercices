package ru.mirea.pr5;

public class RecursiveSum {
    private static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return sum(n - 1) + n;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}
