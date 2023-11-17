package ProgrammingChallenges;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];

        }
        System.out.println("Total Sum: " + sum);
        double average = (double) sum / 5;

        System.out.println("Average is: " + average);
        input.close();
        

    }
}
