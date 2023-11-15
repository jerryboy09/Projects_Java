package ProgrammingChallenges;


import java.util.Scanner;

public class Convert_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Word: ");
        String userInput = scanner.nextLine();

        System.out.println("Length of the string: " + userInput.length());
        System.out.println("String in uppercase: " + userInput.toUpperCase());
        System.out.println("String in lowercase: " + userInput.toLowerCase());
        System.out.println("First character of the string: " + userInput.charAt(0));

        System.out.println("Last character of the string: " + userInput.charAt(userInput.length() - 1));
        if (userInput.length() >= 5) {
            System.out.println("Substring from the second character to the fifth character: " + userInput.substring(1, 5));
        } else {
            System.out.println("The string is too short for this operation.");
        }
    }
}
