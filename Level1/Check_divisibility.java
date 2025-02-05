import java.util.Scanner; 
 

class Check_divisibility
{ 
  public static void main(String[] mmg)
    {   
      Scanner sc = new Scanner(System.in); 
       int N = sc.nextInt(); 
       

       if(N%5==0) 
       System.out.println("Yes divisible by 5"); 
       else 
       System.out.println("No, not divisible");  
       
         
    } 
}  