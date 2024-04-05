import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your choice (1 for Rock, 2 for Paper, 3 for Scissors):");
        int userChoice = scanner.nextInt();
        int computerChoice = random.nextInt(3) + 1; // Generate a random number between 1 and 3

        String userChoiceString = "", computerChoiceString = "";

        switch (userChoice) {
            case 1:
                userChoiceString = "Rock";
                break;
            case 2:
                userChoiceString = "Paper";
                break;
            case 3:
                userChoiceString = "Scissors";
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        switch (computerChoice) {
            case 1:
                computerChoiceString = "Rock";
                break;
            case 2:
                computerChoiceString = "Paper";
                break;
            case 3:
                computerChoiceString = "Scissors";
                break;
        }

        System.out.println("You chose: " + userChoiceString);
        System.out.println("Computer chose: " + computerChoiceString);

   
        // Determine the winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
