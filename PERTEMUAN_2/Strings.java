/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;
import java.util.Scanner;
/**
 * @author Afyar
 */
public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input : ");
        String myString= sc.nextLine();
        int jumlah = 0, compare;
        String[] newString = myString.split("\\s+");
        // mencari jumlah karakter
        for (int i = 0; i < 2; i++){
            jumlah = jumlah + newString[i].length();
        }
        System.out.println(jumlah);
        // menentukan apakah terurut
        compare = newString[0].compareTo(newString[1]);
        if (compare<0){
            System.out.println("No");
        } else if (compare>0) {
            System.out.println("Yes");
        } else {
            System.out.println("Equal");
        }
        for (int i = 0; i < 2; i++){
            // mengubah awal kalimat dengan kapital
            String firstLetter = newString[i].substring(0, 1);
            String remainingLetters = newString[i].substring(1, newString[i].length());      
            // mengubah huruf pertama jadi kapital
            firstLetter = firstLetter.toUpperCase();
            // menyatukan dua substring
            newString[i] = firstLetter + remainingLetters;
        }
        System.out.println(newString[0] + " " + newString[1]);
    }
}
