import java.util.Scanner; 

class Greatest_factor
{  
  public static void main(String[] amg)
     { 
       Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt(); 
         int max =0; 
        for(int i=1;i<N;i++) 
        { 
           if(N%i==0) 
           { 
              if(i>max)
               max = i;       
           }
        } 
           System.out.println("Greatest factor of a number is "+ max); 
      }
}