import java.util.Scanner;
  

class Bonus
{  
  public static void main(String[] amg) 
    {  
      Scanner sc = new Scanner(System.in);       
      System.out.print("Write your salary and year of service"); 
      int employee = new int[10]; 
      int salary = sc.nextInt();   
      int service = sc.nextInt();  
      int bonus =0; 
      
        for(int i=0;i<employee.length;i++)
       {  
          bonus = (salary*service)/100; 
           
          System.out.println("Bonus of a employee is "+ bonus);
          System.out.println("Salary of a employee is "+ salary);       
        }
        sc.close(); 
    }
}
