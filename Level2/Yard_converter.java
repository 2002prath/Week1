class Yard_converter
{ 
  public static double convertYardsToFeet(double yards)
  { 
     double  feet  =  yards * 3;   
       return  feet; 
  }  
  public static double convertFeetToYard(double feets) 
  { 
     double yard = feet * 0.3333; 
     return yard; 
  }  
  public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in); 
      System.out.println("Enter value in yards");  
     double yards = sc.nextDouble(); 
       double feet =   convertYardsToFeet( yards);  
      System.out.println("Unit in feet is "+ feet); 
   
      sc.close(); 
   }  
}
