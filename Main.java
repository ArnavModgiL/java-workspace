// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//     }
// }

// Input from User code :

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.print("Enter Name: ");
//             String name = sc.nextLine();
//             System.out.println(name);
//         }

//     }
// }

// Adding Two Numbers :
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner object create kiya
        Scanner sc = new Scanner(System.in);

        // User first number lena
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        // User se second number lena
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);

        // Scanner close karna
        sc.close();


    }
}
