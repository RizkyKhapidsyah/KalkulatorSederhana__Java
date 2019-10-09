//SEBUAH KALKULATOR SEDERHANA

package com.rizkykhapidsyah.kalkulator;

import com.rizkykhapidsyah.kalkulator.model.Banner;
import com.rizkykhapidsyah.kalkulator.model.Data;
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.util.Scanner;

import static com.rizkykhapidsyah.kalkulator.model.Banner.ENTER;

public class Main {
    public static void main(String[] args) {
        Scanner InputUser;
        int X, PilihanMenu = 0;
        float Nilai1, Nilai2, Hasil = 0;
        char Operator;

        InputUser = new Scanner(System.in);
        Banner BannerAtas = new Banner();
        Data Subtitel = new Data();

        BannerAtas.cetakMenuUtama();
        PilihanMenu = InputUser.nextInt();

        System.out.println(ENTER);

        try {
            if (PilihanMenu == 1) {
                BannerAtas.cetakJudul1();
                Subtitel.cetakKalimatInput1();
                Nilai1 = InputUser.nextFloat();
                Subtitel.cetakKalimatInput2();
                Operator = InputUser.next().charAt(0);
                Subtitel.cetakKalimatInput3();
                Nilai2 = InputUser.nextFloat();

                if (Operator == '+') {
                    Hasil = Nilai1 + Nilai2;
                } else if (Operator == '-') {
                    Hasil = Nilai1 - Nilai2;
                } else if (Operator == 'x' || Operator == '*') {
                    Hasil = Nilai1 * Nilai2;
                } else if (Operator == '/') {
                    if (Nilai1 == 0) {
                        Subtitel.cetakErrTipe1();
                    } else {
                        Hasil = Nilai1 / Nilai2;
                    }
                } else {
                    Subtitel.cetakErrTipe2();
                }
            } else if (PilihanMenu == 2) {
                BannerAtas.cetakJudul2();
                Subtitel.cetakKalimatInput1();
                Nilai1 = InputUser.nextFloat();
                Subtitel.cetakKalimatInput2();
                Operator = InputUser.next().charAt(0);
                Subtitel.cetakKalimatInput3();
                Nilai2 = InputUser.nextFloat();

                switch (Operator) {
                    case '+':
                        Hasil = Nilai1 + Nilai2;
                        break;
                    case '-':
                        Hasil = Nilai1 - Nilai2;
                        break;
                    case '*':
                        Hasil = Nilai1 * Nilai2;
                        break;
                    case '/':
                        if (Nilai2 == 0) {
                            Subtitel.cetakErrTipe2();
                        } else {
                            Hasil = Nilai1 / Nilai2;
                        }
                        break;
                    default:
                        Subtitel.cetakErrTipe3();
                        break;
                }
            } else {
                Subtitel.cetakErrTipe3();
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println(ENTER);
        Subtitel.cetakKalimatOutput();
        System.out.println(Hasil);
    }
}
