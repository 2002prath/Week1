import java.util.*; 


class Leap_year 
{ 
  public static void main(String[] mmg)
   { 
      Scanner sc = new Scanner(System.in); 
       int year = sc.nextInt(); 
    
       
       if(year%100==0 && year%400==0)
       System.out.println("It is a leap year");  
       else if(year%4==0) 
       System.out.println("It is a leap year"); 
       else 
       System.out.println("It is not a leap year");   
 
       sc.close(); 
    } 
}