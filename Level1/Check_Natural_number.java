import java.util.Scanner; 
 

class Check_Natural_number 
{ 
  public static void main(String[] mmg)
    {   
      Scanner sc = new Scanner(System.in); 
       int N = sc.nextInt(); 


       if(N <0) 
       System.out.println("It's not a Natural number"); 
       else if
       System.out.println("It's  a Natural number"); 

        int sum = (N*(N+1))/2; 
        System.out.println(sum); 
    } 
}  