package binarysearchjoptionpane;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class BinarySearchJOptionPane2angka {

    public static int[] data = null;
    public static int awal, tengah, akhir, temp, count, jlh, cari, cari2, awal2, tengah2, akhir2, temp2, count2;

    public static void main(String[] args) {
        System.out.println("DAMAR RAIHAN CHOIRUL FIRDAUS / X-RPL6/ 15");
        System.out.println("=========================================");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        //	Input jumlah data
        jlh = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Angka Yang Ingin Dicari :"));
        //	Input tiap nilai dan simpan ke array
        data = new int[jlh];
        for (int a = 0; a < jlh; a++) {
            data[a] = new Random().nextInt(201);    //    Data di isi secara random dengan nilai tertinggi 200
        }
        //	Menampilkan data sebelum di sorting
        System.out.print("\nData    : ");
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + " ");
        }
        //	Proses sorting
        sorting();
        //	Menampilkan Data setelah di sorting
        System.out.println();
        System.out.print("Sorting : ");
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + " ");
        }
        //	Input data yang dicari
        System.out.println("");
        cari = Integer.parseInt(JOptionPane.showInputDialog("Angka 1 yang dicari"));
        System.out.println("Angka Yang Dicari: " + cari);
        System.out.println("");
        cari2 = Integer.parseInt(JOptionPane.showInputDialog("Angka 2 yang dicari"));
        System.out.println("Angka Yang Dicari: " + cari2);
        //	Proses Metode Pencarian Binary Searching
        System.out.println();
        boolean temu = false;
        awal = 0;
        akhir = data.length - 1;
        temp = 0;
        count = 0;
        int iterasi = 0;
        System.out.println("It  Aw  Ak  Te  Ni");
        while (temu != true) {
            tengah = (awal + akhir) / 2;
            iterasi++;
            //	value == cari
            if (data[tengah] == cari) {
                System.out.print(iterasi + "   ");
                System.out.print(awal + "   ");
                System.out.print(akhir + "   ");
                System.out.print(tengah + "   ");
                System.out.print(data[tengah] + "\n");
                temu = true;
                break;
            } //	value < cari
            else if (data[tengah] < cari) {
                System.out.print(iterasi + "   ");
                System.out.print(awal + "   ");
                System.out.print(akhir + "   ");
                System.out.print(tengah + "   ");
                System.out.print(data[tengah] + "\n");
                awal = tengah + 1;
            } //	value > cari
            else if (data[tengah] > cari) {
                System.out.print(iterasi + "   ");
                System.out.print(awal + "   ");
                System.out.print(akhir + "   ");
                System.out.print(tengah + "   ");
                System.out.print(data[tengah] + "\n");
                akhir = tengah - 1;
            }
            //	Cek Worst Case
            if (temp != data[tengah]) {
                temp = data[tengah];
            } else {
                count++;
            }
            //	batasan untuk worst case
            if (count == 3) {
                break;
            }
        }
        //	Output
        if (temu == true) {
            System.out.println("\nData " + cari + " ditemukan pada index ke-" + tengah + "\n"
                    + "dan Iterasi ke-" + iterasi);
        } else {
            System.out.println("\nData " + cari + " tidak ditemukan");
        }
        //	Proses Metode Pencarian Binary Searching
        System.out.println();
        boolean temu2 = false;
        awal2 = 0;
        akhir2 = data.length - 1;
        temp2 = 0;
        count2 = 0;
        int iterasi2 = 0;
        System.out.println("It  Aw  Ak  Te  Ni");
        while (temu2 != true) {
            tengah2 = (awal2 + akhir2) / 2;
            iterasi2++;

            //	value == cari
            if (data[tengah2] == cari2) {
                System.out.print(iterasi2 + "   ");
                System.out.print(awal2 + "   ");
                System.out.print(akhir2 + "   ");
                System.out.print(tengah2 + "   ");
                System.out.print(data[tengah2] + "\n");
                temu2 = true;
                break;
            } //	value < cari
            else if (data[tengah2] < cari2) {
                System.out.print(iterasi2 + "   ");
                System.out.print(awal2 + "   ");
                System.out.print(akhir2 + "   ");
                System.out.print(tengah2 + "   ");
                System.out.print(data[tengah2] + "\n");
                awal2 = tengah2 + 1;

            } //	value > cari
            else if (data[tengah2] > cari2) {
                System.out.print(iterasi2 + "   ");
                System.out.print(awal2 + "   ");
                System.out.print(akhir2 + "   ");
                System.out.print(tengah2 + "   ");
                System.out.print(data[tengah2] + "\n");
                akhir2 = tengah2 - 1;
            }

            //	Cek Worst Case
            if (temp2 != data[tengah2]) {
                temp2 = data[tengah2];
            } else {
                count2++;
            }

            //	batasan untuk worst case
            if (count2 == 3) {
                break;
            }
        }

        //	Output
        if (temu2 == true) {
            System.out.println("\nData " + cari2 + " ditemukan pada index ke-" + tengah2 + "\n"
                    + "dan Iterasi ke-" + iterasi2);
        } else {
            System.out.println("\nData " + cari2 + " tidak ditemukan");
        }
    }

    //	Sorting Ascending
    public static void sorting() {
        int temp = 0;
        for (int x = 0; x < data.length; x++) {
            for (int y = 0; y < data.length; y++) {
                if (x == y) {
                    continue;
                } else {
                    if (data[x] < data[y]) {
                        temp = data[y];
                        data[y] = data[x];
                        data[x] = temp;
                    }
                }
            }
        }
    }
}