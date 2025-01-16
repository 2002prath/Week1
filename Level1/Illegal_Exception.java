import java.util.Scanner; 

class Illegal_Exception                                //Illegal Argument Exception
{ 
  public static String display(String input)
   {  System.out.println("This will generate Illegal argument exception "); 
      String str = input.substring(3,2); 
      return str; 
    } 
    public static void main(String[] mmg)
    { 
      Scanner sc = new Scanner(System.in); 
       System.out.println(" Enter any string ");  
       String input = sc.next(); 
        display(input); 
       sc.close();   
    }  
 } 
