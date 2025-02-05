import java.util.*; 


class Handshakes 
{ 
  public static void main(String[] amg) 
   {  
      Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt();               // n = number_of_handshakes
       int total_handshakes = (n*(n-1))/2;               

       System.out.println("Total number of handshakes are"+total_handshakes );  


       sc.close(); 
  } 
}

      



