import java.util.Scanner; 

class Split
{ 
  public static int display(String input)
   {  int x =0; 
      for(int i =0;i<input.toCharArray.length;i++)
      {
        x++;  
      } 
      return x;  
      
   }
   public static void split_text(String input)
   {  
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
   public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in); 
     String input = sc.next(); 

      int x = display(input); 
    
      System.out.println("length of a string is "+ x); 
          
      split_text(); 
      sc.close(); 
    }
}
    
 