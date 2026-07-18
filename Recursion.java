/* Recursion ek function hai koo kudh ko hi baar-baar
 call karna jab tak koi condition satisfy na hoo jaye. !
*/

// Print 1 to N :

// import java.util.Scanner;
// public class Recursion {
//     public static void printN(int n) {
//         if(n == 0) {
//             return;
//         } printN(n - 1);
//         System.out.print(n + " ");
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter N: ");
//         int n = sc.nextInt();
//         printN(n);
//     } 
// }

// Print N to 1 :

// import java.util.Scanner;
// public class Recursion {
//     public static void printN(int n){
//         if(n == 0){
//             return;
//         }
//         System.out.print(n + " ");
//         printN(n - 1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter N: ");
//         int n = sc.nextInt();
//         printN(n);
//     }
// }


// Sum of First N Number ! 

// import java.util.Scanner;
// public class Recursion {
//     public static int sum(int n){
//         if(n == 0)
//             return 0;
//         return n + sum(n - 1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter N: ");
//         int n = sc.nextInt();
//         System.out.println("Sum = "+ sum(n));
//     }
// }

// Factorial Question !

// import java.util.Scanner;
// public class Recursion {
//     public static int fact(int n){
//         if(n == 0 || n == 1){
//             return 1;
//         }
//         return n * fact(n - 1);
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter N: ");
//         int n = sc.nextInt();
//         int result = fact(n);
//         System.out.print("Factorial = " + result);
//     }
// }

// Power (a^b)!

// import java.util.Scanner;
// public class Recursion {
//     public static int power(int a, int b){
//         if(b == 0){
//             return 1;
//         }
//         return a * power(a,b-1);
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter A: ");
//         int a = sc.nextInt();
//         System.out.print("Enter B: ");
//         int b = sc.nextInt();

//         int ans = power(a,b);
//         System.out.print("Answer = "+ ans);
//     }
// }


// Fibonacci Number !

import java.util.Scanner;
public class Recursion {
    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println(fib(n));

    }
}
