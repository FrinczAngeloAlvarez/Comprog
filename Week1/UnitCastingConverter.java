/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;
public class UnitCastingConverter {
   public static void main(String[] args) {
        System.out.println("=== EXPLICIT CASTING CONVERTER ===");
        double cm = 1050;

        // Explicit cast: (int) drops the decimals, leaving whole meters only
        int m = (int) (cm / 100);

        // Leftover cm = total cm minus the cm used up by the whole meters
        double remainCm = cm - (m * 100);

        System.out.println("Centimeters           : " + cm);
        System.out.println("Whole Meters          : " + m);
        System.out.println("Remaining centimeters : " + remainCm);

        int num1 = 100;

        // No cast needed: a double can hold any int value, so nothing is lost.
        double value = num1;

        System.out.println(num1);
        System.out.println(value);

        System.out.println("=== EXPLICIT NARROWING ===");
        double value2 = 9.99;
        // Cast required: an int can't store decimals, so the .99 is lost.
        // Java cuts it off (truncates), it does not round up to 10.
        int num2 = (int) value2;

        System.out.println(value2);
        System.out.println(num2);
 }
}