import java.util.Scanner;

/**
 * Write a description of class Sum here.
 *
 * @author (Shemsiya omar rashid)
 * @version (BITA/6/22/023/TZ)
 */
public class Sum
{
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 2-digit integer: ");
        int x = scanner.nextInt();
        if (x < 10 || x > 99 || x % 10 == 0) {
            System.out.println("Invalid input. Please enter a 2-digit .");
        } else {
            int y = (x % 10) * 10 + (x / 10);
            System.out.println("Original no (x): " + x);
            System.out.println("Reversed no (y): " + y);
            System.out.println("Sum (x + y): " + (x + y));
        }
        scanner.close();
    }
}