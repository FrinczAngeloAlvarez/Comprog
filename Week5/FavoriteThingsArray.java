/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;
public class FavoriteThingsArray {
public static void main(String[] args) {
        String[] favorites = {"Anime", "Reading", "Music", "Movies", "Video Games"};

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total items: " + favorites.length);
    }
}
   
