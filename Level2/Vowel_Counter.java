import java.util.Scanner;

public class Vowel_Counter{

    
    public static int[] countVowels(String input) {
        int vowels = 0;
        int consonants = 0;
        String lowerInput = input.toLowerCase();

        for (int i = 0; i < lowerInput.length(); i++) {
            char c = lowerInput.charAt(i);
            if (c >= 'a' && c <= 'z') { // Check if the character is a letter
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        
        int[] counts = countVowelsAndConsonants(userInput);

        
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);

        scanner.close();
    }
}
