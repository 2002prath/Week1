import java.util.Scanner; 
 

class Vote
{  
   public static void main(String[] amg)
    {  
       Scanner sc = new Scanner(System.in); 
        int age = sc.nextInt(); 
         
             if(age>18 ) 
               System.out.println("Yes, can give a vote"); 
             else      
             System.out.println("No, can not give vote"); 
        
      
      
      sc.close();  
    }
} 
