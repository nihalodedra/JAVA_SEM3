import java.util.Scanner;

public class MiniBank {

    record BankInfo(String name, String branch) {
    }

    enum MenuOption {
        OPEN_ACCOUNT,
        DEPOSIT,
        WITHDRAW,
        TRANSFER,
        EXIT
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankInfo bank = new BankInfo("MiniBank", "CHARUSAT");

        System.out.println(bank.name());
        System.out.println(bank.branch());

        Account[] accounts = {
            new Account("Nihal"),
            new Account("Rahul"),
            new Account("Amit")
        };

        accounts[0].deposit(1000);
        accounts[1].deposit(2000);
        accounts[2].deposit(3000);

        System.out.println("Nihal: " + accounts[0].getBalance());
        System.out.println("Rahul: " + accounts[1].getBalance());
        System.out.println("Amit: " + accounts[2].getBalance());

        while (true) {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Amount: ");
                accounts[0].deposit(sc.nextLong());

            } else if (choice == 2) {

                System.out.print("Amount: ");
                accounts[0].withdraw(sc.nextLong());

            } else if (choice == 3) {

                System.out.println(
                    "Balance: " + accounts[0].getBalance()
                );

            } else if (choice == 4) {

                System.out.println("Goodbye!");
                break;

            } else {

                System.out.println("Wrong choice!");
            }
        }

        sc.close();
    }
}