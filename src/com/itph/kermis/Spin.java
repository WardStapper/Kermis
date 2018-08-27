package com.itph.kermis;

public class Spin extends Attractie {
    static double omzet;
    int ritjes;

    public void draaien(){
        System.out.println("Spin is go!");


    }
    public void ritjes(){
        System.out.println("Het totaal aantal ritjes bij de Spin is " + ritjes );

    }

    public void betalen(){

        double prijs = 2.25;
        omzet+= prijs;
        Kassa.totaalomzet += prijs;
        ritjes += 1;
        Kassa.ritjes +=1;
        System.out.println("U heeft " + prijs +  " betaald! Tabée");

    }
    public void omzet(){
        System.out.println("De omzet bij Spin is in totaal: " + omzet);


    }
}
