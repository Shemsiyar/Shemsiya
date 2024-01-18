import java.util.Scanner;
/**
 * Write a description of class mult here.
 *
 * @author (Shemsiya Omar Rashid)
 * @version (BITA/6/22/023/TZ)
 */
public class mult
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = scanner.nextInt();
        System.out.println();
    
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                int result = i * j;
                System.out.printf("%-6d", result);
    scanner.close();
            }
            System.out.println();
        }
    }
}
