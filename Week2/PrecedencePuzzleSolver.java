/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;
public class PrecedencePuzzleSolver {
public static void main(String[] args) {    

        int a = 5;
        int b = 3;
        int c = 2;

        // Prediction: 11 (multiply first, 3 * 2 = 6, then 5 + 6)
        int result1 = a + b * c;
        System.out.println("Expression 1: " + result1);

        // Prediction: true (&& goes first, so it is true || false)
        boolean result2 = a > 3 || b > 5 && c > 5;
        System.out.println("Expression 2: " + result2);

        // Prediction: 12 (x++ gives 5, ++x gives 7, then 5 + 7)
        int x = 5;
        int result3 = x++ + ++x;
        System.out.println("Expression 3: " + result3);
        System.out.println("Value of x  : " + x); 
    
  }
}