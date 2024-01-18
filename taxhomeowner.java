import java.util.Scanner;
/**
 * Write a description of class taxhomeowner here.
 *
 * @author (Shemsiya omar rashid)
 * @version (BITA/6/22/023/TZ)
 */
public class taxhomeowner
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of property: $");
        double actualValue = scanner.nextDouble();
        System.out.print("Enter the tax rate $");
        double taxRate = scanner.nextDouble();
        double assessedValue = 0.6 * actualValue;
        double annualPropertyTax = (assessedValue / 100) * taxRate;
        System.out.printf("The property $%.2f is $%.2f.%n", actualValue, annualPropertyTax);
        
         scanner.close();
    }
}

