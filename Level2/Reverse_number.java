import java.util.Scanner; 
 
class Reverse_number
{ 
   public static void main(String[] mmg)
    { 
       Scanner sc = new Scanner(System.in); 
       int N =sc.nextInt(); 
       int[] a = new int[10]; 
       
       while(N>0)
       { 
          int n = n%10; 
         System.out.print(n+"");
          N = N/10; 
       } 
      
    } 
}   