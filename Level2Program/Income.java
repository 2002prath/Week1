import java.util.Scanner; 

class Income 
{ 
  public static void main(String[] amg)
   { 
     Scanner sc = new Scanner(System.in); 
       int salary = sc.nextInt();                  

       int bonus =sc.nextInt(); 
       int total_salary = salary + bonus;                    

  
       System.out.println("The total_salary of a person"+ total_salary); 
        sc.close(); 
    } 
}  

