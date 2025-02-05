import java.util.Scanner; 

class Armstrong_number
{ 
  public static void main(String[] mmg) 
  { 
    Scanner sc = new Scanner(System.in); 
     int N = sc.nextInt();  
     int Original_number = N; 
     int sum = 0; 
      
       
     while(N>0) 
     { 
       double i= N%10; 
       
       sum = sum + Math.pow(i,3); 
       N = N/10;  
     } 
      if(sum == Original_number)
      System.out.println(N+" is an armstrong number ");
      else 
      System.out.println(N + " is not an armstrong number "); 
   } 
}