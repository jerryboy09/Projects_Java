package ProgrammingChallenges;

import java.util.Scanner;

public class Integer_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number to generate pattern: ");
        int num1 = scanner.nextInt();



        for (int a = 1; a <= num1; a++) {
            System.out.println(a);

            for(int b = 1; b <= a; b++) {
                System.out.print(b + " ");

            }
        }
    }
}
