import java.util.Scanner; 
 

class Check_Max_number 
{ 
  public static void main(String[] mmg)
    {   
      Scanner sc = new Scanner(System.in); 
       int N1 = sc.nextInt(); 
       int N2 = sc.nextInt(); 
       int N3 = sc.nextInt(); 

       if(N1>N2 && N1>N3) 
       System.out.println(N1 +" is a maximum number"); 
       else if(N2>N1 && N2 >N3)
       System.out.println(N2 + " is a maximum number");  
       else 
       System.out.println(N3 + " is a maximum number");
         
    } 
}  