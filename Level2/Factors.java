import java.util.Scanner; 

class Factors 
{ 
  public static int[] findfactors(int N)
   {  
      int count =0; 
     for(int i=1;i<=N;i++)
     {
       if(N%i==0)
        count++;  
     }
      
      int[] factors = new int[count]; 
      int index =0 ;  
      for(int i=1;i<=N;i++)
      { 
        if(N%i==0)
         factors[index++] = i; 
      } 
      return factors;
   }  
     public static int sum(int[] factors)
    {   
        int sum=0; 
      for(int i=0;i<factors.length;i++)
       { 
          sum =sum + factors[i];   
       } 
        return sum; 
    } 
     public static long product(int[] factors)
      { 
          long product = 1; 
          for(int i=0;i<factors.length;i++)
           { 
             product = product * factors[i]; 
           }
         return product; 
      }  
       
     public static double square_sum(int[] factors)
      { 
         double square_sum = 0; 
          for(int i=0;i<factors.length;i++)
           { 
              square_sum = square_sum + Math.pow(factors[i],2);     
           } 
          return square_sum; 
      }
      
     public static void main(String[] mmg)
      { 
        Scanner sc = new Scanner(System.in); 
         System.out.println("Enter any natural numbers to find factors"); 
          int Number = sc.nextInt(); 
     
         int[] factors = findfactors(Number); 
         
         System.out.println("Factors of a number: "+ Number); 
          for(int i=0;i<factors.length;i++)
            { 
               System.out.print(factors[i]+ " ");  
            }  
              System.out.println(); 

         int sum = sum(factors); 
         System.out.println("Sum of factors "+ sum); 
 
         long product = product(factors); 
         System.out.println("Product of factors is "+ product); 
 
         double square_sum = square_sum(factors); 
         System.out.println("Square sum of factors is "+ square_sum); 

       sc.close(); 
     } 
 }

          