import java.util.Scanner; 

class Power 
{  
  public static void main(String[] mmg)
   {  
     Scanner sc = new Scanner(System.in);
     int base = sc.nextInt(); 
     int power = sc.nextInt(); 
     long result = 1; 
     for(int i=0;i<power;i++)
     {  
        result = result*base;  
      } 
       System.out.println(result); 
    } 
}


           