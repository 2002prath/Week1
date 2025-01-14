import java.util.*; 


class Leap_year 
{  
    public static void year(int year)
    {  
      if(year%100==0 && year%400==0)
       System.out.println("It is a leap year");  
       else if(year%4==0) 
       System.out.println("It is a leap year"); 
       else 
       System.out.println("It is not a leap year");   
     }


  public static void main(String[] mmg)
   { 
      Scanner sc = new Scanner(System.in);  
       System.out.println("Enter any year "); 
       int year = sc.nextInt(); 
        year(year); 
       sc.close(); 
    } 
}