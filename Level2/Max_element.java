import java.util.Scanner; 

class Max_element
{ 
  public static void main(String[] mmg) 
   { 
     Scanner sc = new Scanner(System.in)
       int N = sc.nextInt(); 
       int limit = 10; 
       int[] n = new int[limit]; 
       int max_digit =0; 
   
         for(int i=0;N>0;i++)
        { 
          int x = N%10; 
          if(x > max_digit) 
            max_digit = x; 
          N = N/10;   
        } 
          System.out.println("Maximum digit is "+max_digit);   
    }
}   
             
           