import java.util.Scanner; 
class Char_Array
{ 
  public static char[] user_defined(String str)
   {   int x = str.length(); 
     char[] ch1 = new char[x]; 
      for(int i=0;i<x;i++)
       { 
         ch1[i] = str.charAt(i);  
       }
       return ch1;  
   }   
    
    public static char[] built_in(String str)
     { 
        char[] ch2 = str.toCharArray(); 
         return ch2;      
     } 

 
     public static void main(String[] music_gamez)
     { 
       Scanner sc = new Scanner(System.in); 
        System.out.println("Enter  String"); 
        String str = sc.next(); 
        
        char[] x = user_defined(str); 
        char[] y = built_in(str); 
        
         System.out.println("char array of a following string is :" + y);  

         if(x.equals(y))
         System.out.println("Yes both methods have the same results"); 
     
         sc.close(); 
      }
}