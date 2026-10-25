/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;
public class TypeSafeShoppingCalculator {
public static void main(String[] args) {
     String storeName = "Market";  
     int quantity = 3;
     double unitPrice = 4.99;
     double totalCost = quantity * unitPrice;
     // String for word or sentence, then int for quantity because it's a whole number
     //double for umit and total cost for decimal
     // total cost is quantity multiply to the price
     System.out.println("Store: " + storeName); 
     System.out.println("Quantity: " + quantity);
     System.out.println("Price: " + unitPrice);
     System.out.println("Total: " + totalCost);      
    }
}
