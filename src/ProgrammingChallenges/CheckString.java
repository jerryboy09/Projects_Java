package ProgrammingChallenges;

import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of at least 10 characters: ");
        String str = sc.nextLine();

        if (str.length() < 10) {
            System.out.println("Error: String should have at least 10 characters.");
            return;
        }

        StringBuilder sb = new StringBuilder(str);

        System.out.println("Length of the string: " + sb.length());
        System.out.println("First character of the string: " + sb.charAt(0));
        System.out.println("Last character of the string: " + sb.charAt(sb.length() - 1));
        System.out.println("Index of the first occurrence of the letter 'a': " + sb.indexOf("a"));
        System.out.println("Substring of the string from index 3 to index 6: " + sb.substring(3, 7));

        sb.append("123");
        sb.insert(4, "xyz");
        sb.delete(2, 5);
        sb.deleteCharAt(8);

        sb.reverse();
        System.out.println("Reversed string: " + sb);
    }
}
