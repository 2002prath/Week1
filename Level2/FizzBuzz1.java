import java.util.Scanner; 
 
class FizzBuzz 
{
  public static void main(String[] mmg)
   {  
      Scanner sc = new Scanner(System.in); 
      int number = sc.nextInt(); 
      if(number>0) 
      {  int i=1; 
         while(i<=number)
         { 
        if(i%5==0 && i%3==0) 
           System.out.println("FizzBuzz for a number: "+ i); 
        else if(i%5==0)
           System.out.println("Buzz for a number: "+ i); 
         else if(i%3==0)
           System.out.println("Fizz for a number: "+ i); 
         else 
         System.out.println("Number is "+i); 
         i++; 
         }
      } 
       else 
        System.out.println("Please enter a positive number"); 
    } 
} 