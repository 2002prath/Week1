import java.util.Scanner; 
 

class Count 
{  
   public static void main(String[] amg)
    {  
       Scanner sc = new Scanner(System.in); 
       int count=0; 
       int number = sc.nextInt(); 
       while(number-->0) 
       { 
         count++; 
       }
        
      System.out.println("The value of a number is" + count); 
      
      sc.close();  
    }
} 
