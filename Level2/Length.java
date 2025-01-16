import java.util.Scanner; 

class Length
{ 
  public static int display(String input)
   {  int x =0; 
      for(int i =0;i<input.toCharArray.length;i++)
      {
        x++;  
      } 
      return x; 
   } 
    
   public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in); 
     String input = sc.next(); 

      int x = display(input); 
   
      System.out.println("length of a string is "+ x); 
    
      sc.close(); 
    }
}
    
 