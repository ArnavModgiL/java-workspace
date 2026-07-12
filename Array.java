// Find x :

import java.util.Scanner;

public class Array {

    public static int Find(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        int result = Find(arr, x);

        if (result != -1) {
            System.out.println("Element Found at Index = " + result);
        } else {
            System.out.println("Element Not Found!");
        }

        sc.close();
    }
}