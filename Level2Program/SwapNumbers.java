import java.util.Scanner;

class Cities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        int From_city = sc.nextInt();
        int To_via_city = sc.nextInt();
        int To_final_city = sc.nextInt(); 

         int distance_1 =  To_via_city - From_city; 
         int distance_2 =   To_final_city - To_via_city; 
         int total_distance = distance_1 + distance_2 ;     

       System.out.println(total_distance);

        sc.close();
    }
}
