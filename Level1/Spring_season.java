import java.util.Scanner; 
 

class Spring_season
{  
   public static void main(String[] amg)
    {  
       Scanner sc = new Scanner(System.in); 
        int day = sc.nextInt(); 
        String month = sc.nextLine();  
        
        if(month=="March" || month =="April" || month =="June" || month=="May") 
         {  
             if(month == "March"&& (day>20 && day <=31)
              System.out.println("yes it's an spring season"); 
             else if(month =="June" && (day<20)
              System.out.println("yes it's an spring season"); 
              else 
                System.out.println("yes it's an spring season"); 
          }  
          
          else      
             System.out.println("yes it's not an spring season"); 
        
      
      
      sc.close();  
    }
} 
