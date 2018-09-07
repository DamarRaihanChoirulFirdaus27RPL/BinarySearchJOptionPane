/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogamming1;

import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Tugas1 {

    public static void main(String[] args) {
        System.out.println("DAMAR RAIHAN CHOIRUL FIRDAUS / X-RPL6/ 15");
        System.out.println("=========================================");
        System.out.println("****Penghitung Pemecah Uang****");
        
        String i = JOptionPane.showInputDialog("masukkan nilai nominal uang anda : ");

        int JumlahUang = Integer.parseInt(i);//(mengubah integer jumlah uang integer i)
        int hitung5  = JumlahUang / 5000;
        int sisa   = JumlahUang % 5000;

        int hitung6 = sisa / 2000;
        int sisa1 = JumlahUang % 2000;

        int hitung7 = sisa1 / 1000;
        int sisa2 = JumlahUang % 1000;

        int hitung8 = sisa2 / 500;
        int sisa3 = JumlahUang % 500;

        int hitung9 = sisa3 / 100;
        int sisa4 = JumlahUang % 100;


        System.out.println("Jumlah Uang yang anda Masukkan = Rp." + JumlahUang);
    
        System.out.println("Jumlah Uang Rp. 5.000     Sebanyak: " + hitung5);
        System.out.println("Jumlah Uang Rp. 2.000     Sebanyak: " + hitung6);
        System.out.println("Jumlah Uang Rp. 1.000     Sebanyak: " + hitung7);
        System.out.println("Jumlah Uang Rp. 500       Sebanyak: " + hitung8);
        System.out.println("Jumlah Uang Rp. 100       Sebanyak: " + hitung9);
    

        System.out.println("Selesai");

    }
}

