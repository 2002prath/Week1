import java.util.Scanner;

 class Exception_Handling{             // Number format exception

    
    public static void NumberFormatException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to parse as an integer: ");
        String userInput = scanner.nextLine();

        // This will throw NumberFormatException if input is not a valid number
        int number = Integer.parseInt(userInput);
        System.out.println("Parsed number: " + number);

        sc.close();
    }

    
    public static void handle_Exception() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to parse as an integer: ");
        String userInput = scanner.nextLine();

        try {
            // Attempt to parse the input as an integer
            int number = Integer.parseInt(userInput);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Handle the exception and display an error message
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other runtime exception
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        
        System.out.println("\nGenerating NumberFormatException:");
        try {
            NumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        
        System.out.println("\nHandling NumberFormatException:");
        handle_Exception();
    }
}
