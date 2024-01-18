import java.util.Scanner;
/**
 * Write a description of class posneg here.
 *
 * @author (Shemsiya Omar Rashid)
 * @version (BITA/6/22/023/TZ)
 */
public class posneg
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of positive numbers: " + sum);
        scanner.close();
    }
}

