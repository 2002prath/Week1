import java.util.Scanner;

public class Frequency {

    // Method to find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] uniqueChars = new char[len];
        int uniqueCount = 0;

        // Loop to find unique characters using nested loops
        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character already appeared in the text
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to find the frequency of characters in a string using unique characters
    public static String[][] findCharacterFrequencies(String text) {
        char[] uniqueChars = uniqueCharacters(text); // Get the unique characters
        String[][] frequencyResult = new String[uniqueChars.length][2]; // 2D array to store character and frequency

        // Loop through each unique character and count its frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;

            // Count the frequency of the current unique character
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            // Store the character and its frequency in the result array
            frequencyResult[i][0] = Character.toString(currentChar);
            frequencyResult[i][1] = Integer.toString(frequency);
        }

        return frequencyResult;
    }

    public static void main(String[] args) {
        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Call the findCharacterFrequencies method
        String[][] frequencies = findCharacterFrequencies(inputText);

        // Display the result
        System.out.println("Character frequencies:");
        for (String[] entry : frequencies) {
            System.out.println("Character: " + entry[0] + ", Frequency: " + entry[1]);
        }

        scanner.close();
    }
}
