import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        while (true) {
            System.out.println("\n1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Balance: " + balance);
            }
            else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                balance += amount;
                System.out.println("Money Deposited");
            }
            else if (choice == 3) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Money Withdrawn");
                }
                else {
                    System.out.println("Insufficient Balance");
                }
            }
            else if (choice == 4) {
                break;
            }
        }
    }
}