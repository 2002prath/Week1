import java.util.Scanner;

 class String_Exception 
{
                                                     //Index out of bounds exception
        public static void generate_Exception() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        
        System.out.println("Character at index 100: " + text.charAt(100));
        sc.close();
    }

    
    public static void handle_Exception() { 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine(); 

        try {
            
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
           
            System.out.println("A StringIndexOutOfBoundsException was caught: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void main(String[] args) 
{
        System.out.println("Generating StringIndexOutOfBoundsException:");
        try {
            generate_Exception();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        System.out.println("Handling StringIndexOutOfBoundsException:");
        handle_Exception(); 
    }
}
