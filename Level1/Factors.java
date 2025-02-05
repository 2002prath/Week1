import java.util.Scanner; 
 
class Factors
{ 
   public static void main(String[] mmg) 
    { 
      Scanner sc = new Scanner(System.in); 
       int N = sc.nextInt();  
       
       int x =10; 
       int[] n = new int[x]; 
         
        
       for(int i=1;i<N;i++)
        { 
          if(N%i==0)
          System.out.println("Factors of a "+  N  +" are "+i);  
        } 
        
    
          
          sc.close(); 
     } 
}
       
          