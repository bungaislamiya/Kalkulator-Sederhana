/*
Nama    : Bunga Islamiya Putri
NPM     : 20191310053
Latihan Bab 2
*/
package com.company;

import java.util.Scanner;
public class Main {
    static float total = 0, bil1 = 1, bil2 = 1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Bilangan Ke 1 : ");
        bil1 = input.nextFloat();
        System.out.println("Masukkan Bilangan ke 2 : ");
        bil2 = input.nextFloat();

        while (bil2!=0 && bil1!=0) {
            System.out.println("\t Tugas Kalkulator Sederhana");
            System.out.println("1. Perkalian");
            System.out.println("2. Pembagian");
            System.out.println("3. Penjumlahan");
            System.out.println("4. Pengurangan");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println(+ bil1 + "*" + bil2);
                    System.out.println("Hasilnya = ");
                    total = bil1 * bil2;
                    break;

                case 2:
                    System.out.println(+ bil1 + "/" + bil2);
                    System.out.println("Hasilnya = ");
                    total = bil1 / bil2;
                    break;

                case 3:
                    System.out.println(+ bil1 + "+" + bil2);
                    System.out.println("Hasilnya = ");
                    total = bil1 + bil2;
                    break;

                case 4:
                    System.out.println(+ bil1 + "-" + bil2);
                    System.out.println("Hasilnya = ");
                    total = bil1 - bil2;
                    break;

                default:
                    System.out.print("Anda harus mengisi angka");
            }
            System.out.print(total);
        }
    }
}
