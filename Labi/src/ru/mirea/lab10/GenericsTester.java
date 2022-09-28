package ru.mirea.lab10;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class GenericsTester {
    public static void main(String[] args) {
        Generics generics = new Generics();

        String[] stringArray = new String[5];
        for (int i = 0; i < stringArray.length; ++i)
            stringArray[i] = String.valueOf((char) (i + 97));

        Number[] numberArray = new Number[5];
        for (int i = 0; i < numberArray.length; ++i)
            numberArray[i] = i;

        System.out.println(generics.toList(stringArray));
        System.out.println(generics.toList(numberArray));

        Container<Integer> container1 = new Container<Integer>();
        container1.add(100);
        Container<String> container2 = new Container<String>();
        container2.add("hello world");

        System.out.println(generics.getElementAt(stringArray, 4));

        File directory = new File(System.getProperty("user.dir"));
        List<File> directoryFiles = List.of(Objects.requireNonNull(directory.listFiles()));
        Iterator<File> iterator = directoryFiles.iterator();

        for (int i = 0; i < 5; ++i)
            try {
                System.out.println(iterator.next());
            } catch (Exception e) {
                return;
            }
    }
}
