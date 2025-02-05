import java.util.Scanner; 
 

class Number_checking_array
{  
   public static void main(String[] amg)
    {  
       Scanner sc = new Scanner(System.in); 
        int[] a = new int[5];
          
             for(int i=0;i<5;i++) 
            {  
               a[i] = sc.nextInt(); 
             if(a[i] <0 ) 
               System.out.println("It is an negative number"); 
              
             else if(a[i] ==0 ) 
               System.out.println("It is a zero"); 
             else      
             System.out.println("It is a positive number"); 
            }
      
      
      sc.close();  
    }
} 
