// Electricity Bill Question : ---------------------->

// import java.util.Scanner;
// public class Question {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Customer Name: ");
//         String name = sc.nextLine();


//         System.out.println("Enter Units Consumed: ");
//         int units = sc.nextInt();

//         double bill = 0;
//         double surCharge = 0;
//         double meterCharge = 150;

//         if(units <= 100) {
//             bill = units * 5;

//         }
//          else if(units <= 200) {
//             bill = (100 * 5) + ((units - 100) * 7);
//         } else if(units <= 300){
//             bill = (100 * 5) + (100 - 7) + ((units - 200) * 10);
//         } else {
//             bill = (100 * 5) + (100 * 7) + (100 * 10) + ((units - 300) * 12);
//         }

//         bill = bill + meterCharge;

//         if(bill > 2000){
//             surCharge = bill * 0.05;
//         }
//         double finalBill = bill + surCharge;

//         System.out.println("Customer Name : " + name);
//         System.out.println("Units Consumed : " + units);
//         System.out.println("Energy Charge : " + (bill - meterCharge));
//         System.out.println("Meter Charge : " + meterCharge);
//         System.out.println("Surcharge : " + surCharge);
//         System.out.println("Total Bill : " + finalBill);
//     }    
// }


// -------- Bank loAn Eligibility System -------:

// import java.util.Scanner;
// public class Question {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Customer Name: ");
//         String name = sc.nextLine();

//         System.out.println("Enter Age: ");
//         int age = sc.nextInt();

//         System.out.println("Enter Monthly Salary: ");
//         double salary = sc.nextDouble();

//         System.out.println("Enter CIBIL score: ");
//         int cibil = sc.nextInt();

//         System.out.println("Enter Work EXperience (Years): ");
//         int experience = sc.nextInt();

//         if(age >= 21 && salary >= 30000 && cibil >= 750 && experience >= 2) {
//             System.out.println("\n Loan Satus : APPROVED\n");

//         if(salary >= 100000){
//             System.out.println("Eligible Loan Amount : $50,00,000");
//         } else if( salary >= 70000){
//             System.out.println("Eligible Loan Amount : $30,00,000");
//         } else if( salary >= 50000){
//             System.out.println("Eligible Loan Amount: $20,00,000");
//         } else {
//             System.out.println("Eligible Loan Amount : $ 10,00,000");
//         }

//         } else {
//             System.out.println("\nLoan Status : REJECTED\n");

//             if(age < 21){
//                 System.out.println("Reason : Age should be at least 21");
//             } if(salary < 30000){
//                 System.out.println("Reason : Salary is too low");
//             } if(cibil < 750) {
//                 System.out.println("Reason : Poor CIBIL Score");
//             } if(experience < 2) {
//                 System.out.println("Reason : Minimum 2 year experiene required");
//             }
//         }
//         sc.close();

//     }
// }


//----------College Addmission System ------------:

// import java.util.Scanner;
// public class Question {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Student Name: ");
//         String name = sc.nextLine();

//         System.out.println("Enter PCM Percentage: ");
//         double percentage = sc.nextDouble();

//         System.out.print("Enter Entrance Rank: ");
//         int rank = sc.nextInt();

//         System.out.println("Sports Quota (true/fals): ");
//         boolean sports = sc.nextBoolean();

//         if(percentage >= 60) {
//             System.out.println("\nAdmission Status : ELIGIBLE");

//             if(rank <= 1000){
//                 System.out.println("Branch : Computer Science");
//                 System.out.println("Scholarship : 100%");

//             } else if(rank <= 3000) {
//                 System.out.println("Branch : Information Technology");
//                 System.out.println("Scholarship : 75%");
//             } else if( rank <= 6000) {
//                 System.out.println("Branch : Electronics");
//                 System.out.println("Scholarship  50%");
//             } else {
//                 System.out.println("Branch : Mechanical");
//                 System.out.println("Scholarship : 25%");
//             }
//         } else {
//             System.out.println("\nAdmission Rejected");
//             System.out.println("Minimum 60& required");
//         }
//         sc.close();

//     }
// }



// Airline Ticket Booking System : ------------------>

// import java.util.Scanner;
// public class Question {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Passenger Name: ");
//         String name = sc.nextLine();

//         System.out.println("Age: ");
//         int age = sc.nextInt();

//         System.out.println("\nTicket Class");
//         System.out.println("1. Economy");
//         System.out.println("2. Business");

//         System.out.println("Choose Class: ");
//         int choice = sc.nextInt();

//         System.out.print("Are you a Student? (true/ false): ");
//         boolean student = sc.nextBoolean();

//         double fare = 0;

//         if (choice == 1){
//             fare = 5000;
//         } else if (choice == 2) {
//             fare = 12000;
//         } else {
//             System.out.println("Invalid Class");
//             return;
//         }

//         if (student) {
//             fare = fare - (fare * 0.10);
//         } if( age >= 60) {
//             fare = fare - (fare * 0.20);
//         }

//         double gst = fare * 0.05;
//         double total = fare + gst;

//         System.out.println("Passenger : " + name);
//         System.out.println("Base Fare : " + fare);
//         System.out.println("GST (5%) : " + gst);
//         System.out.println("Total Fare : $" + total);

//         sc.close();
//     }
// }



// Maximum of Three Number : 

// import java.util.*;
// public class Question {
//     public static int maximum(int a, int b, int c) {
//         if(a >= b && a >= c){
//             return a;
//         } else if (b >= a && b >= c) {
//             return b;
//         } else {
//             return c;
//         }
//     }
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);

//             System.out.print("Enter First Number : ");
//             int a = sc.nextInt();

//             System.out.print("Enter Second Number : ");
//             int b = sc.nextInt();

//             System.out.print("Enter Third Number : ");
//             int c = sc.nextInt();

//             int ans = maximum(a,b,c);
//             System.out.println("Largest Number = " + ans);
//         }
// }

// Prime Number Question : 

// import java.util.Scanner;
// public class Question {
//     public static Boolean isPrime(int n) {
//         if(n <= 1){
//             return false;
//         }
//         for(int i = 2; i<= Math.sqrt(n); i++) {
//             if(n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         if(isPrime(n)) {
//             System.out.println("Prime Number!");
//         } else {
//             System.out.println("Not Prime!");
//         }
//     }
// }

// Amstrong Number Question Code :

// import java.util.Scanner;
// public class Question {
//     public static boolean isArmstrong(int num) {
//         int original = num;
//         int sum = 0;

//         while(num != 0) {
//             int digit = num % 10;
//             sum = sum + digit * digit * digit;
//             num = num / 10;
//         }
//         return sum == original;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();

//         if(isArmstrong(num)) {
//             System.out.println("Is An Armstrong No.");
//         } else {
//             System.out.println("Is Not Armstrong No.");
//         }
//     }
// }


// GCD Number Question : --->

import java.util.Scanner;
public class Question {
    public static int gcd(int a , int b) {
        while( b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD = " + gcd(a,b));
    }
}