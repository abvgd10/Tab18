package com.company;

public class Koy {
    private int ves;
    private byte jashy;
    private String pol;
    private String klichka;

    public Koy() {
    }

    public Koy(int ves, byte jashy, String pol, String klichka) {
        this.ves = ves;
        this.jashy = jashy;
        this.pol = pol;
        this.klichka = klichka;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public byte getJashy() {
        return jashy;
    }

    public void setJashy(byte jashy) {
        this.jashy = jashy;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getKlichka() {
        return klichka;
    }

    public void setKlichka(String klichka) {
        this.klichka = klichka;
    }

    @Override
    public String toString() {
        return "Koy " +
                "ves = " + ves +
                "  jashy = " + jashy +
                "\n pol = " + pol + '\'' +
                "  klichka = " + klichka + '\'' +
                '\n';
    }
}
