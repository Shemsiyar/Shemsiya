import java.util.Scanner;
/**
 * Write a description of class rainfull here.
 *
 * @author (Shemsiya Omar Rashid)
 * @version (BITA/6/22/023/TZ)
 */
public class rainfull
{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numYears = Scanner.nextInt();
        double totalRainfall = 0;
        int totalMonths = numYears * 12;
        for (int year = 1; year <= numYears; year++) {
            for (int month = 1; month <= 12; month++) {
                System.out.print("Enter inches of rainfall for Year " + year + ", Month " + month + ": ");
                double rainfall = Scanner.nextDouble();
                totalRainfall += rainfall;
            }
        }
        double averageRainfall = totalRainfall / totalMonths;
        System.out.println("\nNumber of months: " + totalMonths);
        System.out.println("Total inches of rainfall: " + totalRainfall);
        System.out.println("Average rainfall per month: " + averageRainfall);
        Scanner.close();
    }
}
