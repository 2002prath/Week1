import java.util.*; 
 
class Odd_Even 
{ 
 public static void main(String[] mmg)
 {  
   Scanner sc = new Scanner(System.in); 
    int[] a = new int[5]; 
     for(int i=0;i<5;i++)
      { 
        a[i] = sc.nextInt(); 
         if(a[i]<=0)
          System.err.println("Error 400:Invalid input"); 
         else { 
          if(a[i]%2==0) 
          System.out.println("It is an even integer"); 
         else 
           System.out.println("It is an odd integer"); 
               } 
       } 
  } 
}