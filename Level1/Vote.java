
import java.util.*; 
 
class Vote
{ 
  public static void main(String[] mmg)
    { 
       Scanner sc = new Scanner(System.in); 
       int[] a = new int[10];  
        for(int i=0;i<10;i++)
        { 
          a[i] = sc.nextInt(); 
          if(a[i]>18)
          System.out.println("yes, he can give vote"); 
          else 
          System.out.println("No, he/she can not give vote");  
        } 
         
        sc.close(); 
     }
}  

   