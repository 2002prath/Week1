import java.util.Scanner; 
 

class Number_checking
{  
   public static void main(String[] amg)
    {  
       Scanner sc = new Scanner(System.in); 
        int number = sc.nextInt(); 
         
             if(number <0 ) 
               System.out.println("It is an negative number"); 
              
             else if(number ==0 ) 
               System.out.println("It is a zero"); 
             else      
             System.out.println("It is a positive number"); 
        
      
      
      sc.close();  
    }
} 
