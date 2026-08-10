public class CommandParser {

    public static Command parse(String text) {

        String[] x = text.split(" ");

        return new Command(
                TransactionType.valueOf(x[0]),
                x[1],
                Long.parseLong(x[2])
        );
    }
}