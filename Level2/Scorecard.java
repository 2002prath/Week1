import java.util.Random;
import java.util.Scanner;

public class ScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60; // Random score for Physics (60-100)
            scores[i][1] = random.nextInt(41) + 60; // Random score for Chemistry (60-100)
            scores[i][2] = random.nextInt(41) + 60; // Random score for Math (60-100)
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateStatistics(int[][] scores) {
        double[][] stats = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return stats;
    }

    // Method to calculate grades based on percentages
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];

        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];

            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] stats, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Grade");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10s%n", i + 1, scores[i][0], scores[i][1], scores[i][2], stats[i][0], stats[i][1], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random scores for students
        int[][] scores = generateRandomScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] stats = calculateStatistics(scores);

        // Calculate grades
        String[] grades = calculateGrades(stats);

        // Display the scorecard
        displayScoreCard(scores, stats, grades);

        scanner.close();
    }
}
