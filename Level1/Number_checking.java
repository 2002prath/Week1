import java.util.Scanner; 
 

class Number_checking
{   
    public static void display_number(int N) 
     {
              if(N <0 ) 
               System.out.println("It is an negative number"); 
              else if(N ==0 ) 
               System.out.println("It is a zero"); 
              else      
               System.out.println("It is a positive number"); 
      }
  
   public static void main(String[] amg)
    {  
       Scanner sc = new Scanner(System.in);  
        System.out.println("Enter number to check it's nature "); 
        int number = sc.nextInt(); 
               
            display_number(number); 
        sc.close();  
    }
} 
