package dynamicprogamming1;
import java.util.Scanner;
public class Tugas2 {
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    static int knapSack(int W, int berat[], int nilai[], int n) {
        int i, w;
        int[][] K = new int[n + 1][W + 1];
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    K[i][w] = 0;
                } else if (berat[i - 1] <= w) {
                    K[i][w] = max(nilai[i - 1] + K[i - 1][w - berat[i - 1]],
                            K[i - 1][w]);
                } else {
                    K[i][w] = K[i - 1][w];
                }
            }
        }
        return K[n][W];
    }
    public static void main(String[] args) {
        System.out.println("*DAMAR RAIHAN CHOIRUL FIRDAUS / X-RPL6/ 15* \n========================================= \n****Penghitung Bayaran****");
        Scanner baca = new Scanner(System.in);
        System.out.println("Berat Barang: ");
        int n = 5;
        int[] berat = new int[n];
        berat[0] = 4;
        berat[1] = 5;
        berat[2] = 2;
        berat[3] = 3;
        berat[4] = 7;
        for (int x = 0; x < berat.length; x++) {
            System.out.println(berat[x] + "kg ");
        }
        System.out.println("Harga Barang: ");
        int[] nilai = new int[n];
        nilai[0] = 5000;
        nilai[1] = 7000;
        nilai[2] = 2000;
        nilai[3] = 3000;
        nilai[4] = 10000;
        for (int x = 0; x < nilai.length; x++) {
            System.out.println("Rp."+nilai[x]);
        }
        System.out.println("Masukkan berat maksimal: ");
        int W = baca.nextInt();

        System.out.println("nilai maksimal yang dapat diterima kuli: " + knapSack(W, berat, nilai, n));
        baca.close();
    }
}










