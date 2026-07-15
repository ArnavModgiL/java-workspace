// Bit Manipulation Question!.

import java.util.Scanner;
public class Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        if((n & 1) == 0) {
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }
    }
    
}
