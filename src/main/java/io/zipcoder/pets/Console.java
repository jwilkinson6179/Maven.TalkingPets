package io.zipcoder.pets;


import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 * Shamelessly borrowed
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput;
        userInput = scanner.nextLine();
        return Integer.parseInt(userInput);
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput;
        userInput = scanner.nextLine();
        return Double.parseDouble(userInput);
    }
}
