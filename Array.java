// Find x :

// import java.util.Scanner;
// public class Array {

//     public static int Find(int[] arr, int x) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter element to search: ");
//         int x = sc.nextInt();
//         int result = Find(arr, x);

//         if (result != -1) {
//             System.out.println("Element Found at Index = " + result);
//         } else {
//             System.out.println("Element Not Found!");
//         }

//         sc.close();
//     }
// }


// Find x in 2D Matrix Question : 

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number of rows : ");
//         int n = sc.nextInt();
//         System.out.println("Enter the Number of Cols : ");
//         int m = sc.nextInt();

//         int[][] arr = new int[n][m];

//         for(int i = 0; i < n ; i++){
//             for(int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Enter element to search!");
//         int x = sc.nextInt();

//         Boolean found = false;

//         for(int i = 0; i < n ; i++) {
//             for(int j = 0; j < m; j++) {
//                 if(arr[i][j] == x) {
//                     System.out.println("Element Found at rows = " + i + ", column = " + j);
//                     found = true;
//                 }
//             }
//         }

//         if(! found) {
//             System.out.println("Element not found!");
//         }

//     }
// }


// Print All element! 

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}