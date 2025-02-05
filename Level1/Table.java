
import java.util.Scanner;
  

class Table 
{  
  public static void main(String[] amg) 
    {  
      Scanner sc = new Scanner(System.in);       
      System.out.print("Write a number to find multiplication of any number");  
      int number = sc.nextInt();  
      
      for(int i=1;i<=10;i++)
        { 
           System.out.println(i+" * "+number +" = "+i*number); 
        } 
           
        sc.close(); 
    }
}


