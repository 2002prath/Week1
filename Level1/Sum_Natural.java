import java.util.Scanner; 
class Sum_Natural 
{   
  static int sum =0; 
  public static int display_sum(int N) 
  { 
     for(int i=1;i<=N;i++)
       { 
         sum = sum + i; 
       } 
       return sum;  
  }
     public static void main(String[] amg)
     { 
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Natural number"); 
        int N = sc.nextInt(); 
     
        sum = display_sum(N); 
        System.out.println("Sum of all natural number is "+ sum); 
     
          sc.close(); 
      } 
} 
 