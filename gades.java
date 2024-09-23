import java.util.Scanner;

public class gades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for midterm grade
        System.out.print("Enter your midterm grade: ");
        double midterm = scanner.nextDouble();

        // Prompt for final grade
        System.out.print("Enter your final grade: ");
        double finals = scanner.nextDouble();

        // Calculate final grade (average of midterm and final)
        double finalGrade = (midterm + finals) / 2;

        // Display the grades and final result
        System.out.println("Midterm Grade: " + midterm);
        System.out.println("Final Grade: " + finals);
        System.out.println("Final Grade (Average): " + finalGrade);

        scanner.close();
    }
}
