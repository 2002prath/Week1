import java.util.Scanner; 
 

class Spring_season
{  
    public static void display_season(int day,String month)
     {  
       if(month=="March" || month =="April" || month =="June" || month=="May") 
         {  
             if(month == "March"&& (day>20 && day <=31))
              System.out.println("yes it's an spring season"); 
             else if(month =="June" && (day<20))
              System.out.println("yes it's an spring season"); 
              else 
                System.out.println("yes it's an spring season"); 
          }  
          
          else      
             System.out.println("yes it's not an spring season"); 
     
     }
   public static void main(String[] amg)
    {  
       Scanner sc = new Scanner(System.in); 
        System.out.println("Enter day "); 
        int day = sc.nextInt();
  
        System.out.println("Enter month "); 
        String month = sc.nextLine(); 
  
        display_season(day,month); 
        sc.close();  
    }
} 
