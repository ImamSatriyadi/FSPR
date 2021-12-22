package Sesi6;

import Sesi6.BangunDatar;

public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
    float hasil;

    @Override
    float luas() {
        hasil = 0.5f * alas * tinggi;

        return hasil;
    }

    @Override
    float keliling() {
        // float kaki = Math.sqrt(Double.parseDouble(alas/2)*(alas/2)+(tinggi*tinggi));
        float sisiMiring = ((alas / 2) * (alas / 2)) + (tinggi * tinggi);
        sisiMiring = (float) Math.sqrt(sisiMiring);
        hasil = alas + tinggi + sisiMiring;
        return hasil;
    }
}
