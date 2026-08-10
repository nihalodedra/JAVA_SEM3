public class ChatFilter {

    public static void filter(String[] logs, String keyword) {

        int count = 0;
        StringBuilder result = new StringBuilder();

        for (String line : logs) {

            String[] data = line.split(" ", 3);

            if (data.length < 3) {
                continue;
            }

            String message = data[2];

            if (message.toLowerCase().contains(keyword.toLowerCase())) {
                count++;

                result.append(data[0])
                      .append(" ")
                      .append(data[1])
                      .append(": ")
                      .append(data[2])
                      .append("\n");
            }
        }

        System.out.println("Matches: " + count);
        System.out.println(result);
    }
}