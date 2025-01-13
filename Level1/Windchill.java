import java.util.Scanner; 

class Windchill
{ 
  public static double wind(double temp,double speed)
   {  
      double  windChill = 35.74 + 0.6215 * temp + (0.4275*temp - 35.75) * Math.pow(speed,0.16); 
        return windChill;    
   }  
   
  public static void main(String[] mmg)
   { 
    Scanner sc = new Scanner(System.in); 
     System.out.println(" Enter temperature");  
     double temp = sc.nextDouble(); 
      System.out.println(" Enter speed"); 
     double speed = sc.nextDouble(); 
    
     double windchill = wind(temp,speed); 
     System.out.println("Windchill is "+ windchill);  
   }  
}
     