import java.util.Scanner;

class Conversion_to_lowercase {

    
    public static String ToLowerCase(String input) {
        StringBuilder result = new StringBuilder();
        
         for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));        // Convert to lowercase
            } else {
                result.append(ch); 
            }
        }
        return result.toString();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

       String user_Defined = ToLowerCase(userInput);
       
       System.out.println("Lowercase using user-defined method: " + user_Defined);
        
       sc.close();
    }
}
