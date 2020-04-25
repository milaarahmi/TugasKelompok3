package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static final Scanner in = new Scanner ( System.in );

    public static void main(String[] args) {

        boolean run = true;

        while (run) {
            int menu = menuProgram ();

            switch (menu) {
                case 1:
                    PenjumlahanBilanganPrima ();
                    break;
                case 2:
                    JumlahBilanganPrima ();
                    break;
                case 3 :
                    run = false;
                    break;
            }
        }
        System.out.println ( "\n-------------------------Terima Kasih-------------------------" );
    }

    private static void JumlahBilanganPrima() {
        int BilPrimaSatu = 0,BilPrimaDua = 0;
        int Jumlah = 0;

        System.out.println("Masukkan Bilangan 1 ");
        BilPrimaSatu = in.nextInt();

        System.out.println("Masukkan Bilangan 2 ");
        BilPrimaDua = in.nextInt();

        System.out.println("\nBilangan Prima Antara "+BilPrimaSatu+" dan "+BilPrimaDua+ " adalah ");

        ArrayList BilPrima = new ArrayList();
        for (int x = BilPrimaSatu;x <= BilPrimaDua; x++){
            boolean bilPrima = true;
            for (int y = 2; y < x; y++) {
                if(x%y==0){
                    bilPrima = false;
                    break;
                }
            }
            if(bilPrima){
                System.out.print("\t" + x +"\t");
                BilPrima.add(x);
            }
        }

        Jumlah = BilPrima.size();
        System.out.println("\nJumlah Bilangan Prima = "+Jumlah);
        System.out.println ( "\n----------------------------------" );
    }

    private static void PenjumlahanBilanganPrima() {
        int BilPrimaSatu = 0,BilPrimaDua = 0;
        int Jumlah = 0;

        System.out.println("Masukkan Bilangan 1 ");
        BilPrimaSatu = in.nextInt();

        System.out.println("Masukkan Bilangan 2 ");
        BilPrimaDua = in.nextInt();

        System.out.println("\nBilangan Prima Antara "+BilPrimaSatu+" dan "+BilPrimaDua+ " adalah ");

        for (int x = BilPrimaSatu;x <= BilPrimaDua; x++){
            boolean BilPrima = true;
            for (int y = 2; y < x; y++) {
                if(x%y==0){
                    BilPrima = false;
                    break;
                }
            }
            if(BilPrima){
                System.out.print("\t" + x +"\t");
                Jumlah += x;
            }
        }

        System.out.println("\nPenjumlahan Bilangan Prima = "+Jumlah);
        System.out.println ( "\n----------------------------------" );
    }

    private static int menuProgram() {
        System.out.println("Menu Hari Ini\n" +
                "1. Penjumlahan Bilangan Prima\n" +
                "2. Jumlah Bilangan Prima\n" +
                "3. Exit");

        int dataMenu = 0;

        while (dataMenu < 1 || dataMenu > 3) {
            try{
                System.out.print("Masukkan Pilihan Anda: ");
                dataMenu = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Mohon maaf menu yang anda inputkan salah");
            }
            in.nextLine();
        }

        return dataMenu;
    }
}
