/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;
public class NestedLoginValidator {
public static void main(String[] args) {
        String username = "AngeloAlvarez";
        String password = "pup123";
        boolean isLocked = false;

        if (username.equals("AngeloAlvarez")) {
            if (password.equals("pup123")) {
                if (!isLocked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Account is locked.");
                }
            } else {
                System.out.println("Wrong password.");
            }
        } else {
            System.out.println("Username not found.");
        }
    }    
}
