package OperationalPrograms;

public class ReverseNumber {

    public static int reverseDigits(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        return reversedNum;
    }

    public static void main(String[] args) {

        int x = 12345;
        int y = ReverseNumber.reverseDigits(x);
        System.out.println("Reversed number of 12345 is: "+y);


    }


}