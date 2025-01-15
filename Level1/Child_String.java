import java.util.Scanner; 
class Child_String
{ 
  public static String child(String str)
   {  
     StringBuilder sb = new StringBuilder();  
     for(int i=0;i<4;i++)
       { 
         sb.append(str.charAt(i)); 
       } 
      str = sb.toString(); 
     return str; 
   }   
    
    public static String substring(String str)
     { 
        String str1 = str.substring(0,4); 
       return str1;    
     } 

 
     public static void main(String[] music_gamez)
     { 
       Scanner sc = new Scanner(System.in); 
        System.out.println("Enter  String"); 
        String str = sc.next(); 
        
        String x = child(str); 
        String y = substring(str); 
        
         System.out.println("substring of original string is :" + x);  

         if(x.equals(y))
         System.out.println("Yes both methods have the same results"); 
     
         sc.close(); 
      }
}