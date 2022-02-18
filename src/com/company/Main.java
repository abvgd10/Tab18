package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("     Ferma 1");
        Ferma ferma = new Ferma("Bishkek vastok", (byte) 5, (byte) 3, (byte) 2,"Abdunuur");
        System.out.println(ferma);

        System.out.println("     Uylar");
        System.out.println();
        Uy uy = new Uy(114, (byte) 6,"Kyz","Uy1");
        System.out.println(uy);

        Uy uy1 = new Uy(94, (byte) 3,"Erkek","Uy2");
        System.out.println(uy1);

        Uy uy2 = new Uy(145, (byte) 7,"Erkek","Uy3");
        System.out.println(uy2);

        Uy uy3 = new Uy(97, (byte) 4,"Kyz","Uy4");
        System.out.println(uy3);

        Uy uy4 = new Uy(109, (byte) 8,"Kyz","Uy5");
        System.out.println(uy4);

        System.out.println("     koylor");
        System.out.println();
        Koy koy = new Koy(63, (byte) 4,"Kyz","Koy1");
        System.out.println(koy);

        Koy koy1 = new Koy(72, (byte) 6,"Kyz","Koy2");
        System.out.println(koy1);

        Koy koy2 = new Koy(78, (byte) 6,"Erkek","Koy3");
        System.out.println(koy2);

        System.out.println("    Attar");
        System.out.println();
        At at = new At(112, (byte) 6,"Kuron","Kyz","At1");
        System.out.println(at);

        At at1 = new At(137, (byte) 7,"Kara","Erkek","At2");
        System.out.println(at1);

        System.out.println("     Ferma 2");
        Ferma ferma2 = new Ferma("Bishkek Alamedin", (byte) 1, (byte) 1, (byte) 1,"Abdunuur");
        System.out.println(ferma2);

        System.out.println("     Uylar");
        System.out.println();
        Uy uy0 = new Uy(97, (byte) 4,"Kyz","Uy4");
        System.out.println(uy0);

        System.out.println("     koylor");
        System.out.println();
        Koy koy0 = new Koy(78, (byte) 6,"Erkek","Koy3");
        System.out.println(koy0);

        System.out.println("    Attar");
        System.out.println();
        At at0 = new At(112, (byte) 6,"Kuron","Kyz","At1");
        System.out.println(at0);
    }
}
