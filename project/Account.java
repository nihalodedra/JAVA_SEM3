public class Account {

    private String name;
    private long balance;
    private final String accountNumber;

    private static int count = 0;

    public Account(String name) {
        count++;
        accountNumber = "AC000" + count;
        this.name = name;
        balance = 0;
    }

    public Account(String name, long balance) {
        this(name);
        this.balance = balance;
    }

    public void deposit(long amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public boolean withdraw(long amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean isActive() {
        return true;
    }

    @Override
    public String toString() {
        return accountNumber + " " + name + " " + balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account a = (Account) obj;
            return accountNumber.equals(a.accountNumber);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }
}