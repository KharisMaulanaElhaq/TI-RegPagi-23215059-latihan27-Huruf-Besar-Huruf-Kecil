/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class HurufBesarKecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input kalimat dari user
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();
        
        // Menampilkan hasil formatting
        System.out.println("\n====Hasil Formatting====");
        
        // Mengubah ke huruf besar
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        
        // Mengubah ke huruf kecil
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
        
        input.close();
    }
}
