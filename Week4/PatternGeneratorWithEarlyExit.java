/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;
public class PatternGeneratorWithEarlyExit {
public static void main(String[] args) {
        int size = 6;

        for (int row = 1; row <= size; row++) {
        for (int col = 1; col <= row; col++) {

        //skips printing column 2 in every row
        if (col == 2) {
          continue;
                }
        //to stop the INNER loop early once col reaches 5
         if (col == 5) {
           break;
                }

         System.out.print("* ");
                }
        System.out.println();
        }    
    }
}