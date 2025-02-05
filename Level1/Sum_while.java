import java.util.Scanner; 

class Sum_while
{ 
  public static void main(String[] amg)
   {  
     Scanner sc = new Scanner(System.in); 
     double a =sc.nextDouble(); 
   
     double sum = 0.0; 
     
      
       if(a == 0.0)
       System.out.print("We got the desired result"); 
       else  
       { 
           
          int i=1;  
        while(a>i)
        {  sum = sum + i;   
            i++; 
        } 
          System.out.println(sum); 
       } 
          

     int total = n*(n+1)/2; 
     
          if(sum == total) 
          System.out.println("Hence proved, that both ways are right to find the result"); 
          else 
          System.out.println("method is not right"); 
    }
}