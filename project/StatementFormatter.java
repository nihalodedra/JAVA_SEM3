public class StatementFormatter {

    public static String buildStatement(Account a) {

        StringBuilder s = new StringBuilder();

        s.append("Account: ");
        s.append(a.getAccountNumber());

        s.append("\nName: ");
        s.append(a.getName());

        s.append("\nBalance: ");
        s.append(a.getBalance());

        return s.toString();
    }
}