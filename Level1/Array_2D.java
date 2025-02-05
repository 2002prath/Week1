import java.util.Scanner; 
 
class Array_2D
{ 
  public static void main(String[] mmg)
   { 
     Scanner sc = new Scanner(System.in); 
      System.out.println("Give number of rows");  
      int x =sc.nextInt(); 
      System.out.println("Give number of columns"); 
      int y = sc.nextInt();  
     int[][]  a = new int[x][y]; 
      
     System.out.println("Matrix is: "); 
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