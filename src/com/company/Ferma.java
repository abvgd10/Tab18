package com.company;

public class Ferma {

    public Ferma() {

    }

    private String adres;
    private byte uylar;
    private byte koylor;
    private byte attar;
    private String nameOwner;

    public Ferma(String adres, byte uylar, byte koylor, byte attar, String nameOwner) {
        this.adres = adres;
        this.uylar = uylar;
        this.koylor = koylor;
        this.attar = attar;
        this.nameOwner = nameOwner;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public byte getUylar() {
        return uylar;
    }

    public void setUylar(byte uylar) {
        this.uylar = uylar;
    }

    public byte getKoylor() {
        return koylor;
    }

    public void setKoylor(byte koylor) {
        this.koylor = koylor;
    }

    public byte getAttar() {
        return attar;
    }

    public void setAttar(byte attar) {
        this.attar = attar;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    @Override
    public String toString() {
        return "Ferma " +
                "adres = " + adres + '\'' +
                "\n uylar = " + uylar +
                " koylor = " + koylor +
                " attar = " + attar +
                "\n nameOwner = " + nameOwner + '\'' +
                '\n';
    }
}
