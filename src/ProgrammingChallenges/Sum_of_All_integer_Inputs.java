package ProgrammingChallenges;
import java.util.Scanner;
public class Sum_of_All_integer_Inputs {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input integer1:");
            int a = scanner.nextInt();
            System.out.print("Input integer2:");
            int b = scanner.nextInt();
            System.out.print("Input integer3:");
            int c = scanner.nextInt();
            System.out.print("Input integer4:");
            int d = scanner.nextInt();
            System.out.print("Input integer5:");
            int e = scanner.nextInt();
            System.out.print("Input integer6:");
            int f = scanner.nextInt();

            int result = a + b + c + d + e + f;

            System.out.print("Sum of all Integers:"+ result);



        }

}
