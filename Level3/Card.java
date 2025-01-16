import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Card{

    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        // Create all the combinations of ranks and suits
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        int n = deck.length;
        
        // Shuffle the deck by swapping each card with a random card from the remaining deck
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + random.nextInt(n - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the cards to players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        // Check if the cards can be distributed evenly
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("The cards cannot be evenly distributed to the players.");
            return null;
        }

        int cardsPerPlayer = numOfCards / numOfPlayers;
        String[][] players = new String[numOfPlayers][cardsPerPlayer];

        // Distribute the cards to players
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards: " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        // Take user input for the number of players
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numOfPlayers = scanner.nextInt();

        // Initialize the deck of cards
        String[] deck = initializeDeck();
        int numOfCards = deck.length;

        // Shuffle the deck
        shuffleDeck(deck);

        // Distribute the cards to players
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);

        // If the cards were successfully distributed, print the players and their cards
        if (players != null) {
            printPlayersCards(players);
        }

        scanner.close();
    }
}
