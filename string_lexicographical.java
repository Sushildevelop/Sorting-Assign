package Practice.Sorting.Assignment;

import java.util.Scanner;

public class string_lexicographical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        // insertion sort
        for (int i=1;i<arr.length;i++){
            int j=i;
            while (j>0&& arr[j]<arr[j-1]){
                char temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        String ans="";
        for (int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        System.out.println(ans);
    }
}
