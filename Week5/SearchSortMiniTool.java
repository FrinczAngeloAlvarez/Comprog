/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;
public class SearchSortMiniTool {
public static void main(String[] args) {
        int[] scores = {85, 92, 78, 65, 90, 88, 73, 95, 81, 70};
        int target = 88;
        
        boolean found = false;
        int foundIndex = -1;

        for (int i = 0; i < scores.length; i++) {
        if (scores[i] == target) {
        found = true;
        foundIndex = i;
        break;
            }
        }

        if (found) {
        System.out.println("Target " + target + " was found at index " + foundIndex);
        } else {
        System.out.println("Target " + target + " was not found");
        }

        int[] sortedScores = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
        sortedScores[i] = scores[i];
        }
        
        for (int i = 0; i < sortedScores.length - 1; i++) {
        for (int j = 0; j < sortedScores.length - 1 - i; j++) {
        if (sortedScores[j] > sortedScores[j + 1]) {
        int temp = sortedScores[j];
        sortedScores[j] = sortedScores[j + 1];
        sortedScores[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Original: ");
        for (int i = 0; i < scores.length; i++) {
        System.out.print(scores[i] + " ");
        }
        System.out.println();

        System.out.print("Sorted:   ");
        for (int i = 0; i < sortedScores.length; i++) {
        System.out.print(sortedScores[i] + " ");
        }
        System.out.println();
    }
}    
