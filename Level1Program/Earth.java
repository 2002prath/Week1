import java.util.Scanner; 
class Conversion
{  
  public static void main(String[] amg) 
   { 
      Scanner input = new Scanner(System.in); 
      double km = input.nextDoble(); 
      double mile = km *1.6;                // Given data: 1 mile = 1.6 km 

      System.out.println("The total miles is " + mile  +" mile for the given "+km  +" km ");   
    } 
}