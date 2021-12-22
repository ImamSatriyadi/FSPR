package Sesi6;

import Sesi6.BangunDatar;

public class Lingkaran extends BangunDatar {
    float r, hasil;

    @Override
    float luas() {
        hasil = 3.14f * r * r;

        return hasil;
    }

    @Override
    float keliling() {
        hasil = 3.14f * 2 * r;
        return hasil;
    }

    @Override
    public String toString() {
        return "Lingkaran dengan jari-jari " + r;
    }
}
