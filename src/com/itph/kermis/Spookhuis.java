package com.itph.kermis;

public class Spookhuis extends Attractie {
   static double omzet;
    static int ritjes;
    public void draaien(){

        System.out.println("Spookhuis r go!");


    }

    public void ritjes(){
        System.out.println("Het totaal aantal ritjes bij de Spookhuis is " + ritjes );

    }

    public void betalen(){

        double prijs = 3.20;
        omzet+= prijs;
        Kassa.totaalomzet += prijs;
        ritjes += 1;
        Kassa.ritjes +=1;
        System.out.println("U heeft " + prijs +  " betaald! Tabée");

    }
    public void omzet(){
        System.out.println("De omzet bij Spookhuis is in totaal: " + omzet);


    }

}

