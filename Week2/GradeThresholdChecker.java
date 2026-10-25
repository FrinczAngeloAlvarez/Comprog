/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;
public class GradeThresholdChecker {
public static void main(String[] args) {

        double average = 73;
        int absences = 2;

        boolean pass = (average >= 75 && absences <= 3) || (average >= 90);

        System.out.println("Average: " + average);
        System.out.println("Absences: " + absences);

        if (pass) {
        System.out.println("Result: PASS");
        if (average >= 90) {
        System.out.println("Reason: Average is 90 or higher.");
        } else {
        System.out.println("Reason: Average is at least 75 and absences are 3 or fewer.");
            }
        } else {
        System.out.println("Result: FAIL");
        System.out.println("Reason: Average is below 75, or too many absences (more than 3) without a 90+ average.");
        }
      }
    }
    