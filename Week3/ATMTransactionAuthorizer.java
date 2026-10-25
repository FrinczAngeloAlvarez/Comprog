/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;
public class ATMTransactionAuthorizer {
public static void main(String[] args) {
        String username = "AngeloAlvarez";
        int pin = 1234;
        double balance = 10000;
        double withdrawAmount = 500.00;

        String tier;
        double dailyLimit;
        double feePercent = 0;
          //check if the login is correc
        if (username.equals("AngeloAlvarez")) {
            if (pin == 1234) {
               
                //balance 
                if (balance >= 20000) {
                    tier = "Platinum";
                    dailyLimit = 5000;
                } else if (balance >= 5000) {
                    tier = "Gold";
                    dailyLimit = 3000;
                } else if (balance >= 1000) {
                    tier = "Silver";
                    dailyLimit = 1000;
                } else {
                    tier = "Bronze";
                    dailyLimit = 500;
                }

                //fee percentage based on tier (switch)
                switch (tier) {
                    case "Bronze":
                        feePercent = 2.0;
                        break;
                    case "Silver":
                        feePercent = 1.5;
                        break;
                    case "Gold":
                        feePercent = 1.0;
                        break;
                    case "Platinum":
                        feePercent = 0;
                        break;
                    default:
                        feePercent = 0;
                }

                double fee = withdrawAmount * feePercent / 100;
                double totalCost = withdrawAmount + fee;

                System.out.println("Account Tier: " + tier);
                System.out.println("Fee: " + fee);

                //withdrawal checks
                if (totalCost <= balance) {
                    if (withdrawAmount <= dailyLimit) {
                        System.out.println("APPROVED");
                        System.out.println("New Balance: " + (balance - totalCost));
                    } else {
                        System.out.println("DENIED: Exceeds daily limit of " + dailyLimit);
                    }
                } else {
                    System.out.println("DENIED: Insufficient balance");
                }

            } else {
                System.out.println("DENIED: Incorrect PIN");
            }
        } else {
            System.out.println("DENIED: Username not found");
        }
    }
}    
