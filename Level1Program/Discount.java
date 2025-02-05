import java.util.Scanner; 

class Discount
{  
  public static void main(String[] amg) 
   {  Scanner input = new Scanner(System.in); 
    
      double fee = input.nextDouble(); 
      double discount_percent = input.nextDouble();  
      double discount_fee =  (discount_percent*fee)/100; 
      double Final_fee = fee - discount_fee  ; 

      System.out.println("The discount amount is INR " + discount_fee  + " and final discounted fee is INR "+ Final_fee );   
    } 
}