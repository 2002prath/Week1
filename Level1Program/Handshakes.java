import java.util.Scanner; 

class Operation
{ 
  public static void main(String[] amg) 
    { 
       Scanner sc = new Scanner(System.in); 
       int number1 = sc.nextInt(); 
       int number2 = sc.nextInt(); 


      int division = number1/number2; 
      int modulus = number1%number2; 

       System.out.println("The Quotient is "+ division +"and Reminder is"+ modulus +" of two number "+ number1 +"and"+ number2); 
   
     }
}
