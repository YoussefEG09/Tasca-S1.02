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
                System.out.println("Format error.");
                scanner.nextLine();
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
                System.out.println("Format error.");
                scanner.nextLine();
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
                scanner.nextLine();
            }

        }
        return value;
    }

    public static double scanDouble(String message) {
        double value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message + " : ");
                value = scanner.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static char scanChar(String message) throws FormatErrorException {
        char value = ' ';
        boolean valid = false;

        while (!valid) {
            System.out.println((message + " : "));
            String input = scanner.next();

            if (input.length() != 1) {
                throw new FormatErrorException();
            } else {
                value = input.charAt(0);
                valid = true;
            }
        }

        return value;

    }

    public static String scanString(String message) throws FormatErrorException {

        String value = " ";
        boolean valid = false;

        while (!valid) {
            System.out.println(message + " : ");
            String input = scanner.next();

            if (input.isEmpty()) {
                throw new FormatErrorException();
            }
        }

        return value;
    }

}

public static boolean scanBoolean(String message) throws FormatErrorException {

}
}
