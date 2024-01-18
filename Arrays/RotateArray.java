package Arrays;

import java.util.*;

public class RotateArray {
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

        System.out.println("enter the x position value");
        int x = sc.nextInt();

        int temp[]=new int[n];

        for (int j = 0; j < n; j++) {
            temp[j] = arr[(j + x) % n];
        }
        System.out.println("This is the original array");

        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println("\n");
        System.out.println("Here is the array moved by x positions");

        for (int j = 0; j < n; j++) {
            System.out.print(temp[j]+" ");
        }



        }


    }


