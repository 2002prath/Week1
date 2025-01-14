import  java.util.Scanner; 
 
class BMI
{  
  public static double bmi(double height,double weight)
  { 
     
    double BMI = weight/height*height; 
     return BMI;  
  }
  public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in);  
      
      System.out.print("Enter number of person");
      int number_of_person = sc.nextInt();
  
     double[] height = new double[number_of_person]; 
     double[] weight = new double[number_of_person];  
     double[] BMI = new double[number_of_person]; 
     String[] status = new String[number_of_person];  
 
      
     for(int i=0;i<number_of_person;i++)
      { 
        System.out.println("Enter height of a person"); 
             height[i] = sc.nextDouble();  
        System.out.println("Enter height of a person"); 
             weight[i] = sc.nextDouble(); 
        
       double  BMI= BMI(height,weight); 
   
          if (BMI[i] < 18.5) {
                status[i] = "Underweight";
            } else if (BMI[i] >= 18.5 && BMI[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (BMI[i] >= 25 && BMI[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            } 
       } 
           for(int i=0;i<number_of_person;i++)
           { 
             System.out.println("height of a person is "+height[i]); 
             System.out.println("weight of a person is "+weight[i]); 
             System.out.println("BMI of a person is "+ BMI[i]);
             System.out.println("status of a person is"+status[i]);  
           } 
         sc.close(); 
 
     } 
}      
