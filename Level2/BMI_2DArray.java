import java.util.Scanner;

class BMI_2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Create a 2D array for height, weight
        double[][] personData = new double[number][3]; // Columns: 0 -> Height, 1 -> Weight, 2 -> BMI
        String[] weightStatus = new String[number];   // Array to store weight statuses

        // Take input for height and weight, calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            
            // Input height (ensure positive value)
            do {
                System.out.print("Enter height (in meters, positive value): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value. Please re-enter.");
                }
            } while (personData[i][0] <= 0);

            // Input weight (ensure positive value)
            do {
                System.out.print("Enter weight (in kilograms, positive value): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value. Please re-enter.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", 
                              personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
