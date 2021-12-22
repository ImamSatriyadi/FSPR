package Sesi6;

import Sesi6.BangunDatar;

public class Persegi extends BangunDatar {
    float sisi, hasil;

    @Override
    float luas() {
        hasil = sisi * sisi;

        return hasil;
    }

    @Override
    float keliling() {
        hasil = 4 * sisi;
        return hasil;
    }
}
