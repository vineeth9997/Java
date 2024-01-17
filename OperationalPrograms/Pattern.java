package OperationalPrograms;

public class Pattern {
    public static void main(String[] args) {

        int num = 4;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6; j++) {

                if (j <= num) System.out.print("+ ");
                else System.out.print("- ");

            }
            num--;
            System.out.println();
        }
    }

}