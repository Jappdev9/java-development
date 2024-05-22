import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a game score
        System.out.print("Please enter a game score: ");
        String userInput = scanner.nextLine();

        // Split the user input to get home, visitor, and scores
        String[] parts = userInput.split("\\|");
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        // Extract team names and scores
        String homeTeam = teams[0].trim();
        String visitorTeam = teams[1].trim();
        int homeScore = Integer.parseInt(scores[0].trim());
        int visitorScore = Integer.parseInt(scores[1].trim());

        // Determine the winner
        String winner = (homeScore > visitorScore) ? homeTeam : visitorTeam;

        // Display the winner
        System.out.println("Winner: " + winner);
    }
}