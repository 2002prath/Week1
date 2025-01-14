import java.util.Scanner;
 class Number_2 {

   
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    
    public static boolean isSpy(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        return sumOfDigits == productOfDigits;
    }

    
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check prime
        System.out.println("Is Prime: " + isPrime(number));

        // Check neon
        System.out.println("Is Neon: " + isNeon(number));

        // Check spy
        System.out.println("Is Spy: " + isSpy(number));

        // Check automorphic
        System.out.println("Is Automorphic: " + isAutomorphic(number));

        // Check buzz
        System.out.println("Is Buzz: " + isBuzz(number));

        sc.close();
    }
}
