import java.util.Scanner; 

class Harshad 
{ 
  public static void main(String[] mmg) 
    { 
      Scanner sc = new Scanner(System.in); 
      int sum =0 ; 
      int N = sc.nextInt();  
      int Original_num = N; 
      while(N>0)
      {  
       int x = N%10; 
       sum = sum + x;  
       N = N/10; 
      } 
        if(Original_num %sum==0) 
        System.out.println(Original_num +" is Harshad number");
        else 
        System.out.println(Original_num +" is not a Harshad number");
   
         sc.close(); 
    } 
}    