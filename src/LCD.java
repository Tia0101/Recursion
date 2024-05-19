import java.util.Scanner;
public class LCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first fraction's numerator and denominator: ");
        String fraction1 = input.nextLine();
        int numeratorOne = Integer.parseInt(fraction1.substring(0, fraction1.indexOf("/")));
        int denominatorOne = Integer.parseInt(fraction1.substring(fraction1.indexOf("/") + 1));

        System.out.println("Enter the second fraction's numerator and denominator: ");
        String fraction2 = input.nextLine();
        int numeratorTwo = Integer.parseInt(fraction2.substring(0, fraction2.indexOf("/")));
        int denominatorTwo = Integer.parseInt(fraction2.substring(fraction2.indexOf("/") + 1));

        System.out.println("The least common denominator is: " + findLCD(numeratorOne, denominatorOne, numeratorTwo, denominatorTwo));

    }
        // Recursive method to return greatest common divisor of two numbers
        public static int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }
    
        // Method to return least common  multiple of two numbers
        public static int lcm(int a, int b) {
            return (a * b) / gcd(a, b);// call to recursive method gcd to find the lcm of two numbers
        }

        // Method to find the LCD of two fractions
        public static int findLCD(int numeratorOne,int denominatorOne,int numeratorTwo, int denominatorTwo) {
            return lcm(denominatorOne, denominatorTwo);// call to lcm method to find the least common denominator of two fractions
        }
}