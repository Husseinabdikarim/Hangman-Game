import java.util.List;
import java.util.Scanner;

public class Methods {

	public static void printBodyPart(Integer wrongCount) {
		   System.out.println(" -------");
	        System.out.println(" |     |");
	        if (wrongCount >= 1) {
	            System.out.println(" O");
	        }
	        if (wrongCount >= 2) {
	            System.out.print("\\ ");
	            if (wrongCount >= 3) {
	                System.out.println("/");
	            }
	            else {
	                System.out.println("");
	            }
	        }
	        if (wrongCount >= 4) {
	            System.out.println(" |");
	        }

	        if (wrongCount >= 5) {
	            System.out.print("/ ");
	            if (wrongCount >= 6) {
	                System.out.println("\\");
	            }
	            else {
	                System.out.println("");
	            }
	        }
	        System.out.println("");
	        System.out.println("");
	}

	
	public static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses) {
		
		 System.out.println("Please enter a letter:");
	        String letterGuess = keyboard.nextLine();
	        if(letterGuess.length() > 0) {
	        	playerGuesses.add(letterGuess.charAt(0));
	        }
	        
	        //After prompting the user for a letter, this line adds the letter to the "playerGuesses" list
	        //Notice how only the first character of the input is taken
	        return word.contains(letterGuess);
	        //returns whether the player guessed a correct letter
	}
	
	public static boolean getPlayerGuessTurkish(Scanner keyboard, String word, List<Character> playerGuesses) {
		
		 System.out.println("Lütfen bir harf girin:");
	        String letterGuess = keyboard.nextLine();
	        if(letterGuess.length() > 0) {
	        	playerGuesses.add(letterGuess.charAt(0));
	        }
	     

	        return word.contains(letterGuess);
	}


	
	public static boolean printWordState(String word, List<Character> playerGuesses) {
	
		int correctCount = 0;
		//a counter for the amount of times the player guessed a correct character
     for (int i = 0; i < word.length(); i++) {
         if (playerGuesses.contains(word.charAt(i))) {
             System.out.print(word.charAt(i));
             correctCount++;
         }
         else {
             System.out.print("-");
         }
     }
     //if the player letter guess is correct, the letter is printed, else a dash will be printed 
     System.out.println();

     return (word.length() == correctCount);
     //if the player has guessed all the characters, the function will return true, 
     //which will be used to end the program  
	}

	
}
