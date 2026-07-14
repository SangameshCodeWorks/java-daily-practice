import java.util.Scanner;

public class d2variables {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // 1. Practice Primitive Data Types
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height in meters (e.g. 1.75): ");
        double height = scanner.nextDouble();

        // 2. Outputting the variables
        System.out.println("\n--- Day 2 Practice Results ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + height + " meters");

        // Close the scanner resource
        scanner.close();
    }
}
