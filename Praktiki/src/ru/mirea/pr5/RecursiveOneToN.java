package ru.mirea.pr5;

public class RecursiveOneToN {
    private static void recur(int n, int i) {
        if (i == n + 1)
            return;
        System.out.println(i);
        recur(n, i + 1);
    }

    public static void main(String[] args) {
        recur(10, 1);
        recur(5, 1);
    }
}
