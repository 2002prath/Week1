import java.util.Scanner; 
class Reminder 
{  
  public static int[] Q_and_R(int n1,int n2)
   { 
       
       
       int x = n1/n2; 
      int  y = n1%n2; 
          return new int[] {x,y};
  
    }
    
    public static void main(String[] mmg)
    { 
      Scanner sc = new Scanner(System.in); 
       System.out.println("Enter any number"); 
       int a =sc.nextInt(); 
       System.out.println("Enter any number"); 
       int b =sc.nextInt(); 
  
        int[] p=  Q_and_R(a,b); 
      System.out.println(p[0] +" "+p[1]); 
     }
} 