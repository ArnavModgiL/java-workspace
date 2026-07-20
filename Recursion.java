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

// import java.util.Scanner;
// public class Recursion {
//     public static int fib(int n){
//         if(n <= 1){
//             return n;
//         }
//         return fib(n - 1) + fib(n - 2);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter N: ");
//         int n = sc.nextInt();
//         System.out.println(fib(n));

//     }
// }


// Sum of Digits :

// import java.util.Scanner;
// public class Recursion {
//     public static int sumDigits(int n) {
//         if(n == 0)
//             return 0;
//         return n % 10 + sumDigits(n / 10);
//     }
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Number : ");
//     int n = sc.nextInt();
//     System.out.println("Sum = "+ sumDigits(n));
//     }
// }


// Count Digits >

// import java.util.Scanner;
// public class Recursion {
//     static int count(int n){
//         if(n == 0)
//             return 0;

//         return 1 + count(n / 10);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int n = sc.nextInt();
//         if(n == 0){
//             System.out.println(1);
//         } else {
//             System.out.println(count(Math.abs(n)));
//         }
//     }
// }


// Reverse String!

// import java.util.Scanner;
// public class Recursion {
//     public static void reverse(String str , int index){
//         if(index < 0){
//             return ;
//         } System.out.print(str.charAt(index));
//         reverse(str, index - 1);
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter String : " );
//         String str = sc.nextLine();
//         reverse(str , str.length() - 1);
//     }
// }


// check Palindrome :

// import java.util.Scanner;
// public class Recursion {

//     static boolean palindrome(String str, int start , int end){
//         if(start >= end){
//             return true;
//         } if(str.charAt(start) != str.charAt(end)){
//             return false;
//         } return palindrome(str, start + 1, end - 1);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter String:  ");
//         String str = sc.nextLine();

//         if(palindrome(str, 0, str.length() - 1)){
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }


// Power Question Recursion :

// import java.util.Scanner;
// public class Recursion {
//     public static long power(long x, long n){
//         if(n == 0){
//             return 1;
//         }
//         long half = power(x , n / 2);

//         if(n % 2 == 0){
//             return half * half;
//         } else {
//             return x * half * half;
//         }
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Power ~ N: ");
//         int n = sc.nextInt();
//         System.out.print("Enter x: ");
//         int x = sc.nextInt();
//         long ans = (long) power(x, n);
//         System.out.println(ans);

//     }
// }


// Intermidate Question ! =-> TOWER OF HANOI CODE!

// import java.util.Scanner;
// public class Recursion {
//     public static void tower(int n, char source, char helper, char destination){
//         if(n == 1){
//             System.out.println("Move Disk 1 From " + source + " to " + destination);
//             return;
//         }
//         tower(n - 1,source,destination,helper);
//         System.out.println("Move Disk " + n + " From " + source + " to " + destination);
//         tower(n - 1,helper,source,destination);
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number of Disks : ");
//         int n  = sc.nextInt();
//         tower(n,'A','B','C');

//     }
// }

// Reverse a String [Interview Level!]:

import java.util.Scanner;
public class Recursion {
    public static void reverse(String str, int index) {
        if(index < 0){
            return; 
        }

        System.out.print(str.charAt(index));

        reverse(str,index - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value: ");
        String str = sc.nextLine();

        reverse(str,str.length()-1);
    }
}