import java.util.Scanner;
/**
 * Write a description of class lagSmal here.
 *
 * @author (Shemsiya omar rashid)
 * @version (BITA/6/22/023/TZ)
 */
public class lagSmal
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        while (true) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            if (number == 99) {
                break;
            }
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        scanner.close();
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        
    }
}

