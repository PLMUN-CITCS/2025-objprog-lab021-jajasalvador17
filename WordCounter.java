import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = getSentenceInput(scanner); // Get the sentence
        int wordCount = countWords(sentence); // Count the words

        System.out.println("The sentence has " + wordCount + " words.");
        scanner.close();
    }

    // Method 1: getSentenceInput()
    public static String getSentenceInput(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        return scanner.nextLine(); // Read the entire line
    }

    // Method 2: countWords(sentence)
    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+"); // Split by whitespace
        return words.length; // Return the number of words
    }
}