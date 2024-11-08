package Chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Test Automation University");
        reverseString("Hello TAU");
    }

    /**
     * Splits a String into array by tokenizing it
     * Counts words and prints them
     * @param text Full string to split
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);
        for (String word : words) {
            System.out.println(word);
        }
    }

    /**
     * Prints a String in reverse
     * @param text String to reverse
     */
    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
