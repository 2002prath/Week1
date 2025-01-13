import java.util.Scanner; 
 
class Handshakes 
{ 
  public static int handshakes(int N)
   {  
     return (N*(N-1))/2; 
   } 
  
   public static void main(String[] mmg)
    { 
      Scanner sc = new Scanner(System.in); 
      int N = sc.nextInt();
 
      int handshakes = handshakes(N); 
 
      System.out.println("Total number of handshakes are "+ handshakes); 
  
      sc.close(); 
    } 
}