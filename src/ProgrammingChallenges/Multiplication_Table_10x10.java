package ProgrammingChallenges;

public class Multiplication_Table_10x10 {

    public static void main(String[] args) {
        for(int m = 1;m<=10;m++) {
             for (int n = 1; n <= 10; n++) {
                System.out.print(n*m+"\t");
            }
            System.out.println();
        }
    }
}
