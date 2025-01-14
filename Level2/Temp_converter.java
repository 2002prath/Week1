import java.util.Scanner; 
class Temp_converter
{ 
  public static double convertCelsius(double C)
  { 
      double F =    
       return  feet; 
  }  
  public static double convertFarenhite(double F) 
  { 
     double C =  
     return yard; 
  }  
  public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in); 
      System.out.println("Enter Temp in celsius"); 
      double C = sc.nextDouble(); 
       double F =   convertCelsius( yards);  
      System.out.println("Temperature in farenhite : "+ F);  


     System.out.println("Enter Temp in farenhite"); 
      double F = sc.nextDouble(); 
       double C =   convertFarenhite( yards);  
      System.out.println("Temperature in farenhite : "+ C); 
   
      sc.close(); 
   }  
}
