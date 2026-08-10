package Practical1;
import java.util.Scanner;

enum Move {
    ROCK,
    PAPER,
    SCISSORS,
    LIZARD,
    SPOCK
}

public class RPSLS {

    public static int winner(Move a, Move b) {

        if (a == b) {
            return 0;
        }

        switch (a) {

            case ROCK:
                if (b == Move.SCISSORS || b == Move.LIZARD)
                    return 1;
                else
                    return -1;

            case PAPER:
                if (b == Move.ROCK || b == Move.SPOCK)
                    return 1;
                else
                    return -1;

            case SCISSORS:
                if (b == Move.PAPER || b == Move.LIZARD)
                    return 1;
                else
                    return -1;

            case LIZARD:
                if (b == Move.PAPER || b == Move.SPOCK)
                    return 1;
                else
                    return -1;

            case SPOCK:
                if (b == Move.ROCK || b == Move.SCISSORS)
                    return 1;
                else
                    return -1;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int player1Score = 0;
        int player2Score = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("25AIML039");
            System.out.println("\nRound " + i);

            System.out.print("Player 1 Move: ");
            Move player1 = Move.valueOf(sc.next().toUpperCase());

            System.out.print("Player 2 Move: ");
            Move player2 = Move.valueOf(sc.next().toUpperCase());

            int result = winner(player1, player2);

            if (result == 1) {
                System.out.println("Player 1 Wins!");
                player1Score++;
            } else if (result == -1) {
                System.out.println("Player 2 Wins!");
                player2Score++;
            } else {
                System.out.println("Tie!");
            }
        }

        System.out.println("\nPlayer 1 Score: " + player1Score);
        System.out.println("Player 2 Score: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("Overall Winner: Player 1");
        } else if (player2Score > player1Score) {
            System.out.println("Overall Winner: Player 2");
        } else {
            System.out.println("Overall Result: Tie");
        }

        sc.close();
    }
}

