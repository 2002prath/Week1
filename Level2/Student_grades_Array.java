import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
  
           double[] physics = new double[numberOfStudents]; 
           double[] chemistry = new double[numberOfStudents]; 
           double[] maths = new double[numberOfStudents];  
           doube[] percentage = new double[numberOfStudents];       
           String[] grade = new String[numberOfStudents]; 

          for(int i=0;i<numberOfStudents;i++)
          { 
            physics[i] =sc.nextDouble(); 
            chemistry[i] =sc.nextDouble(); 
            maths[i] =sc.nextDouble();  
 
           percentage = ( physics[i] + chemistry[i] + maths[i])/3.0; 
                      
        
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            } 
           System.out.println("Percentage of a student "+ percentages[i] + " Grades "+grades[i]); 
      }
        sc.close();
    }
}
