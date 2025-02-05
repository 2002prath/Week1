import java.util.Scanner; 

class Marks
{ 
  public static void main(String[] mmg)
   {  
     Scanner sc = new Scanner(System.in); 

      int physics = sc.nextInt(); 
      int chemistry = sc.nextInt(); 
      int maths = sc.nextInt(); 
  
      int average= (physics+chemistry+maths)*100/300; 
  
      if(average >80) 
      System.out.println("Average is more than 80"+average +"and grade is A"); 
      else if(average<=79 && average >=70 ) 
      System.out.println("Average is more than 70"+average+"and grade is B");        
      else if(average<=69 && average >=60 ) 
      System.out.println("Average is more than 60"+average+"and grade is C");
      else if(average<=59 && average >=50 ) 
      System.out.println("Average is more than 50"+average+"and grade is D");     
      else if(average<=49 && average >=40 ) 
      System.out.println("Average is more than 40"+average+"and grade is E");     
      else 
      System.out.println("Average is less than 39"+average+"and grade is R");   
   } 
}        