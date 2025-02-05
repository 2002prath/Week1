import java.util.Scanner; 
 

class Youngest 
{ 
  public static void main(String[] mmg)
    {   
      Scanner sc = new Scanner(System.in); 
       int N1 = sc.nextInt(); 
       int N2 = sc.nextInt(); 
       int N3 = sc.nextInt(); 

       if(N1<N2 && N1<N3) 
       System.out.println("Yes,Amar  is a youngest person"); 
       else if(N1>N2 && N2<N3) 
       System.out.println("Yes,Akbar  is a youngest person"); 
       else 
       System.out.println("Yes,Anthony  is a youngest person"); 

     
       sc.close();     
    } 
}  