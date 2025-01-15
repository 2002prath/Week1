import java.util.Scanner; 
class Compare
{ 
  public static boolean compare(String str1,String str2)
   {   int x = str1.length(); 
       int y = str2.length(); 
        if(x!=y)
         {
          return false; 
         } 
        else 
         for(int i=0;i<x;i++)
          { 
            if(str1.charAt(i) != str2.charAt(i)) 
                {
                 return false ;
                }      
          } 
     return true; 
   }     
    public static boolean equal(String str1,String str2)
     { 
         if(str1.equals(str2)) 
           return true; 
          else 
           return false;  
     } 
     public static void main(String[] music_gamez)
     { 
       Scanner sc = new Scanner(System.in); 
        System.out.println("Enter first String"); 
        String str1 = sc.next(); 
        System.out.println("Enter second String"); 
        String str2 = sc.next(); 
        
        boolean x = compare(str1,str2); 
        boolean y = equal(str1,str2);  
     
         

         if(x)
         System.out.println("yes,both strings are equal"); 
         else 
         System.out.println("No, both strings are not equal");  

         if(x == y)
         System.out.println("Yes both methods have the same results"); 
     
         sc.close(); 
      }
}