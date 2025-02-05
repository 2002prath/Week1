import java.util.Scanner; 

class Armstrong_number
{ 
  public static void main(String[] mmg) 
  { 
    Scanner sc = new Scanner(System.in); 
     int N = sc.nextInt(); 
     int sum = 0; 
     int i=0; 
     int x =0;  
     while(N>0) 
     { 
       i= N%10; 
       x = Math.pow(i,3); 
       sum = sum + x; 
       N = N/10;  
     } 
      if(sum == N)
      System.out.println(N+" is an armstrong number ");
      else 
      System.out.println(N + " is not an armstrong number "); 
   } 
}