
/**
 * Write a description of class Salary here.
 *
 * @author (Shemsiya omar rashid)
 * @version (BITA/6/22/023/TZ)
 */
public class Salary
{
    public static void main(String[] args) {
        double annualSalary = 32500.0;
        double biMonthlyGrossPay = annualSalary / 24;
        System.out.println("Bi-Monthly Gross Pay: $" + biMonthlyGrossPay);
        double biWeeklyGrossPay = annualSalary / 26;
        System.out.println("Bi-Weekly Gross Pay: $" + biWeeklyGrossPay);
    }
}
