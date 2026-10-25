/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;
public class ClassRankingSystem {
public static void main(String[] args) {
    
        String[] names = {"Angelo", "Kian", "Jeric", "Cris", "Jahzeel"};
        int[][] quizData = {
        {90, 85, 80, 85},
        {70, 75, 80, 75},
        {88, 92, 84, 96},
        {85, 85, 85, 85},
        {60, 70, 65, 65}
        };
        
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
        students[i] = new Student(names[i], quizData[i]);
        }
        
        for (int i = 0; i < students.length - 1; i++) {
        for (int j = 0; j < students.length - 1 - i; j++) {
        if (students[j].getAverage() < students[j + 1].getAverage()) {
        Student temp = students[j];
        students[j] = students[j + 1];
        students[j + 1] = temp;
                }
            }
        }

        int[] ranks = new int[students.length];
        for (int i = 0; i < students.length; i++) {
        if (i > 0 && students[i].getAverage() == students[i - 1].getAverage()) {
        ranks[i] = ranks[i - 1]; 
        } else {
        ranks[i] = i + 1;
            }
        }

        System.out.println("=== Class Gradings ===");
        System.out.println("Rank\tName\tAverage");
        for (int i = 0; i < students.length; i++) {
        String tieNote = "";
        boolean tieAbove = i > 0 && ranks[i] == ranks[i - 1];
        boolean tieBelow = i < students.length - 1 && ranks[i] == ranks[i + 1];
        if (tieAbove || tieBelow) {
        tieNote = " (tie)";
            }
        System.out.println(ranks[i] + "\t" + students[i].name + "\t"
        + students[i].getAverage() + tieNote);
        }

        String searchName = "Monion";
        int foundRank = -1;

        for (int i = 0; i < students.length; i++) {
        if (students[i].name.equals(searchName)) {
        foundRank = ranks[i];
        break;
            }
        }

        if (foundRank != -1) {
        System.out.println("\n" + searchName + " is ranked #" + foundRank);
        } else {
        System.out.println("\n" + searchName + " was not found");
        }
    }
}
         class Student {
         String name;
         int[] quizzes;

         Student(String n, int[] q) {
         name = n;
         quizzes = q;
    }

         double getAverage() {
         int sum = 0;
         for (int i = 0; i < quizzes.length; i++) {
         sum += quizzes[i];
        }
         return (double) sum / quizzes.length;
    }
}    
