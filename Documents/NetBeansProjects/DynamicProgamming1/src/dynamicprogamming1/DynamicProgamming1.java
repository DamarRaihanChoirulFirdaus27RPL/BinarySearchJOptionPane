/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogamming1;

/**
 *
 * @author ASUS
 */
public class DynamicProgamming1 {

    static int fibonacci(int n) {
        /* Deklarasikan array untuk menyimpan angka Fibonacci. */
        int f[] = new int[n + 2]; // 1 ekstra untuk menangani casing, n = 0
        int i;

        // Nomor 0 dan 1 dari seri adalah 0 dan 1 
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
            //* Tambahkan 2 angka sebelumnya dalam seri dan simpan 
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacci(n));
    }
}
