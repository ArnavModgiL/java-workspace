// SQUARE PATTERN QUESTION : --->

// import java.util.Scanner;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1; i<= n ; i++){
//             for(int j = 1; j <= n ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }


// RIGHT TRIANGLE CODE : --->

// import java.util.Scanner;
// public class Pattern {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1; i<= n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// Inverted Triangle Question: --->

// import java.util.*; 
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = n ; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

// Number Triangle Question :   --->

// import java.util.*;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         for(int i = 1; i<= n; i++){
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(j+ " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Floyid's Triangle code Question : --->

// import java.util.Scanner;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int num = sc.nextInt();

//         for(int i = 1; i<= n ; i++){
//             for(int j = 1; j <= i ; j++){
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }

//     }
// }

// Pyramid Question Code : --->

// import java.util.Scanner;
// public class Pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n - i; j++){
//                 System.out.print(" ");
//             }

//             for(int j = 1; j<= (2 * i - 1); j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// Diamond Pattern Question :  --->

// import java.util.*;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1; i<= n; i++){
//             for(int j = 1 ; j<= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1 ; j<= (2 * i - 1); j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

 
//         for(int i = n - 1; i >= 1; i--){
//             for(int j = 1; j<= n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= (2 * i - 1); j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// Hollow Square Code :  --->

// import java.util.*;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1; i<=n ; i++){
//             for(int j = 1; j <= n; j++){
//                 if(i == 1 || i == n || j == 1 || j == n){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }

// Hollow Rectangle Question : -->

// import java.util.Scanner;
// public class Pattern {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         // Row ki input li hai :-
//         int row = sc.nextInt();
//         // Col ki input li hai :-
//         int col = sc.nextInt();

//         for(int i = 1; i<= row ; i++){
//             for(int j = 1; j<= col; j++){
//                 if(i == 1 || i == row || j == 1 || j == col){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// Reverse Number Triangle : --->

// import java.util.*;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1; i<= n ; i++){
//             for(int j = n ; j >= n - i + 1; j--){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Character Triangle Question : --->

// import java.util.*;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1; i<= n; i++){
//             char ch = 'A';

//             for(int j = 1; j <= i; j++) {
//                 System.out.print(ch + " ");
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }


// Continuouse Character Patter : --->

// import java.util.*;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         char ch = 'A';

//         for(int i = 1; i<+ n; i++) {
//             for(int j = 1; j <= i ;j++) {
//                 System.out.print(ch + " ");
//                 ch++;
//             }
//             System.out.println();
//         }

//     }
// }

// Solid Rectangle : --->

// import java.util.*;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int row = sc.nextInt();
//         int col = sc.nextInt();

//         for(int i = 1; i<= row; i++) {
//             for(int j = 1; j <= col; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 0 - 1 Triangle Question Code :  --->

// import java.util.Scanner;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1; i <= n ; i++){
//             for(int j = 1; j <= i; j++){
//                 if((i + j) % 2 == 0) {
//                     System.out.print("1 ");
//                 } else {
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// Butterfly Pattern Question : --->

// import java.util.*;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1 ; j<= i; j++){
//                 System.out.print("*");
//             } for(int j = 1 ; j <= 2 * (n-i); j++){
//                 System.out.print(" ");
//             } for(int j = 1 ; j<= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int i = n ; i>= 1 ; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             } for(int j = 1; j<= 2 *(n-i); j++){
//                 System.out.print(" ");
//             } for(int j = 1; j<= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Solid Rhombus Question :---->

// import java.util.Scanner;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for(int i = 1; i<= n; i++){
//             for(int j = 1; j<= n-i; j++){
//                 System.out.print(" ");
//             }

//             for(int j = 1; j<= n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Hollow Rhombus Question : --->

// import java.util.*;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1; i<= n; i++){
//             for(int j = 1; j<= n-i; j++){
//                 System.out.print(" ");
//             }

//             for(int j = 1; j<= n; j++){
//                 if(i == 1 || j == 1 || j== n|| i == n) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// Number Pyramid Question :---->

// import java.util.Scanner;
// public class Pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 1 ; i<= n; i++){
//             for(int j = 1; j<= n- i;j++){
//                 System.out.print(" ");
//             }

//             for(int j = 1; j<= i; j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// Palindromic Pattern : --->

import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<= n; i++){
            for(int j = 1 ; j<= n-i; j++){
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            
            for(int j = 2; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


