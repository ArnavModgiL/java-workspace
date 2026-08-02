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

// Copy one Array into Another !

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         for(int i=0; i< n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int[] copy = new int[arr.length];
//         for(int i = 0; i< n; i++) {
//             copy[i] = arr[i];
//         }

//         for(int i = 0; i< n; i++) {
//             System.out.print(copy[i] + " ");
//         }
//     }
// }

// Check if Array is Sorted!

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         for(int i = 0; i< n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         boolean sorted = true;
//         for(int i = 0; i< arr.length - 1; i++) {
//             if(arr[i] > arr[i + 1]) {
//                 sorted = false;
//                 break;
//             }
//         }
//         if(sorted) {
//             System.out.println("Sorted!");
//         } else {
//             System.out.println("Not Sorted!");
//         }
//     }
// }


// count frequency of Element!

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for(int i = 0; i< n; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter the target! ");
//         int x = sc.nextInt();

//         int count = 0;
//         for(int i = 0; i< arr.length; i++) {
//             if(arr[i] == x) {
//                 count ++;
//             }
//         }
//         System.out.println("Frequency : " + count);
//     }
// }



// Remove Duplicates Array!

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int j = 0;
//         for(int i = 1; i < arr.length; i++) {
//             if(arr[i] != arr[j]) {
//                 j++;
//                 arr[j] = arr[i];
//             }
//         }

//         for(int i = 0; i <= j; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// 2D Array : --:>


// Matrix Multiplication : -:

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter R1: ");
//         int r1 = sc.nextInt();
//         System.out.print("Enter C1: ");
//         int c1 = sc.nextInt();

//         int[][] A = new int[r1][c1];

//         for(int i = 0; i<r1; i++){
//             for(int j = 0 ; j <c1;j++){
//                 A[i][j] = sc.nextInt();
//             }
//         }

//         // input 2 second Array!.

//         System.out.print("Enter R2: ");
//         int r2 = sc.nextInt();
//         System.out.print("Enter C2: ");
//         int c2 = sc.nextInt();


//          if(c1 != r2) {

//             System.out.println("Matrix Multiplication Not Possible");

//             return;
//         }

//         int[][] B = new int[r2][c2];

//         for(int i = 0; i<r2; i++){
//             for(int j = 0; j<c2;j++){
//                 B[i][j] = sc.nextInt();
//             }
//         }

//         int[][] result = new int[c1][r2];
//         for(int i = 0 ; i<c1; i++){
//             for(int j = 0 ; j < r2;j++){
//                 for(int k = 0; k < r1; k++){
//                     result[i][j] += A[i][k] * B[k][j];
//                 }
//             }

//         }
//         System.out.println("\nResult : ->");

//             for(int i = 0; i<c1; i++){
//                 for(int j = 0; j < r2; j++){
//                     System.out.print(result[i][j] + " ");
//                 }
//                 System.out.println();
//             }
//         sc.close();
//     }
// }

// Search in 2D matrix : Leetcode --- O(log(n*m)) Approach!

// class Array {
//     public boolean searchMatrix(int[][] matrix, int target){
//         for(int i = 0; i < matrix.length; i++){
//             for(int j = 0; j < matrix[i].length; j++){
//                 if(matrix[i][j] == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


// Maximum and Minimum in 2D Matrix!

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter N: ");
//         int n = sc.nextInt();
//         System.out.print("Enter M: ");
//         int m = sc.nextInt();

//         int[][] arr = new int[n][m];
//         for(int i = 0; i<n;i++){
//             for(int j = 0; j<m; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         int max = arr[0][0];
//         int min = arr[0][0];

//         for(int i = 0; i<n;i++){
//             for(int j=0; j<m;j++){
//                 if(arr[i][j] > max){
//                     max = arr[i][j];
//                 }
//             }
//         }

//         for(int i = 0; i<n; i++){
//             for(int j = 0; j<m;j++){
//                 if(arr[i][j] < min){
//                     min = arr[i][j];
//                 }
//             }
//         }

//         System.out.println("Maximun is " + max);
//         System.out.println("Minimum is " + min);
//     }
// }

// Find Positive & Negative & Even & Odd in 2D Matrix!

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter N: ");
//         int n = sc.nextInt();
//         System.out.print("Enter M: ");
//         int m = sc.nextInt();

//         int[][] arr = new int[n][m];

//         for(int i = 0; i<n;i++){
//             for(int j = 0; j<m; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         int even = 0;
//         int odd = 0;
//         int positive = 0;
//         int negative = 0;

//         for(int i = 0; i<n; i++){
//             for(int j = 0; j<m; j++){
//                 int value = arr[i][j];
//                 if(value % 2 == 0){
//                     even++;
//                 } else {
//                     odd++;
//                 }
//                 if(value > 0){
//                     positive++;
//                 } else {
//                     negative++;
//                 }
//             }
//         }

//         System.out.println("Even Number : " + even);
//         System.out.println("Odd Number : " + odd);
//         System.out.println("Positive number: " + positive);
//         System.out.println("Negative Number: " + negative);
//     }
// }


// Row wise maxSum !

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter N: ");
//         int n = sc.nextInt();
//         System.out.print("Enter M: ");
//         int m = sc.nextInt();

//         int[][] matrix = new int[n][m];

//         for(int i = 0; i<n; i++){
//             for(int j = 0; j < m; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         int maxSum = Integer.MIN_VALUE;
//         int maxRow = -1;

//         for(int i = 0; i<matrix.length; i++){
//             int sum = 0;
//             for(int j = 0; j < matrix[0].length; j++){
//                 sum = sum + matrix[i][j];
//             }

//             if(sum > maxSum) {
//                 maxSum = sum;
//                 maxRow = i;
//             }
//         }
//         System.out.println("MaxSum is : " + maxSum);
//         System.out.println("MaxRow is : " + maxRow);
//     }
// }


// Column wise Max!


// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter N: ");
//         int n = sc.nextInt();
//         System.out.print("Enter M: ");
//         int m = sc.nextInt();

//         int[][] matrix = new int[n][m];

//         for(int i = 0; i<n; i++){
//             for(int j = 0; j < m; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         int maxSum = Integer.MIN_VALUE;
//         int maxCol = -1;

//         for(int j = 0; j < matrix[0].length; j++){
//             int sum = 0;
//             for(int i = 0; i < matrix.length; i++){
//                 sum = sum + matrix[i][j];
//             }

//             if(sum > maxSum){
//                 maxSum = sum;
//                 maxCol = j;
//             }
//         }
//         System.out.println("MaxSum is " + maxSum);
//         System.out.println("MaxCol is " + maxCol);
//     }
// }


// Boundary Element!

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Enter M: ");
        int m = sc.nextInt();

        int[][] matrix = new int [n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j <m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++) {
                if(i == 0 || 
                    i == matrix.length -1  ||
                     j == 0 || j == matrix[i].length-1) {
                    System.out.println("Boundary Element: " + matrix[i][j] + " ");
                }
            }
        }
    }
}