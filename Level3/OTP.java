import java.util.*;

class OTP {

    
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    
    public static boolean areOTPsUnique(int[] otps) {
    for (int i = 0; i < otps.length; i++) {
        for (int j = i + 1; j < otps.length; j++) {
            if (otps[i] == otps[j]) {
                return false;
            }
        }
    }
    return true;
}


    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store 10 OTPs

        
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

       
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        
        boolean unique = areOTPsUnique(otps);
        if (unique) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are not unique.");
        }
    }
}