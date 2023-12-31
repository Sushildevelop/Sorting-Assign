package Practice.Sorting.Assignment;

import java.util.Scanner;

public class Greater_half {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int j = i;
            // Insert a[i] into sorted left part 0..i-1
            while (j > 0 && arr[j] < arr[j - 1]) {
                // Swap a[j] and a[j-1]
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                // Decrement j by 1
                j--;
            }
        }
        int si;
        if(n % 2 == 0){
            si = n/2;
        }else{
            si = n/2 + 1;
        }
        for (int i = si; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
