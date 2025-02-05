import java.util.Scanner; 
 
class Multiple
{ 
  public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in); 
     int number = sc.nextInt(); 
 
     for(int i=1;i<100;i++)
      { 
         if(i%number==0)
         System.out.println(i+" is a  multiple of "+ number);  
         
      } 
       sc.close(); 
   }
}