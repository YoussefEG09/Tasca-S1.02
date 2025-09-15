package Nivel2_TascaS2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {

    private static Scanner scanner = new Scanner(System.in);


    public static byte scanByte(String message) {
        byte value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message + " :");
                value = scanner.nextByte();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
            }
        }
        return value;
    }

    public static int scanInt(String message) {
        int value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message + " : ");
                value = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");

            }

        }

        return value;
    }

    public static float scanFloat(String message) {
        float value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message + " :");
                value = scanner.nextFloat();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error.");
            }

        }
        return value;
    }

    public static double scanDouble(String message) {

    }

    public static char scanChar(String message) {

    }

    public static String scanString(String message) {

    }

    public static boolean scanBoolean(String message) {

    }
}
