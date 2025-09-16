package Nivel2_TascaS2;

public class Main {
    public static void main(String[] args) {
                try {
                    byte age = Entry.scanByte("Enter your age");
                    int number = Entry.scanInt("Enter an integer number");
                    float height = Entry.scanFloat("Enter your height");
                    double weight = Entry.scanDouble("Enter your weight");

                    char initial = Entry.scanChar("Enter the initial of your name");
                    String name = Entry.scanString("Enter your full name");
                    boolean answer = Entry.scanBoolean("Do you want to continue? (s/n)");

                    System.out.println("\nEntered data:");
                    System.out.println("Age: " + age);
                    System.out.println("Integer number: " + number);
                    System.out.println("Height: " + height);
                    System.out.println("Weight: " + weight);
                    System.out.println("Initial: " + initial);
                    System.out.println("Full name: " + name);
                    System.out.println("Wants to continue? " + (answer ? "Yes" : "No"));

                } catch (FormatErrorException e) {
                    System.out.println("Format error: " + e.getMessage());
                }
            }
        }












