import java.util.Scanner; 

class BMI
{ 
  public static void main(String[] mmg)
   {  
     Scanner sc = new Scanner(System.in); 
      System.out.println("Provide your height in centimeter"); 
      double height= sc.nextDouble(); 
      
        System.out.println("Provide your weight in kg"); 
       double weight = sc.nextDouble(); 
         
        height = height/100; 

   
      double bmi = weight/(height*height); 
       System.out.println(" BMI of a person is "+ bmi); 

       if(bmi<=18.4)
       System.out.println("underweight"); 
       else if(bmi>=18.5 && bmi<24.9) 
       System.out.println("Normal");   
       else if(bmi>=25.0 && bmi<39.9.9) 
       System.out.println("Overweight"); 
       else 
       System.out.println("Obese"); 
    } 
} 
