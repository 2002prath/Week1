import java.util.Scanner;

public class StringProcessor {

    
    public static int[] findTrimIndices(String input) {
        int start = 0;
        int end = input.length() - 1;

        
        while (start < input.length() && input.charAt(start) == ' ') {
            start++;
        }

        
        while (end > start && input.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

  
    public static String createSubstring(String input, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(input.charAt(i));
        }
        return substring.toString();
    }

    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String userInput = scanner.nextLine();

        // Trim leading and trailing spaces using custom method
        int[] trimIndices = findTrimIndices(userInput);
        String trimmedCustom = createSubstring(userInput, trimIndices[0], trimIndices[1]);

        // Trim spaces using built-in trim() method
        String trimmedBuiltIn = userInput.trim();

        // Compare the results
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        
        System.out.println("Custom trimmed string: '" + trimmedCustom + "'");
        System.out.println("Built-in trimmed string: '" + trimmedBuiltIn + "'");
        System.out.println("Are both strings equal? " + areEqual);

        scanner.close();
    }
}
