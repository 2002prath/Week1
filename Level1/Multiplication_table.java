import java.util.Scanner; 

class Table 
{ 
  public static void main(String[] mmg) 
    { 
      Scanner sc = new Scanner(System.in); 
       int[] a = new int[5]; 
                                    // a = number 
                                    // in this code, i take different file_name and class_name 
        for(int i=0;i<5;i++)
        { 
          a[i] = sc.nextInt(); 
           for(int j=1;j<=10;j++)
              { 
                int result= a[i]*j; 
                System.out.println(a[i] +" * "+ j  +" = "+ result); 
              }  
        }   
      }
}