import java.util.Scanner; 
 

class Check_number 
{  
   public static void checkpositive(int N)
   { 
       if(N <0) 
         System.out.println("It's not a Natural number"); 
       else 
       { 
         System.out.println("It's  a Natural number"); 
          checkeven(N);
       } 
    }    
   
     public static void checkeven(int N)
   {  
      if(N%2==0)
      System.out.println(N +"is even number also"); 
      else 
      System.out.println(N+"is odd number also");   
   } 
  public static void main(String[] mmg)
    {   
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check positivity");  
         int N = sc.nextInt(); 
         
        checkpositive(N);
        sc.close(); 
    } 
}  