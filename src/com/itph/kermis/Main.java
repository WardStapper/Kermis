package com.itph.kermis;


public class Main {

    public static void main(String[] args) {
        Belastinginspecteur bel = new Belastinginspecteur();
        Bezoek bezoeker = new Bezoek();
        bel.randomLangsgaan();
        bezoeker.bezoekje();

        System.out.println("Tot ziens!");

    }


}