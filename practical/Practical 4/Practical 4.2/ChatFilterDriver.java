import java.util.Scanner;

public class ChatFilterDriver  {

    public static void main(String[] args) {

        String[] logs = {
            "10:05 alice Hello there",
            "10:10 bob How are you?",
            "10:15 john Good morning",
            "10:20"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();
        System.out.println("25AIML039");

        ChatFilter.filter(logs, keyword);

        sc.close();
    }
}