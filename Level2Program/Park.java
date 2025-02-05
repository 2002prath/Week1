import java.util.Scanner; 

class Park 
{ 
  public static void main(String[] amg)
   { 
     Scanner sc = new Scanner(System.in); 
       double side1 = sc.nextInt();                 
       double side2 = sc.nextInt();  
       double  side3 = sc.nextInt(); 
                   
       double rounds = 5000/(side1 + side2 + side3); 
            rounds = Math.ceil(); 
        
       System.out.println("The total number of rounds the athlete will run is"+ rounds); 
        sc.close(); 
    } 
}  

