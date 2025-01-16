import java.util.Scanner;

public class LengthCalculator {

    // Method to find and return the length of a string without using the length() method
    public static int findStringLength(String input) {
        int length = 0;
        
        // Use a simple for loop to iterate through each character in the string
        for (int i = 0; i < input.toCharArray().length; i++) {
            length++;
        }

        return length;
    }

    // Method to split text into words without using split()
    public static String[] manualSplit(String input) {
        input = input.trim(); // Remove leading and trailing spaces
        int wordCount = 0;

        // Count words by spaces
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ' && input.charAt(i - 1) != ' ') {
                wordCount++;
            }
        }
        wordCount++;

        String[] words = new String[wordCount];
        int index = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0);
                }
            } else {
                word.append(input.charAt(i));
            }
        }

        if (word.length() > 0) {
            words[index] = word.toString();
        }

        return words;
    }

    
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i]));
        }

        return wordLengthArray;
    }

    
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        String shortest = wordLengthArray[0][0];
        String longest = wordLengthArray[0][0];
        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = Integer.parseInt(wordLengthArray[0][1]);

        for (String[] wordData : wordLengthArray) {
            int length = Integer.parseInt(wordData[1]);
            if (length < shortestLength) {
                shortest = wordData[0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longest = wordData[0];
                longestLength = length;
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        
        String[] manualWords = manualSplit(userInput);

        
        String[][] wordLengthArray = createWordLengthArray(manualWords);

        
        String[] shortestAndLongest = findShortestAndLongest(wordLengthArray);

        
        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        scanner.close();
    }
}
