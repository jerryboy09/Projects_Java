package ProgrammingChallenges;

import java.util.Scanner;

public class largestNumberIn_3_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = num1;

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            if (num2 > max) {
                max = num2;
            }

            if (num3 > max) {
                max = num3;
            }

            System.out.println("The largest number is: " + max);
        }

        scanner.close();
    }
}
