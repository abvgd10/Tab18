package com.company;

public class At {
    private int ves;
    private byte jashy;
    private String color;
    private String pol;
    private String klichka;

    public At() {
    }

    public At(int ves, byte jashy, String color, String pol, String klichka) {
        this.ves = ves;
        this.jashy = jashy;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "At " +
                "ves = " + ves +
                "  jashy = " + jashy +
                "\n color = " + color + '\'' +
                "  pol = " + pol + '\'' +
                "\n klichka = " + klichka + '\'' +
                '\n';
    }
}
