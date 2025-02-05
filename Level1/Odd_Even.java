import java.util.Scanner;
  

class Odd_Even
{  
  public static void main(String[] amg) 
    {  
      Scanner sc = new Scanner(System.in);       
      System.out.print("Write any natural number");  
      int number = sc.nextInt();   
       
       for(int i=1;i<number;i++)
        { 
           if(i%2!=0) 
           System.out.println(i + "is odd"); 
           else 
           System.out.println(i + " is even"); 
        }       
         
        
                
      
        sc.close(); 
    }
}
