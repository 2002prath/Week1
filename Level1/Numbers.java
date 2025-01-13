import java.util.Scanner; 
class Numbers 
{ 
  public static int smallest(int n1,int n2, int n3)
  {  int x=0; 
    
    if(n1<n2 && n1<n3)  
      x=n1; 
    else if(n1>n2 && n2<n3) 
      x=n2; 
    else 
      x = n3; 
  
      return x; 
   } 
 
     public static int largest(int n1,int n2, int n3)
  {  int x=0; 
    
    if(n1>n2 && n1>n3)  
      x=n1; 
    else if(n1<n2 && n2>n3) 
      x=n2; 
    else 
      x = n3; 
  
      return x; 
   }
 
   public static void main(String[] mmg)
    { 
     Scanner sc = new Scanner(System.in); 
      System.out.println("Enter any three numbers"); 
        int a = sc.nextInt(); 
        int b =sc.nextInt(); 
        int c = sc.nextInt(); 

      int small = smallest(a,b,c); 
      int large = largest(a,b,c);    
      
      System.out.println("Smallest number is "+small +"\n"+ "largest number is "+ large); 
      sc.close(); 
    }  
}