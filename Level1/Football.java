import java.util.Scanner; 

class Football
{ 
  public static void main(String[] mmg)
  { 
    Scanner sc = new Scanner(System.in); 
    double[]  player = new double[]; 
     double sum =0; 
    System.out.println("Enter height of all football players "); 
    for(int i=0;i<11;i++)
    { 
      player[i]= sc.nextDouble(); 
      sum = sum + player[i]; 
    }  
     double mean = sum/11; 
     System.out.println("average of all players height"+ mean); 
   } 
}   
  
       
      