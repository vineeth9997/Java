package Arrays;

import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Print the size of the array:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];
        int l=0;
        int m=n-1;
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[l]=arr[i];
                l++;
            }
            else
            {
                temp[m]=0;
                m--;
            }
        }
        System.out.println("original array");
        for(int z=0;z<n;z++)
        {
            System.out.print(arr[z]+" ");
        }
        System.out.print("\n");
        System.out.println("Updated array");
        for(int z=0;z<n;z++)
        {
            System.out.print(temp[z]+" ");
        }

    }

}