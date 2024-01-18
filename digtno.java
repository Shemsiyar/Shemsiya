   import java.util.Scanner;
/**
 * Write a description of class digtno here.
 *
 * @author (Shemsiya Omar Rashid )
 * @version (BITA/6/22/023/TZ)
 */
public class digtno
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
        int number = scanner.nextInt();
        if (isFiveDigit(number)) {
            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        } else {
            System.out.println("Please enter a valid five-digit integer.");
        }scanner.close();
    }
    private static boolean isPalindrome(int num) {
       int originalNumber = num;
        int reversedNumber = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }
        return originalNumber == reversedNumber;
    }
    private static boolean isFiveDigit(int num) {
        return num >= 10000 && num <= 99999;
    }
}
