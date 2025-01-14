import java.util.Scanner; 
class Conversion_height
{  
  public static int convert(double N) 
  { 
      double inches = N/2.54; 
      double foot =   inches/12; 
       return foot;        
   }    

  public static void main(String[] amg) 
   { 
      Scanner input = new Scanner(System.in); 
  
       System.out.println("Give your height in centimeter");  
      double centi_m = input.nextDouble();    
              
      double feet = convert(centi_m); 
      System.out.println("Your Height in cm is "+ height +" while in feet is "+ feet);   
    } 
}