package ProgrammingChallenges;

public class Multiplication_Table_10x10 {

    public static void main(String[] args) {
        for(int num1 = 1;num1<=10;num1++) {
             for (int num2 = 1; num2 <= 10; num2++) {
                System.out.print(num2*num1+"\t");
            }
            System.out.println();
        }
    }
}
