import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your message here and confirm with ENTER:");
        String text = scanner.nextLine();
        System.out.println("Input the length of a sms:");
        int smsLength = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input the price of a sms:");
        String unitPrice = scanner.nextLine();

        BigDecimal BDUnitPrice = new BigDecimal(unitPrice);

        Paginator paginator = new Paginator(smsLength);
        CostCalculate calculator = new CostCalculate(new BigDecimal(unitPrice));
        Compresor compresor = new Compresor();

        int countSMS = paginator.paginate(text).length;

        String compressedMessage = compresor.compres(text);
        String[] paginatedMessage = paginator.paginate(compressedMessage);
        System.out.println("Your codded and splited message: " + Arrays.toString(paginatedMessage));
        System.out.println("Cost of your message(s): " + calculator.calculate(countSMS, BDUnitPrice ));
    }
}
