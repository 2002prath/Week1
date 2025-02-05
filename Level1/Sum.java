import java.util.Scanner; 

class Sum
{ 
  public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in); 
     double[] a = new double[10]; 
      double sum =0.0; 
     
     for(int i=0;i<10;i++)
       { 
        a[i] =sc.nextDouble(); 
        if(a[i]<=0.0 || a[i]>10.0)
         { 
           System.err.println("this is an error message bcoz you have given negative or more than 10.0 value");  
           break; 
         } 
        else 
        sum = sum + a[i];    
       }  
          System.out.println("Total value of all input numbers is "+ sum);  
       sc.close(); 
   }
}
      
        