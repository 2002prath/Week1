import java.util.Random;
import java.util.Scanner;

public class Voting{

    // Method to generate random ages for n students
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // Generate random ages between 10 and 99
        }

        return ages;
    }

    // Method to determine voting eligibility
    public static String[][] determineVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]); // Store the age as a string

            if (ages[i] < 0) {
                results[i][1] = "Invalid Age"; // Handle negative age
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }

        return results;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-15s%n", "Age", "Voting Eligibility");
        System.out.println("----------------------------");

        for (String[] row : results) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random ages for students
        int[] ages = generateRandomAges(numberOfStudents);

        // Determine voting eligibility
        String[][] eligibilityResults = determineVotingEligibility(ages);

        // Display the results
        displayResults(eligibilityResults);

        scanner.close();
    }
}
