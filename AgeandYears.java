import java.util.Scanner;
/**
 * Write a description of class AgeandYears here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeandYears
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter years of citizenship: ");
        int yearsOfCitizenship = scanner.nextInt();

        boolean senateEligible = isSenateEligible(age, yearsOfCitizenship);
        boolean houseEligible = isHouseEligible(age, yearsOfCitizenship);

        System.out.println("Senate Eligibility: " + senateEligible);
        System.out.println("House Eligibility: " + houseEligible);
        scanner.close();
    }

    private static boolean isSenateEligible(int age, int yearsOfCitizenship) {
        return age >= 30 && yearsOfCitizenship >= 9;
    }

    private static boolean isHouseEligible(int age, int yearsOfCitizenship) {
        return age >= 25 && yearsOfCitizenship >= 7;
    }
}
