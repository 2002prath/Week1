import java.util.Scanner; 
class Distance
{  
  public static void main(String[] amg) 
   { 
      Scanner input = new Scanner(System.in); 
  
       System.out.println("Give your height in feet");  
      double feet= input.nextDouble();    // Input height in centimeter 
      double yards = feet/3; 
      double mile =   yards/1760;               // Given data:1 mile = 1760 yards and 1 yard is 3 feet



      System.out.println("Your Distance in feet is "+ feet +"while in yards is"+ yards +" and inches is"+ mile); 
  
       input.close();   
    } 
}