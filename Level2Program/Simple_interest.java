import java.util.Scanner; 

class Simple_interest 
{ 
  public static void main(String[] amg)
   { 
     Scanner sc = new Scanner(System.in); 
       double principle = sc.nextInt();                  

       double rate =sc.nextInt(); 
       double time = sc.nextInt();                    
     
         double simple_interest = (principle * rate * time)/100; 
        
       System.out.println("Simple Interest is "+simple_interest); 
        sc.close(); 
    } 
}  

