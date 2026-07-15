// Bit Manipulation Question!.

// Find ODD & Even :!. 

// import java.util.Scanner;
// public class Bits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int n = sc.nextInt();

//         if((n & 1) == 0) {
//             System.out.println("Even.");
//         } else {
//             System.out.println("Odd.");
//         }
//     }  
// }


// GET BIT QUESTION (LOGIC!):

// import java.util.Scanner;
// public class Bits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int nums = sc.nextInt();
//         System.out.print("Enter Position : ");
//         int position = sc.nextInt();

//         int bitMask = 1 << position;
//         if((nums & bitMask) == 0) {
//             System.out.println("Bit is 0.");
//         } else {
//             System.out.println("Bit is 1.");
//         }
//     }
// }


// SET BIT QUESTION (LOGIC!):

import java.util.Scanner;
public class Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();
        System.out.print("Enter Position : ");
        int position = sc.nextInt();
        int bitMask = 1 << position;

        int result = number | bitMask;
        System.out.println(result);
    }
}