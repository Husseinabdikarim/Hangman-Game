# Hangman-Game
This is a console-based Hangman game implemented in Java. In this game, the player will try to guess a randomly selected word or a word entered by the other player. If the player can guess the word before making six wrong guesses, they will win; otherwise, they will lose.

# How to Play
After running the program, the player will be prompted to choose the language. The program supports two languages: English and Turkish. To select the language, enter "e" for English or "t" for Turkish.

# English Mode
After selecting English, the player will be prompted to choose the number of players: 1 or 2. If the player selects 1, the program will select a random word from a list of words stored in a file. If the player selects 2, the first player will enter a word to be guessed. The game will then start, and the player will be able to make guesses by entering a letter. If the letter is in the word, the program will print the letter in the correct position(s). If the letter is not in the word, the program will print a part of the hanged man. The player will continue to guess letters until they guess the word or make six wrong guesses.

# Turkish Mode
'Hangman.java': The main file that runs the game. 'Methods.java': Contains helper methods that are used in the main file.

# Helper Methods
'printBodyPart(Integer wrongCount)': Prints the hanged man according to the value of the parameter 'wrongCount'. 'getPlayerGuess(Scanner keyboard, String word, List playerGuesses)': Prompts the player for a letter, adds the letter to the 'playerGuesses' list, and returns 'true' if the letter is in the word and 'false' if it is not. 'getPlayerGuessTurkish(Scanner keyboard, String word, List playerGuesses)': The Turkish version of 'getPlayerGuess'. 'printWordState(String word, List playerGuesses)': Prints the word with dashes for the letters that the player has not guessed and the letters for the ones the player has guessed. Returns 'true' if the player has guessed all the letters in the word.

# Exception Handling
The program throws a FileNotFoundException when the file containing the list of words cannot be found.

# Contributors
Feel free to contribute to the project by forking it and submitting a pull request. husseinabdikarim18@gmail.com
