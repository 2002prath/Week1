import java.util.Scanner; 
 
class Factors
{ 
  public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in); 
     int number = sc.nextInt(); 
 
     for(int i=2;i<number;i++)
      { 
        if(number%i==0)
         System.out.println(i+" is a factor of "+ number); 
      } 
       sc.close(); 
   }
}