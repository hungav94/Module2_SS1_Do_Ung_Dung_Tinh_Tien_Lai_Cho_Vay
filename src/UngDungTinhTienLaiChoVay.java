import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interest_rate = 1.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money: ");
        money = scanner.nextDouble();
        System.out.println("Enter month: ");
        month = scanner.nextInt();
        System.out.println("Enter interest rate: ");
        interest_rate = scanner.nextDouble();

        double total_interest = 0;
        total_interest = money * (interest_rate / 100) / 12 * month;
        System.out.println("Total interest: " + total_interest);
    }
}
