package Homework;

public class Main {
    public static void main(String[] args) {
        String s = Task1.sentence();

        String longestWord = Task1.longestWordInSentence(s);
        System.out.println("The longest word in the sentence is - " + longestWord);

        int amountOfLettersInLongestWord = Task1.anoundOfLettersInLongestWordInSentence(s);

        System.out.println("The longest word in this sentence consists of " + amountOfLettersInLongestWord + " letters");

        String reverseWord = Task1.reverse(s);
        System.out.println(reverseWord);
    }
}
