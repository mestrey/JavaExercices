package ru.mirea.lab9;

public class ExceptionsTest {
    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo();

        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();

        Exception3 exception3 = new Exception3();
        exception3.exceptionDemo();

        Exception4 exception4 = new Exception4();
        exception4.exceptionDemo();

        Exception5 exception5 = new Exception5();
        exception5.printMessage("test");
        exception5.printMessage(null);

        Exception6 exception6 = new Exception6();
        exception6.getKey();

        Exception7 exception7 = new Exception7();
        exception7.getKey();

        Exception8 exception8 = new Exception8();
        exception8.getKey();
    }
}
