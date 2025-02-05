import java.util.Scanner; 

class Abundant
{ 
  public static void main(String[] mmg)
   {  
      Scanner sc = new Scanner(System.in); 
      int N = sc.nextInt(); 
      int sum=0; 
      for(int i=1;i<N;i++)
       { 
         if(N%i==0) 
         {  
           sum = sum + i; 
         }
       } 
      if(sum > N) 
      System.out.println(N +" is abundant number "); 
      else 
      System.out.println(N +" is not an abundant number "); 
   }
}