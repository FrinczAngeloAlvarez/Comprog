/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;
public class OverflowReferenceInvestigator {
public static void main(String[] args) {    
    
        byte num = 127;
        System.out.println("Max Value: " + num);

        num++;

        // byte max is 127, so +1 wraps around to -128
        System.out.println("Overflowing Value: " + num);

        System.out.println("=== STRINGS ===");

        String s1 = new String("Java"); // new thing
        String s2 = new String("Java"); // another new thing
        String s3 = "Java";             // shared thing from the string pool

        // == asks: same toy? (same memory location)
        System.out.println("s1 == s2: " + (s1 == s2)); // false: different things
        System.out.println("s1 == s3: " + (s1 == s3)); // false: different things
        System.out.println("s2 == s3: " + (s2 == s3)); // false: different things

        // .equals() asks: same words? (same text)
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
        System.out.println("s2.equals(s3): " + s2.equals(s3)); // true

        System.out.println("=== ARRAY REFERENCE ===");
        int[] arr1 = {90, 91, 92};
        int[] arr2 = arr1; // same array, two names

        arr2[0] = 95;

        // changed through arr2, visible through arr1
        System.out.println("arr1[0]: " + arr1[0]);
        System.out.println("arr2[0]: " + arr2[0]);
 }
}