import java.util.Scanner; 
 
class Array_2D
{ 
  public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in); 
      int x =sc.nextInt(); 
      int y = sc.nextInt();  
     int[][]  a = new int[x][y]; 
      
      for(int i=0;i<x;i++)
      { 
        for(int j=0;j<y;j++)
         { 
           a[i][j] = sc.nextInt();  
           System.out.print(a[i][j] + " "); 
         } 
           System.out.println(); 
      }  
       sc.close(); 
    } 
}