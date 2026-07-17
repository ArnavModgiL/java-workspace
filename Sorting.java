// Sorting Data ko order mei arrange karna!.

/* Here We Learn. 5 types of Sorting Algorithms :-->

.Bubble Sort.
.Selection Sort.
.Inseration Sort.
.Merge Sort.
Quick Sort.

*/



// Bubble Sorting Algorithm Question Code :

// import java.util.Scanner;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Size : ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter ELment: ");
//         for(int i = 0 ; i< arr.length; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i = 0; i<n - 1; i++){
//             for(int j = 0; j < n - 1; j++){
//                 if(arr[j] > arr[ j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         System.out.println("Sorted Array : ");

//         for(int i = 0 ; i< arr.length; i++) {
//             int num = arr[i];
//             System.out.print(num + " ");
//         }
//     }
// }


// Selection Sort Question!...

// import java.util.Scanner;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Size : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i = 0; i< arr.length; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i = 0; i<n - 1; i++){
//             int min = i;
//             for(int j = i + 1; j < n; j++) {
//                 if(arr[j] < arr[min]){
//                     min = j;
//                 }
//             }
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i]  = temp;
//         }
//         System.out.println("Sorted Array : ");
//         for(int i =0; i<arr.length; i++){
//             int num = arr[i];
//             System.out.print(num + " ");
//         }
//     }
// }


// Insertion Sorting Question :

import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0;  i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++) {
            int j = i - 1;
            int key = arr[i];
            while(j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println("Sorted Array : ");
        for(int i = 0; i< arr.length;i++){
            int num = arr[i];
            System.out.print(num + " ");
        }
    }
}