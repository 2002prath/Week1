import java.util.Scanner;

 class Text_Conversion {

    
    public static String convertToUpperCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); 
            } else {
                result.append(ch); 
            }
        }
        return result.toString();
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
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String Input = scanner.nextLine();

        
        String builtInUpperCase = userInput.toUpperCase();

        
        String userDefinedUpperCase = convertToUpperCase(Input);

        
        boolean areEqual = compareStrings(builtInUpperCase, userDefinedUpperCase);

        
        System.out.println("Uppercase using built-in method: " + builtInUpperCase);
        System.out.println("Uppercase using user-defined method: " + userDefinedUpperCase);
        System.out.println("Are both methods producing the same result? " + areEqual);

        
        sc.close();
    }
}

