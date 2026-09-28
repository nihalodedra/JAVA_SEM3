package service;
import model.Account;
import model.CurrentAccount;
import model.FixedDepositAccount;
import model.SavingsAccount;
import static java.lang.System.out;

public class MiniBank {

    record BankInfo(String name, String branch) {
    }

    public static void main(String[] args) {

        BankInfo bank = new BankInfo("MiniBank", "CHARUSAT");

        out.println(bank.name());
        out.println(bank.branch());

        Account[] accounts = {
            new SavingsAccount("Nihal", 10000, 2000),
            new CurrentAccount("Rahul", 5000, 3000),
            new FixedDepositAccount("Amit", 20000)
        };

        out.println("\nAccount Details:");

        for (Account a : accounts) {

            out.println(
                a.getName() +
                " - Balance: " +
                a.getBalance()
            );

            out.println(
                "Interest Rate: " +
                a.interestRate() + "%"
            );

            out.println(
                "Yearly Interest: " +
                a.yearlyInterest()
            );

            if (a instanceof SavingsAccount s) {
                out.println(
                    "Savings Account Balance: " +
                    s.getBalance()
                );
            }

            out.println();
        }

        WithdrawRule rule1 = new WithdrawRule() {

            @Override
            public boolean allow(Account account, long amount) {
                return account.canWithdraw(amount);
            }
        };

        WithdrawRule rule2 =
                (account, amount) -> account.canWithdraw(amount);

        out.println("Anonymous Class Rule:");
        out.println(
            rule1.allow(accounts[0], 7000)
        );

        out.println("\nLambda Rule:");
        out.println(
            rule2.allow(accounts[1], 7000)
        );

        out.println("\nWithdrawal:");

        if (rule2.allow(accounts[0], 7000)) {
            accounts[0].withdraw(7000);
            out.println("Nihal withdrawal successful");
        } else {
            out.println("Nihal withdrawal failed");
        }

        if (rule2.allow(accounts[2], 5000)) {
            accounts[2].withdraw(5000);
            out.println("Amit withdrawal successful");
        } else {
            out.println("Amit withdrawal failed");
        }

        out.println("\nAnnotation Validation:");

        Account testAccount = new SavingsAccount("Test", -5000, 1000);

        String[] errors = AnnotationValidator.validate(testAccount);

        for (String error : errors) {
            out.println(error);
        }
    }
}