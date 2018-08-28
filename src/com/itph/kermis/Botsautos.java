package com.itph.kermis;

public class Botsautos extends Attractie {


    static double omzet = 0;
    int ritjes = 0;

    public void draaien(){
        System.out.println("Botsautos gaan!");
        Belastinginspecteur.inspecteur +=1;



    }
    public void ritjes(){
        System.out.println("Het totaal aantal ritjes bij de Botsautos is " + ritjes );

    }

    public void betalen(){

        double prijs = 2.50;
        omzet+= prijs;
        Kassa.totaalomzet += prijs;
        ritjes += 1;
        Kassa.ritjes +=1;
        System.out.println("U heeft " + prijs +  " betaald! Tabée");

    }
    public void omzet(){
        System.out.println("De omzet bij Botsautos is in totaal: " + omzet);


    }

}
