package ProgrammingChallenges;


import java.util.Scanner;

public class Check_Vowel_Cons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char character = scanner.nextLine().charAt(0);

        if (Character.isLetter(character)) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                    character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                System.out.println(character + " is a vowel.");
            } else {
                System.out.println(character + " is a consonant.");
            }
        } else {
            System.out.println(character + " is not a letter.");
        }
    }
}
