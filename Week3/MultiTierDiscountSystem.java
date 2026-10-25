/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;
public class MultiTierDiscountSystem {
public static void main(String[] args) {
        
        double purchaseAmount = 750.00;
        int discountPercent;

        if (purchaseAmount >= 1000) {
            discountPercent = 15;
        } else if (purchaseAmount >= 500) {
            discountPercent = 10;
        } else if (purchaseAmount >= 100) {
            discountPercent = 5;
        } else {
            discountPercent = 0;
        }

        double discountAmount = purchaseAmount * discountPercent / 100;
        double finalPrice = purchaseAmount - discountAmount;

        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Tier: " + discountPercent + "%");
        System.out.println("Final Price: " + finalPrice);
    }
 }    