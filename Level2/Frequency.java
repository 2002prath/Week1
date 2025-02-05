import java.util.Scanner; 
 
class Frequency 
{  
  public static void main(String[] musicmg)
   {  
     Scanner sc = new Scanner(System.in);  
      System.out.print("Enter a number to find the frequency of a digit "); 
      int N = sc.nextInt(); 
      
      int[] frequency = new int[10]; 
 
      for(int i=0;0<N;i++)
      { 
         int digit = N%10; 
         frequency[digit]++; 
         N = N/10; 
      }
       
      for(int i=0;i<10;i++)
      {  
        System.out.print("Frequecy of a digit: "+ i +" is "+ frequency[i]  +"\n"); 
      } 
         sc.close(); 
   }     
}        