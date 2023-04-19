import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman extends Methods {

    public static void main(String[] args) throws FileNotFoundException {
        //notice throws, It informs the programmer that there may occur an exception.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 'e' for English.");
        System.out.println("Türkçe için 't' giriniz.");
        String Language = "";
        for (int i = 0; !Language.equalsIgnoreCase("e") && !Language.equalsIgnoreCase("t"); i++) {
            Language = input.nextLine();
        }
        //Prompt player to choose a language.

//---------------------------------------------English----------------------------------------
        if (Language.equalsIgnoreCase("E")) {
            System.out.println("1 or 2 players?");
            String players = input.nextLine();
            //if the player chooses 1 player, the program gets the word that will be guessed from a words list
            //if the player chooses 2 players, the program instead asks player 1 to enter the word to be guessed

            String randWord;

            if (players.equals("1")) {
                Scanner scanner = new Scanner(new File("C:/Users/Hussein Abdikarim/Hangman/Wordlist.txt"));
                List<String> words = new ArrayList<>();
                //declaration of a new array list

                while (scanner.hasNext()) {
                    words.add(scanner.nextLine());
                }
                //copying the words from the file to a new list "words"

                Random rand = new Random();
                randWord = words.get(rand.nextInt(words.size()));
                //Using the random class, this line gets a random word from the array list "words", and assigns the value to the string "word"
                //notice how the upper bound parameter depends on the size of the "words" list
            } else {
                System.out.println("Player 1, please enter your word:");
                randWord = input.nextLine();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Good luck!");
            }

            //System.out.println(word);
            //uncomment the previous line to check the random word

            List<Character> playerGuesses = new ArrayList<>();

            Integer wrongCount = 0;

            while (true) {
                printBodyPart(wrongCount);
                //printBodyPart prints the hanged man according to the value of the parameter "wrongCount"

                if (wrongCount >= 6) {
                    System.out.println("You lose!");
                    System.out.println("The word was: " + randWord);
                    break;
                    //if the player's wrong guesses count reaches 6, they lose
                }

                printWordState(randWord, playerGuesses);
                if (!getPlayerGuess(input, randWord, playerGuesses)) {
                    wrongCount++;
                    //if getPlayerGuess returns false, it means the player has guessed a wrong letter, so wrongCount is incremented
                }

                if (printWordState(randWord, playerGuesses)) {
                    System.out.println("You win!");
                    break;
                    //if printWordState returns true, the player has guessed all the letters and won
                }

                System.out.println("Please enter your guess for the word:");
                if (input.nextLine().equals(randWord)) {
                    System.out.println("You win!");
                    break;
                    //if the player guessed the word, they win
                } else {
                    System.out.println("Incorrect answer, try again.");
                }
            }
        }
//---------------------------------------------Turkish-----------------------------------------
        else if (Language.equalsIgnoreCase("t")) {
            System.out.println("1 veya 2 oyuncu?");
            String players = input.nextLine();

            String randWord;

            if (players.equals("1")) {
                Scanner scanner = new Scanner(new File("C:/Users/Hussein Abdikarim/Hangman/TurkishWordlist.txt"));
                List<String> words = new ArrayList<>();

                while (scanner.hasNext()) {
                    words.add(scanner.nextLine());
                }

                Random rand = new Random();
                randWord = words.get(rand.nextInt(words.size()));
            } else {
                System.out.println("Oyuncu 1, lütfen kelimenizi giriniz:");
                randWord = input.nextLine();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("İyi Şanlar!");
            }

            List<Character> playerGuesses = new ArrayList<>();

            Integer wrongCount = 0;

            while (true) {
                printBodyPart(wrongCount);

                if (wrongCount >= 6) {
                    System.out.println("Kaybettiniz!");
                    System.out.println("Aradığnız kelime: " + randWord);
                    break;
                }

                printWordState(randWord, playerGuesses);
                if (!getPlayerGuessTurkish(input, randWord, playerGuesses)) {
                    wrongCount++;
                }

                if (printWordState(randWord, playerGuesses)) {
                    System.out.println("Kazandınız!");
                    break;
                }

                System.out.println("Lütfen kelime için tahmininizi giriniz:");
                if (input.nextLine().equals(randWord)) {
                    System.out.println("Kazandınız!");
                    break;
                } else {
                    System.out.println("Yanlış cevap, tekrar deneyiniz.");
                }
            }

        }


    }

}

