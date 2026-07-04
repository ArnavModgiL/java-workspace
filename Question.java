// Electricity Bill Question : 

import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name: ");
        String name = sc.nextLine();


        System.out.println("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill = 0;
        double surCharge = 0;
        double meterCharge = 150;

        if(units <= 100) {
            bill = units * 5;

        }
         else if(units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        } else if(units <= 300){
            bill = (100 * 5) + (100 - 7) + ((units - 200) * 10);
        } else {
            bill = (100 * 5) + (100 * 7) + (100 * 10) + ((units - 300) * 12);
        }

        bill = bill + meterCharge;

        if(bill > 2000){
            surCharge = bill * 0.05;
        }
        double finalBill = bill + surCharge;

        System.out.println("Customer Name : " + name);
        System.out.println("Units Consumed : " + units);
        System.out.println("Energy Charge : " + (bill - meterCharge));
        System.out.println("Meter Charge : " + meterCharge);
        System.out.println("Surcharge : " + surCharge);
        System.out.println("Total Bill : " + finalBill);

    }
    
}
