/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;
import java.util.Scanner;
public class WareHouseInventoryScanner {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] warehouse = {
            {50, 30, -1, 20},
            {10, 5, 40, -1},
            {60, 2, 25, 15}
        };
        int lowLimit = 5;
        int choice;

        do {
            System.out.println("\n=== WAREHOUSE MENU ===");
            System.out.println("1. Total inventory");
            System.out.println("2. Find first critically low shelf");
            System.out.println("3. Restock a shelf");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();

            if (choice == 1) {
            int total = 0;

            for (int row = 0; row < warehouse.length; row++) {
            for (int col = 0; col < warehouse[row].length; col++) {
            if (warehouse[row][col] == -1) {
            continue;
                        }
            total += warehouse[row][col];
                    }
                }

            System.out.println("Total inventory: " + total);

            } else if (choice == 2) {
              boolean found = false;

              for (int row = 0; row < warehouse.length; row++) {
              for (int col = 0; col < warehouse[row].length; col++) {
              if (warehouse[row][col] == -1) {
              continue;
                        }
              if (warehouse[row][col] <= lowLimit) {
              System.out.println("First low shelf: Row " + row + ", Col " + col
              + " (count: " + warehouse[row][col] + ")");
              found = true;
              break; 
                        }
                    }
              if (found) {
              break; 
                    }
                }

              if (!found) {
              System.out.println("No critically low shelves.");
                }

            } else if (choice == 3) {
               int row = -1;
               int col = -1;

               while (row < 0 || row >= warehouse.length || col < 0 || col >= warehouse[0].length) {
               System.out.print("Enter row (0-" + (warehouse.length - 1) + "): ");
               row = input.nextInt();
               System.out.print("Enter column (0-" + (warehouse[0].length - 1) + "): ");
               col = input.nextInt();

               if (row < 0 || row >= warehouse.length || col < 0 || col >= warehouse[0].length) {
               System.out.println("Invalid position. Try again.");
                    }
                }

               if (warehouse[row][col] == -1) {
               System.out.println("That shelf is damaged. Cannot restock. Program ended.");
               return;
                }

               int amount = 0;

               while (amount <= 0) {
               System.out.print("Enter amount to add (must be more than 0): ");
               amount = input.nextInt();

               if (amount <= 0) {
               System.out.println("Invalid amount. Try again.");
                    }
                }
               
               warehouse[row][col] += amount;
               System.out.println("Restocked. New count: " + warehouse[row][col]);

            } else if (choice == 4) {
                System.out.println("Goodbye!");

            } else {
                System.out.println("Invalid choice.");
            }

            } while (choice != 4);

              input.close();
    }
}    