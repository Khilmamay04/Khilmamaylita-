
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IMAA
 */
public class KelulusanSatu {
    public static void main(String[] args) {
        
        // Buat Scanner
 Scanner inp = new Scanner(System.in);

 // Ambil Nama
 System.out.println("Masukkan nama anda = ");
 String Nama = inp.nextLine();

 // Ambil NIM
 System.out.println("Masukkan NIM       = ");
 String nim = inp.nextLine();

 // Ambil Nilai
 System.out.println("Masukkan Nilai     = ");
 int nilai = inp.nextInt();

 // Print
 if(nilai < 75){
        System.out.println("Nama Anda = " + Nama);
        System.out.println("Nim       = " + nim);
        System.out.println("Nilai     = " + nilai);
        System.out.println("Anda tidak lulus.");
    }
    else if(nilai >= 75){
        System.out.println("Nama Anda = " + Nama);
        System.out.println("Nim       = " + nim);
        System.out.println("Nilai     = " + nilai);
        System.out.println("Selamat anda lulus.");
}
}
}
