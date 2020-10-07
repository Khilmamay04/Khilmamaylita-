
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
public class NilaiHuruf {
     public static void main(String[] args) {
     int nilai = 0 ;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Masukkan nilai");
    nilai = input.nextInt();
    
      if(nilai < 0 || nilai > 100) {
    System.out.println("Error");
    }
    else  if(nilai >= 0 && nilai <= 50){
    System.out.println("E");
    }
    else if(nilai >= 51 && nilai <= 60){
    System.out.println("D");
    }
    else if(nilai >= 61 && nilai <= 75){
    System.out.println("C");
    }
     else if(nilai >= 76 && nilai <= 85){
    System.out.println("B");
    }
      else if(nilai >= 86 && nilai <= 100){
    System.out.println("A");
    } 
    }
}
