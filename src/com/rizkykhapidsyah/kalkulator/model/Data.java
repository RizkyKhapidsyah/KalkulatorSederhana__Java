package com.rizkykhapidsyah.kalkulator.model;

public class Data {
    public static final String KalimatOutput = "Hasil";
    char Spasi = ' ';
    String EqualSymbol = "=> ";
    int X;

    String KalimatInput[] = {
            "Nilai Pertama         => ",
            "Operator (+, -, x, /) => ",
            "Nilai Kedua           => "
    };

    String Operator[] = {
            "+",
            "-",
            "x",
            "*",
            "/"
    };

    String PesanError[] = {
            "Tidak Dapat Dibagi 0",
            "Operator Tidak Ditemukan!",
            "Pilihan salah!, ulangi lagi!",
            "(isi sendiri pesan error yang diinginkan/replace)"
    };

    public void cetakKalimatInput1() {
        System.out.print(KalimatInput[0]);
    }

    public void cetakKalimatInput2() {
        System.out.print(KalimatInput[1]);
    }

    public void cetakKalimatInput3() {
        System.out.print(KalimatInput[2]);
    }

    public void cetakErrTipe1() {
        System.out.println(PesanError[0]);
    }

    public void cetakErrTipe2() {
        System.out.println(PesanError[1]);
    }

    public void cetakErrTipe3() {
        System.out.println(PesanError[2]);
    }

    public void cetakKalimatOutput() {
        System.out.print(KalimatOutput);
        for (X = 0; X <= 16; X++) {
            System.out.print(Spasi);
        }
        System.out.print(EqualSymbol);
    }
}
