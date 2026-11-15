import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int player1Score = 0;
        int player2Score = 0;
        int winningScore = 30;

        System.out.println("================================");
        System.out.println("       🎲 DICE ROLLING GAME");
        System.out.println("================================");

        System.out.println("Player 1 vs Player 2");
        System.out.println("First player to reach 30 points wins!");

        while (player1Score < winningScore &&
               player2Score < winningScore) {

            // Player 1 turn
            System.out.println("\nPlayer 1: Press Enter to roll!");
            sc.nextLine();

            int dice1 = random.nextInt(6) + 1;
            player1Score += dice1;

            System.out.println("Player 1 rolled: " + dice1);
            System.out.println("Player 1 Score: " + player1Score);

            if (player1Score >= winningScore) {
                break;
            }

            // Player 2 turn
            System.out.println("\nPlayer 2: Press Enter to roll!");
            sc.nextLine();

            int dice2 = random.nextInt(6) + 1;
            player2Score += dice2;

            System.out.println("Player 2 rolled: " + dice2);
            System.out.println("Player 2 Score: " + player2Score);
        }

        // Display winner
        System.out.println("\n================================");
        System.out.println("          GAME OVER!");
        System.out.println("================================");

        System.out.println("Player 1 Final Score: " + player1Score);
        System.out.println("Player 2 Final Score: " + player2Score);

        if (player1Score >= winningScore) {
            System.out.println("Congratulations! Player 1 Wins!");
        } else {
            System.out.println("Congratulations! Player 2 Wins!");
        }

        System.out.println("Thanks for playing!");

        sc.close();
    }
}