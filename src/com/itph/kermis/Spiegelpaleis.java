package com.itph.kermis;

public class Spiegelpaleis extends Attractie {
    static double omzet;
    int ritjes;


    public void draaien(){
        System.out.println("Welkom in het spiegelpaleis!");
        Belastinginspecteur.inspecteur +=1;


}

    public void ritjes(){
        System.out.println("Het totaal aantal ritjes bij Spiegelpaleis is " + ritjes );

    }

    public void betalen(){

        double prijs = 2.75;
        omzet+= prijs;
        Kassa.totaalomzet += prijs;
        ritjes += 1;
        Kassa.ritjes +=1;
        System.out.println("U heeft " + prijs +  " betaald! Tabée");

    }


}
