import java.util.Scanner;
/**
 * Write a description of class Distance here.
 *
 * @author (Shemsiya omar rashid)
 * @version (BITA/6/22/023/TZ)
 */
public class Distance
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("What is the speed? ");
        double speed = scanner.nextDouble();
        System.out.print("How many hours has it traveled? ");
        int hours = scanner.nextInt();
        System.out.println("Hour\tDistance Traveled");
        for (int hour = 1; hour <= hours; hour++) {
            double distance = speed * hour;
            System.out.println(hour + "\t"+ distance);
        }
    }
}