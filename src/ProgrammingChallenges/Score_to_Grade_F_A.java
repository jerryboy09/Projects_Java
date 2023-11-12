package ProgrammingChallenges;
import java.util.Scanner;
public class Score_to_Grade_F_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your test score:");
        int score1 = scanner.nextInt();

      if (score1 >= 90){
            System.out.println("Grade: A");
        }else if (score1 >= 80){
            System.out.println("Grade: B");
        }else if (score1 >=70 ){
            System.out.println("Grade: C");
        }else if (score1 >= 60){
            System.out.println("Grade: D");
        }else{
            System.out.println("Grade: F");
        }
    }
}
