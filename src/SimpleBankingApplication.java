import java.util.Scanner;

public class SimpleBankingApplication {
    private static double balance = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Simple Banking Application!");
        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            if (option == 1) {
                deposit();
            } else if (option == 2) {
                withdraw();
            } else if (option == 3) {
                checkBalance();
            } else if (option == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }
        scanner.close();
    }

    private static void deposit() {
        System.out.println("Enter the amount to deposit:");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.printf("Deposit successful! New balance: $%.2f\n", balance);
    }

    private static void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        double amount = scanner.nextDouble();
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Withdrawal successful! New balance: $%.2f\n", balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    private static void checkBalance() {
        System.out.printf("Current balance: $%.2f\n", balance);
    }
}

