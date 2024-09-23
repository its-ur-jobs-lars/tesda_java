import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display the information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        scanner.close();
    }
}
