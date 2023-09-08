package Practice.Sorting.Assignment;

import java.util.Scanner;

public class Strings_Bubble_sort {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scn.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){
            arr[i] = scn.next();
        }
        for (int j = 0; j < n - 1; j++){
            for (int i = j + 1; i < n; i++){
                if (arr[j].compareTo(arr[i]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
