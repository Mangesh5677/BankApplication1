package banking;

import java.util.Scanner;

public class Withdraw {
    public static void main(String[] args) {
        double balance = 10000.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Withdraw Amount:");
        int cashOut = sc.nextInt();

        try {
            if (cashOut > balance) {
                throw new Exception("Insufficient Balance");
            }

            System.out.println("Withdraw Successfully...");
            double remain = balance - cashOut;
            System.out.println("Remaining Balance: " + remain);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}