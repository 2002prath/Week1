import java.util.Scanner;

 class Number_4 {

    
    public static int[] findFactors(int number) {
        int count = 0;

        // Count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Store the factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        int maxFactor = Integer.MIN_VALUE;
        for (int factor : factors) {
            maxFactor = Math.max(maxFactor, factor);
        }
        return maxFactor;
    }

    // Method to find the sum of the factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static long findProductOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) { // Proper divisors
                sum += factor;
            }
        }
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) { // Proper divisors
                sum += factor;
            }
        }
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) { // Proper divisors
                sum += factor;
            }
        }
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == originalNumber;
    }

    // Helper method to calculate the factorial of a number
    private static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find and display factors
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Greatest factor
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));

        // Sum of factors
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));

        // Product of factors
        System.out.println("Product of Factors: " + findProductOfFactors(factors));

        // Product of cube of factors
        System.out.println("Product of Cube of Factors: " + findProductOfCubeOfFactors(factors));

        // Perfect number check
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));

        // Abundant number check
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));

        // Deficient number check
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));

        // Strong number check
        System.out.println("Is Strong Number: " + isStrongNumber(number));

        sc.close();
    }
}
