package Arrays;

public class MinMax {
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
        public static void main(String[] args) {

            int[] numbers = {5, 10, 3, 8, 15, 7};

            int max = findMax(numbers);
            int min = findMin(numbers);

            System.out.println("Largest number: " + max);
            System.out.println("Smallest number: " + min);
        }


    }
