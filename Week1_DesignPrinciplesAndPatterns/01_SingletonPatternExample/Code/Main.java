//package DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("App started");
        logger2.log("App running");

        if (logger1 == logger2) {
            System.out.println("Both loggers are the same instance (Singleton works)");
        } else {
            System.out.println("Different instances (Singleton failed)");
        }
    }
}
