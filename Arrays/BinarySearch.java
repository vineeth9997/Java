package Arrays;

import java.util.*;

public class BinarySearch {

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at the middle
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }

            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Element not present in the array
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the size of the array:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Element to be found:");
        int target=sc.nextInt();
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " is found in the array ");
        } else {
            System.out.println("Element " + target + " is not found in the array");
        }
    }

}
