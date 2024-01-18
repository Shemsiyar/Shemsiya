 import java.util.Scanner;
/**
 * Write a description of class grspay here.
 *
 * @author (Shemsiya omar rashid)
 * @version (BITA/6/22/023/TZ)
 */
public class grspay
{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter employee ID number: ");
        int employeeID = Scanner.nextInt();
        System.out.print("Enter hourly rate of pay: ");
        double hourlyRate = Scanner.nextDouble();
        System.out.print("Enter hours worked for the week: ");
        double hoursWorked = Scanner.nextDouble();
        double grossPay = calculateGrossPay(hourlyRate, hoursWorked);
        double netPay = calculateNetPay(grossPay);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Net Pay: $" + netPay);
Scanner.close();
    }
    private static double calculateGrossPay(double hourlyRate, double hoursWorked) {
        double grossPay;
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            grossPay = (40 * hourlyRate) + (1.5 * hourlyRate * overtimeHours);
        } else {
            grossPay = hoursWorked * hourlyRate;
        }
        return grossPay;
    }
    private static double calculateNetPay(double grossPay) {
        double taxRate = 0.20;
        return grossPay * (1 - taxRate);
    }
}
