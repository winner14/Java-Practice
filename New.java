import java.text.NumberFormat;
import java.util.Scanner;

public class New {

    public static void main (String[] args) {
        // Java program to calculate simple interest

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Principal = ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate = ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time(years) = ");
        double time = scanner.nextDouble();

        time = time * 12;

        double interest = (principal * rate * time) / 100;

        // String interest1 = toString(interest);
        String result = NumberFormat.getCurrencyInstance().format(interest);
        // String result = NumberFormat.getCurrencyInstance().format(1234567.890);

        System.out.println("Simple Interest is = " + result);
        
    }
}