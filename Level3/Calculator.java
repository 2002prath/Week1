import java.util.Scanner; 
 
class Calculator 
{ 
  public static void main(String[] mmg) 
    { 
       Scanner sc = new Scanner(System.in);
       System.out.println("write first number");  
       int first = sc.nextInt(); 
       System.out.println("write second number"); 
       int second = sc.nextInt(); 

        System.out.println("choose operation from add,minus,multiply,divide");  
       String op = sc.next(); 
                 
     
       switch(op) 
         {
         case "add": 
                   System.out.println(first + second);
         case "minus": 
                   System.out.println(first - second); 
         case "multiply": 
                   System.out.println(first * second); 
         case "divide": 
                    if(second==0)
                   System.out.println("Not determined"); 
                    else 
                    System.out.println(first/second);
         }      
    } 
}