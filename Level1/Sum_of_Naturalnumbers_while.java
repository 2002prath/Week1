
import java.util.Scanner;
  
                                                
class Sum_of_Naturalnumbers_while
{  
  public static void main(String[] amg) 
    {  
      Scanner sc = new Scanner(System.in);       
      System.out.print("Write a number to find sum of N natural number ");  
      int N = sc.nextInt();  
      long sum =1; 
        int i=1; 
         while(i<N)
        {    
           sum= sum + i;  
            i++; 
        } 
           System.out.print(sum); 
        sc.close(); 
    }
}


