import java.util.Scanner; 
 

class StudentVoteChecker
{   
    public static boolean votechecker(int age)
    {  
      if(age>=18) 
      return true; 
      else      
      return false;  
    }
   public static void main(String[] amg)
    {  
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age for voting process");  
        int age = sc.nextInt(); 
         
     boolean  x =  votechecker(age); 
   
      if(x)
       System.out.println("Yes, you can give vote "); 
      else 
      System.out.println("No, you can not give vote"); 
      
      
      sc.close();  
    }
} 
