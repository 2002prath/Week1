import java.util.Scanner; 

class Perimeter 
{ 
  public static void main(String[] amg)
  { Scanner input = new Scanner(System.in); 
    
                                            // Perimeter of Square
        
    int side = input.nextInt(); 
    int perimeter = 4*side;  
    System.out.println("The length of the side is "+ side +"whose perimeter is "+perimeter); 
  
  } 
}