package ru.mirea.lab12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dates separated by comma");
        System.out.print("Input: ");

        String input = scanner.nextLine();
        String[] dates = input.split(",");

        Pattern pattern = Pattern.compile("(\\d{2})\\/(\\d{2})\\/(\\d{4})");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);

        boolean inputOk = true;

        for (String date : dates) {
            date = date.trim();
            Matcher matcher = pattern.matcher(date);

            if (matcher.find()) {
                try {
                    format.parse(matcher.group(0));
                } catch (ParseException ex) {
                    inputOk = false;
                }
            } else
                inputOk = false;
        }

        if (inputOk)
            System.out.println("Input ok!");
        else
            System.out.println("Input bad!");

        scanner.close();
    }
}
