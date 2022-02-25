import java.util.Random;
import java.util.Scanner;

public class PlayCard {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        int player1_card1 = random.nextInt(10);
        int player1_card2 = random.nextInt(10);
        int player1_scores = (player1_card1 + player1_card2) % 10;

        int player2_card1 = random.nextInt(10);
        int player2_card2 = random.nextInt(10);
        int player2_scores = (player2_card1 + player2_card2) % 10;

        System.out.println("Player 1:");
        System.out.print(player1_card1 + " ");
        System.out.println(player1_card2);
        System.out.println("Scores: " + player1_scores);
        System.out.println("------------------------------------------");

        System.out.println("Player 2 (You):");
        System.out.print(player2_card1 + " ");
        System.out.println(player2_card2);
        System.out.println("Scores: " + player2_scores);
        System.out.println("------------------------------------------");

        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        while (choose != 1 && choose != 2) {
            choose = in.nextInt();
        }

        if (choose == 1) {
            int player2_card3 = random.nextInt(10);
            player2_scores = (player2_scores + player2_card3) % 10;
            System.out.println("------------------------------------------");
            System.out.printf("New scores: %d (+%d)\n", player2_scores, player2_card3);
            System.out.println("------------------------------------------");

        }
        
        in.close();
        if (player2_scores > player1_scores) {
            System.out.printf("You won!!! ---> (You) %d : %d", player2_scores, player1_scores);
        } else if (player2_scores < player1_scores){
            System.out.printf("You lose!!! ---> (You) %d : %d", player2_scores, player1_scores);
        } else {
            System.out.printf("Draw!!! ---> (You) %d : %d", player2_scores, player1_scores);
        }
    }
}
