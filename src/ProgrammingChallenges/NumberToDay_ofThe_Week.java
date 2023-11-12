package ProgrammingChallenges;


import java.util.Scanner;

public class NumberToDay_ofThe_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Day between 1-7: ");
        int num = scanner.nextInt();

        String dayOfWeek;
        switch (num){
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek="Tuesday";
                break;
            case 3:
                dayOfWeek="Wednesday";
                break;
            case 4:
                dayOfWeek="Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid input";

        }
        System.out.print(dayOfWeek);
    }
}
