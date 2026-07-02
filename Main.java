// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//     }
// }

// Input from User code :
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.println(name);
        }

    }
}



