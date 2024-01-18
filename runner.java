import java.util.Scanner;
/**
 * Write a description of class runner here.
 *
 * @author (Shemsiya Omar Rashid)
 * @version (BITA/6/22/023/TZ)
 */
public class runner
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] runners = new String[3];
        double[] times = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the runner " + (i + 1) + ": ");
            runners[i] = scanner.nextLine();
            System.out.print("Enter the end time for " + runners[i] + ": ");
            times[i] = scanner.nextDouble();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (times[j] > times[j + 1]) {
                    double tempTime = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = tempTime;
                    String tempName = runners[j];
                    runners[j] = runners[j + 1];
                    runners[j + 1] = tempName;
                }
            }
        }
        System.out.println("\nRunners in the order they finished:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + runners[i]);
        }
        scanner.close();
    }


}
