/* Recursion ek function hai koo kudh ko hi baar-baar
 call karna jab tak koi condition satisfy na hoo jaye. !
*/

// Print 1 to N :

import java.util.Scanner;
public class Recursion {
    public static void printN(int n) {
        if(n == 0) {
            return;
        } printN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        printN(n);
    } 
}