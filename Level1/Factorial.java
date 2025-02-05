
import java.util.Scanner;
  

class Factorial
{  
  public static void main(String[] amg) 
    {  
      Scanner sc = new Scanner(System.in);       
      System.out.print("Write a number to find multiplication of any number ");  
      int number = sc.nextInt();  
      long fact =1; 
      int i=1;  
      while(number>=i)
        {    
           fact = fact * i;  
            i++;
        } 
           System.out.print(fact); 
        sc.close(); 
    }
}


