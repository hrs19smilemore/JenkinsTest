package app;

import java.io.PrintStream;

public class Application {
    public static void main(String[] args) {
        printHelloWorld(System.out);
    }

    public static void printHelloWorld(PrintStream out){
        out.print("Hello world!");
    }
}
