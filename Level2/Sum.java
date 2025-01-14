import java.util.Scanner; 
class Sum 
{ 
  public static int sum(int N)
  { 
    if(N ==0)
     return 0; 
    else 
      return N + sum(N-1); 
   }
   
   public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in); 
      System.out.println("Enter any natural number ");  
      int N  = sc.nextInt(); 
      int sum = sum(N); 
      System.out.println("Sum of a natural number" + sum); 
      sc.close();  
    } 
}
  