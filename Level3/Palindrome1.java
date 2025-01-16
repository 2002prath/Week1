import java.util.*; 
public class Palindrome1{ 
      
      static boolean check(String name)
       {    name = name.trim(); 
           int x = name.length(); 
             
          for(int i=0;i<x/2;i++)
          { 
             if(name.charAt(i)!=name.charAt(x-i-1))
               return false; 
          } 
            return true; 
        }
     public static void main(String[] mmg)
     { 
        Scanner sc =new Scanner(System.in); 
        System.out.println("Enter any name"); 
        String name = sc.nextLine(); 
        
        if(check(name))
        System.out.println("Given name is palindrome"); 
        else 
        System.out.println("Given name is not palindrome"); 
        
         sc.close();   
     }
}


