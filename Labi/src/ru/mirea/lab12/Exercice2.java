package ru.mirea.lab12;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Expression: ");
        String input = scanner.nextLine();

        ArrayList<String> matches = new ArrayList<String>();
        String regex = "[0-9]+[ ]*[+]";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(input);

        if (m.find())
            matches.add(m.group());

        System.out.println(matches);

        scanner.close();
    }
}
