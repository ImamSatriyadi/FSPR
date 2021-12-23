package Sesi_6;

import Sesi_6.BangunDatar;

public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;
    float hasil;

    @Override
    float luas() {
        hasil = panjang * lebar;

        return hasil;
    }

    @Override
    float keliling() {
        hasil = 2 * (panjang + lebar);
        return hasil;
    }
}
