import java.util.Scanner;

class SimpleInterestCalculator {
    
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = sc.nextDouble();

        
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        
        System.out.printf("Simple interest for a given principal,rate and time is "+simpleInterest);

        sc.close();
    }
}
