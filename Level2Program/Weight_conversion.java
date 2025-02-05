import java.util.Scanner; 

class Weight_conversion 
{ 
  public static void main(String[] amg)
   { 
     Scanner sc = new Scanner(System.in); 
       double kg = sc.nextInt();                 // Hint :  1 pound = 2.2 kg
 
        double pound = kg/2.2; 
                         
     
        
        
       System.out.println("The weight of the person in pound is "+ pound +" and in kg is "+ kg); 
        sc.close(); 
    } 
}  

