package ProgrammingChallenges;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");
        int wordCount = words.length;

        System.out.println("Number of words in the input sentence: " + wordCount);


    }
}
