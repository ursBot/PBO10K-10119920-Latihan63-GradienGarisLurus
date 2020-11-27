/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan63.gradiengarislurus;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class PBO10K10119920Latihan63GradienGarisLurus {

    
    public static void main(String[] args) {
       
        Koordinat k1,k2 ;
        k1 = new Koordinat(2,10,5,7);
        System.out.println("Garis yang melalui titik ("+k1.getX1()+","+k1.getY1()+") dan ("+k1.getX2()+","+k1.getY2()+") \n"
                + "memliki gradien sebesar "+k1.hitungGradien());
        
        k2 = new Koordinat(5,1,3,12);
        System.out.println("Garis yang melalui titik ("+k2.getX1()+","+k2.getY1()+") dan ("+k2.getX2()+","+k2.getY2()+") \n"
                + "memliki gradien sebesar "+k2.hitungGradien());
        
    }
}
