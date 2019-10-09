package com.rizkykhapidsyah.kalkulator.model;

public class Banner {
    public static final String ENTER = "\n";
    char Separator = '#';
    int X;

    String Judul[] = {
            "Pilih Cara Yang Ingin Diproses : ",
            "1 - Menggunakan Statemen IF",
            "2 - Menggunakan Statemen SWITCH",
            "Pilihan : "
    };

    public void cetakGaris() {
        for (X = 0; X <= 50; X++) {
            System.out.print(Separator);
        }
        System.out.print(ENTER);
    }

    public void cetakMenuUtama() {
        cetakGaris();
        System.out.println(Judul[0] + ENTER + Judul[1] + ENTER + Judul[2]);
        cetakGaris();
        System.out.print(Judul[3]);
    }

    public void cetakJudul1() {
        cetakGaris();
        System.out.println(Judul[1]);
        cetakGaris();
    }

    public void cetakJudul2() {
        cetakGaris();
        System.out.println(Judul[2]);
        cetakGaris();
    }
}
