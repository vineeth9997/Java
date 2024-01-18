package Arrays;

import java.util.*;

public class Bubblesort {
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
        System.out.println("Array Before Sort:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array After Sort:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
