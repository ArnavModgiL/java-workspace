// Electricity Bill Question : 
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

import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Enter Monthly Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter CIBIL score: ");
        int cibil = sc.nextInt();

        System.out.println("Enter Work EXperience (Years): ");
        int experience = sc.nextInt();

        if(age >= 21 && salary >= 30000 && cibil >= 750 && experience >= 2) {
            System.out.println("\n Loan Satus : APPROVED\n");

        if(salary >= 100000){
            System.out.println("Eligible Loan Amount : $50,00,000");
        } else if( salary >= 70000){
            System.out.println("Eligible Loan Amount : $30,00,000");
        } else if( salary >= 50000){
            System.out.println("Eligible Loan Amount: $20,00,000");
        } else {
            System.out.println("Eligible Loan Amount : $ 10,00,000");
        }

        } else {
            System.out.println("\nLoan Status : REJECTED\n");

            if(age < 21){
                System.out.println("Reason : Age should be at least 21");
            } if(salary < 30000){
                System.out.println("Reason : Salary is too low");
            } if(cibil < 750) {
                System.out.println("Reason : Poor CIBIL Score");
            } if(experience < 2) {
                System.out.println("Reason : Minimum 2 year experiene required");
            }
        }
        sc.close();

    }
}