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

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i = 0 ; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for(int i = 0 ; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//     }
// }

// Sum of Array! 

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sum = 0;
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i = 0 ; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for(int i = 0 ; i < arr.length; i++) {
//             sum = sum + arr[i];
//         }
//         System.out.println("Sum = " + sum);
//     }
// }

// Maximum Element! 

// import java.util.Scanner;
// public class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         for(int i = 0 ; i< n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int max  = arr[0];
//         for(int i = 0 ; i< arr.length; i++) {
//             if(arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("Maximum = " + max);

//     }
// }

// Minimum Element! 

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         for(int i = 0 ; i<n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int min = arr[0];

//         for(int i = 0; i< arr.length;i++) {
//             if(arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         System.out.println("Minimum = " + min);
//     }
// }


// Average Of Array!

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for(int i =0; i< n; i++){
//             arr[i] = sc.nextInt();
//         }

//         double sum = 0;
//         for(int i = 0; i< arr.length;i++){
//             sum = sum + arr[i];
//         }

//         double average = (double) sum / arr.length;
//         System.out.println("Average - " + average);
//     }
// }


//Count Even and Odd Number !

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int nums = sc.nextInt();

//         int[] arr = new int[nums];

//         int even = 0;
//         int odd = 0;
//         for(int i = 0 ; i< nums; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i = 0 ; i < arr.length; i++) {
//             if(arr[i] % 2 == 0) {
//                 even++;
//             } else {
//                 odd++;
//             }
//         }
//         System.out.println("Even = " + even);
//         System.out.println("Odd = " + odd);
//     }
// }


// Reverse an Array! 

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i = 0; i< n; i++){
//             arr[i] = sc.nextInt();
//         }


//         for(int i = arr.length - 1; i >= 0; i--){
//             System.out.print(arr[i] + " ");
//         }
//     }

// }

// Copy one Array intp Another !

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        int[] copy = new int[arr.length];
        for(int i = 0; i< n; i++) {
            copy[i] = arr[i];
        }

        for(int i = 0; i< n; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}