package com.itph.kermis;

public class Spiegelpaleis extends Attractie {
    static double omzet;
    int ritjes;


    public void draaien(){
        System.out.println("Welkom in het spiegelpaleis!");


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
    public void omzet(){
        System.out.println("De omzet bij Spiegelpaleis is in totaal: " + omzet);


    }
}
