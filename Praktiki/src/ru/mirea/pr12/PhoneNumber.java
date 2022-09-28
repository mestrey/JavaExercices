package ru.mirea.pr12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    StringBuilder formattedNumber;

    StringBuilder getNumber() {
        return this.formattedNumber;
    }

    public PhoneNumber(StringBuilder notFormattedNumber) {
        String regex1 = "^\\+7[\\d]{10}$";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(notFormattedNumber);

        String regex2 = "^8[\\d]{10}$";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(notFormattedNumber);

        if (matcher1.matches()) {
            notFormattedNumber.insert(5, '-');
            this.formattedNumber = notFormattedNumber.insert(9, '-');
            return;
        }

        if (matcher2.matches()) {
            notFormattedNumber.replace(0, 1, "+7");
            notFormattedNumber.insert(5, '-');
            this.formattedNumber = notFormattedNumber.insert(9, '-');
            return;
        }

        throw new IllegalArgumentException();
    }
}
