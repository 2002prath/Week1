import java.util.Scanner; 

class Trigonometric 
{ 
  public static double[] trignometric_function(double degree)
   { 
        double radians = Math.toRadians(degree);

        
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        
        return new double[]{sine, cosine, tangent};
   } 
   public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in); 
     System.out.print("Enter any number in degree "); 
     double degree = sc.nextDouble();
     
      double[]  p = new double[5];    
        p=  trignometric_function(degree);  
 
      for(int i=0;i<3;i++)
     {  
      System.out.println(p[i]);  
      } 
      sc.close();         
    }
}   