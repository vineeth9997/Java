package Arrays;
import java.util.*;
public class ReverseArray {
        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            int arr[]=new int[5];

            System.out.println("Enter values into array");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }

            System.out.println("Printing reverse array");
            for(int i=arr.length-1;i>=0;i--)
            {
                System.out.print(arr[i]+" ");
            }
        }
}
