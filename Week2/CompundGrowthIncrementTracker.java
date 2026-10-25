/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;
public class CompundGrowthIncrementTracker {
public static void main(String[] args) {   
    
        int bal = 5000;

        bal += 100;
        System.out.println("First Add   : " + bal);

        bal += 200;
        System.out.println("Second Add  : " + bal);

        bal *= 2;
        System.out.println("Third Add   : " + bal);

        System.out.println("==== Counter Variable ====");

        int counter = 100;
        System.out.println("Post Increment   : " + counter++);
        System.out.println("After Increment  : " + counter);

        counter = 100;
        System.out.println("Pre Increment    : " + ++counter);
        System.out.println("After Increment  : " + counter);

        // counter++ prints first, then adds 1 (prints 100).
        // ++counter adds 1 first, then prints (prints 101).
  
  } 
}

