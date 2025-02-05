import java.util.Scanner; 

class Table_between_6_and_9 
{ 
  public static void main(String[] mmg) 
    { 
      Scanner sc = new Scanner(System.in); 
       int[] a = new int[5]; 
                                     // a = number 
       System.out.println("Please enter a number from 6 to 9");                               
        for(int i=0;i<5;i++)
        { 
          a[i] = sc.nextInt();  
           if(a[i]<6 || a[i]> 9)
           System.err.println(" ERROR:400 \n you have inserted wrong value \n please insert correct value"); 
           else 
           for(int j=1;j<=10;j++)
              { 
                int result= a[i]*j; 
                System.out.println(a[i] +" * "+ j  +" = "+ result); 
              }  
        } 
           sc.close();    
    }
}