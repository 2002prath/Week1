
import java.util.Scanner;
  
                                                // factorial using for loop
class Factorial_for
{  
  public static void main(String[] amg) 
    {  
      Scanner sc = new Scanner(System.in);       
      System.out.print("Write a number to find multiplication of any number ");  
      int number = sc.nextInt();  
      long fact =1; 
        
         for(int i=1;i<number;i++)
        {    
           fact = fact * i;  
            
        } 
           System.out.print(fact); 
        sc.close(); 
    }
}


