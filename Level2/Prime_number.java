import java.util.Scanner; 
import java.util.Scanner; 
class Prime_number
{ 
  public static void main(String[] mmg) 
  {  
   Scanner sc = new Scanner(System.in); 
    
     int n = sc.nextInt(); 
     boolean Isprime =false; 
      
     for(int i=2;i<n;i++) 
     {  
       if(n%i==0)
       Isprime=true; 
       break; 
     }
    
     if(Isprime)
     System.out.print("It's not a prime number"); 
     else
     System.out.print("It's  a prime number");  

     sc.close();  
   }
}