package binarysearchjoptionpane;
import javax.swing.JOptionPane;
public class BinarySearchJOptionPane1angka {
    int n = 5, cari, cari2 , awal, akhir, tengah; //deklarasi variable n,cari,atas,bawah,tengah
    int a[] = new int[n]; //deklarasi array
    boolean found;//deklarasi nilai boolean 

    public void binary() {
        System.out.print("Deret angkanya : ");
        for (int i = 0; i < a.length; i++) {//perulangan untuk kondisi i = 0 dan i < panjang array a,
            //mengkonversi tipe data string ke integer
            //menampilkan input dialog untuk memasukkan angka yang berurutan yang nanti di cari
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan " + n + " angka 'BERURUTAN' ke-" + (i + 1)));
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        
        //menampilkan input dialog untuk memasukkan angka yang yang akan dicari
        //harus di konversi dulu dari string ke dalam tipe data integer
        cari = Integer.parseInt(JOptionPane.showInputDialog("Angka 1 yang dicari"));
        System.out.println("Angka Yang Dicari: " + cari);
        cari2 = Integer.parseInt(JOptionPane.showInputDialog("Angka 2 yang dicari"));
        System.out.println("Angka Yang Dicari: " + cari2);
        System.out.println("--------------------------------------");
        
        //menginisialisasikan batas atas yaitu 0,batas bawah n-1,dan found yang bernilai false
        awal = 0;
        akhir = n - 1;
        found = false;
        
        //perulangnan untuk mendeklarasikan algoritma,
        while ((awal <= akhir) && (found == false)) {
            tengah = (awal + akhir) / 2;
            if (a[tengah] < cari) {
                awal = tengah + 1;
                //jika index array tengah sama dengan angka yang dicari
            } else if (a[tengah] == cari) {
                //maka menampilkan bahwa angka ditemukan
                System.out.println("Angka " + cari + " ditemukan di index " + tengah);
                break;
            } else {
                akhir = tengah - 1;
            }
            tengah = (awal + akhir) / 2;
        }
        if (awal > akhir) {//jika nilai atas lebih dari nilai yang bawah
            System.out.println("Angka " + cari + " tidak ditemukan");
        }
        //Inisialisasi untuk mencari angka ke 2
        //menginisialisasikan batas atas yaitu 0,batas bawah n-1,dan found yang bernilai false
        awal = 0;
        akhir = n - 1;
        found = false;
        
        //perulangnan untuk mendeklarasikan algoritma,
        while ((awal <= akhir) && (found == false)) {
            tengah = (awal + akhir) / 2;
            if (a[tengah] < cari2) {
                awal = tengah + 1;
                //jika index array tengah sama dengan angka yang dicari
            } else if (a[tengah] == cari2) {
                //maka menampilkan bahwa angka ditemukan
                System.out.println("Angka " + cari2 + " ditemukan di index " + tengah);
                break;
            } else {
                akhir = tengah - 1;
            }
            tengah = (awal + akhir) / 2;
        }
        if (awal > akhir) {//jika nilai atas lebih dari nilai yang bawah
            System.out.println("Angka " + cari2 + " tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        System.out.println("DAMAR RAIHAN CHOIRUL FIRDAUS / X-RPL6/ 15");
        System.out.println("=========================================");
        System.out.println("");
                
        //untuk menampilkan pada interface hasil dari method sequential
        BinarySearchJOptionPane1angka search = new BinarySearchJOptionPane1angka();
        search.binary();
    }
}
