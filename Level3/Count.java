
import java.util.Scanner; 

class Count 
{ 
  public static void main(String[] mmg) 
    { 
      Scanner sc = new Scanner(System.in); 
      int count =0 ; 
      int N = sc.nextInt(); 
      while(N>0)
      {  
       int x = N%10; 
       count++; 
       N = N/10; 
      }
   
      System.out.println(count);  
   
         sc.close(); 
    } 
}    

