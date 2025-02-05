import java.util.Scanner; 
 

class Count_for
{  
   public static void main(String[] amg)
    {  
       Scanner sc = new Scanner(System.in); 
       int count=0; 
       int number = sc.nextInt(); 
       for(int i=0;i<number;i++)
       { 
         count++; 
       }
        
      System.out.println("The value of a number is " + count); 
      
      sc.close();  
    }
} 
