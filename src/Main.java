import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner class for user to enter a value
        Scanner scanner = new Scanner(System.in);
        // declarations
        String secretWord = "intelligence";
        int maxTries = 10;
        int tries = 0;
        boolean isGuessed = false;

        char[] guessedLetters = new char[secretWord.length()];
        // for loop
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }

        while (!isGuessed && tries < maxTries) {
            System.out.println("Guess the word " + String.valueOf(guessedLetters) + " " + secretWord.length() + " letters");
            System.out.println("Enter a letter please ");
            // using scanner class to request a letter
            char letter = Character.toLowerCase(scanner.next().charAt(0));

            boolean correctLetter = false;
            // For loop
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == letter) {
                    guessedLetters[i] = letter;
                    correctLetter = true;
                }
            }
            if (!correctLetter) {
                tries++;
                System.out.println("Incorrect! you have " + (maxTries - tries) + " tries");
            }

            if (String.valueOf(guessedLetters).equals(secretWord)) {
                isGuessed = true;
                System.out.println("Congrats you have guessed the word " + secretWord);
            }
        }
        if (!isGuessed) {
            System.out.println("Sorry! you have no more tries! GAME OVER");
        }

        scanner.close();

    }
}
