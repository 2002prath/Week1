import java.io.*;
import java.lang.*; 
import java.util.*; 



class Area_of_triangle
{ 
  public static void main(String[] amg)
   { 
     Scanner input = new Scanner(System.in); 
         
         System.out.print("Give base and height in centimeters");  
         
          double  base = input.nextInt(); 
          double  height = input.nextInt(); 
 
  
          double area_of_triangle = (1.0/2.0)*base*height; 
          double inches = area_of_triangle/2.54; 
          double foot =   inches/12;   

         System.out.println("Your area in cm is"+ area_of_triangle +"while in feet is"+ foot +"and inches is"+ inches );  
          input.close(); 
   } 
   
 }    
