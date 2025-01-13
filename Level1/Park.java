import java.util.Scanner; 
 
class Park 
{ 
  public static int rounds(int a,int b,int c)
  { 
     return 5000/(a+b+c); 
  } 
   
   public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in); 
      System.out.println("Enter Side 1 of park in centimeter");  
      int a = sc.nextInt(); 
      System.out.println("Enter Side 2 of park in centimeter");  
      int b = sc.nextInt();
      System.out.println("Enter Side 3 of park in centimeter");  
      int c = sc.nextInt(); 
 
      int rounds = rounds(a,b,c); 
      System.out.println("Enter numebr of rounds to cover 5km "+ rounds); 
      sc.close();  
   } 
}