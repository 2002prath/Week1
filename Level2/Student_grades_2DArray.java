import java.util.Scanner;

class StudentGrades_2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Arrays to store marks, percentages, and grades
        int[][] marks = new int[numberOfStudents][3]; // Columns: 0 -> Physics, 1 -> Chemistry, 2 -> Maths
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print("Enter marks for " + subject + " (0-100): ");
                    marks[i][j] = sc.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        
        System.out.println("\nResults:");
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Percentage and Grades of a student are: "+ percentage +" , "+grade);
        }

        sc.close();
    }
}
 
         
