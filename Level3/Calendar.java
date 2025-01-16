import java.util.*;

class Calendar{

    
    public static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in the month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;

        if (m <= 2) {
            m += 12;
            y--;
        }

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0;
    }

    
    public static void displayCalendar(int month, int year) {
        
        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDays(month, year);

        int firstDayOfMonth = getFirstDayOfMonth(month, year);

        // Display the calendar header
        System.out.printf("        %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("    ");
        }

        
        for (int day = 1; day <= daysInMonth; day++) {
            // Print day, right-justified to a width of 3
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday
            if ((firstDayOfMonth + day) % 7 == 0) {
                System.out.println();
            }
        }

        
        if ((firstDayOfMonth + daysInMonth) % 7 != 0) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        /
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        
        displayCalendar(month, year);

        
        input.close();
    }
}