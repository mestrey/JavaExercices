package ru.mirea.lab5.image;

public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            ImageApp imageApp = new ImageApp(args[0]);
            imageApp.run();
        } else
            System.out.println("Please enter at least the image path!");
    }
}
