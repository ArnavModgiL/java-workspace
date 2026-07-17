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

// import java.util.Scanner;
// public class Bits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int number = sc.nextInt();
//         System.out.print("Enter Position : ");
//         int position = sc.nextInt();
//         int bitMask = 1 << position;

//         int result = number | bitMask;
//         System.out.println(result);
//     }
// }


// ClEAR BIT QUESTION {LOGIC!};

// import java.util.Scanner;
// public class Bits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int number = sc.nextInt();
//         System.out.print("Enter Position : ");
//         int position = sc.nextInt();

//         int bitMask = 1 << position;
//         int result = number & (~bitMask);
//         System.out.println(result);
//     }
// }


// UPDATE BIT QUESTION {LOGIC!};

// import java.util.Scanner;
// public class Bits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int number = sc.nextInt();
//         System.out.print("Enter Position : ");
//         int position = sc.nextInt();

//         int newBit = 1;

//         int bitMask = 1 << position;
//         if(newBit == 0) {
//             int result = number & (~bitMask);
//             System.out.println(result);
//         } else {
//             int result = number | bitMask;
//             System.out.println(result);
//         }
//     }
// }


// Check Even or ODD BY USING MANIPLUATIONS : 

// import java.util.Scanner;
// public class Bits {
//     public static boolean isEven(int n) {
//         return (n & 1) == 0;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Number: ");
//         int n = sc.nextInt();

//         if(isEven(n)) {
//             System.out.println("Even Number!");
//         } else {
//             System.out.println("ODD NUmber!");
//         }
//     }
// }

// Find the Ith BIT (GET BIT) !.

// import java.util.Scanner;
// public class Bits {
//     public static int getBit(int number, int position) {
//         int bitMask = 1 << position;

//         if((number & bitMask) == 0) {
//             return 0;
//         } else {
//             return 1;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Number : ");
//         int number = sc.nextInt();

//         System.out.print("Enter Bit Position : ");
//         int position = sc.nextInt();

//         System.out.println("Bit = " + getBit(number, position));
//     }
// }


// SET THE Ith Bit ! 

// import java.util.Scanner;
// public class Bits {
//     public static int setBit(int number, int position) {
//         int bitMask = 1 << position;
//         return number | bitMask;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int number = sc.nextInt();
//         System.out.print("Enter Position : ");
//         int position = sc.nextInt();

//         System.out.println("UPDATED NUMBER = " + setBit(number, position));

//     }
// }


// Check if Number is Power of 2 - -

// import java.util.Scanner;
// public class Bits {
//     public static boolean isPowerOfTwo(int n) {
//         if(n <= 0) {
//             return false;
//         } return (n & (n - 1)) == 0;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Number ! ");
//         int n = sc.nextInt();

//         if(isPowerOfTwo(n)) {
//             System.out.println("Power of 2");
//         } else {
//             System.out.println("Not a Power of 2.");
//         }
//     }
// }


// Count Set Bits !

import java.util.Scanner;
public class Bits {
    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            count = count + (n & 1);
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        System.out.println("Set Bits = " + countSetBits(n));
    }
}