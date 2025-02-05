import java.util.Scanner; 

class Sum
{  
  public static void main(String[] amg) 
    {  
       Scanner sc = new Scanner(System.in); 
         System.out.println("write any number"); 
          int sum =0;  
          
      
         while(True) 
       {   
           int n = sc.nextInt(); 

          if(n == 0)
          break; 
          else 
          {  int i=0; 
             while(n>i) 
             { 
               sum = sum + n; 
                i++;   
             } 
             System.out.println(sum);  
          } 
       } 
    }                
}    