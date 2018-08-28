package com.itph.kermis;

public class Hawaii extends Attractie {

    static double omzet;
    int ritjes;


    public void draaien() {
        System.out.println("Welkom in de Hawaii!");
        opstellingsKeuring();


    }
    public void ritjes(){
        System.out.println("Het totaal aantal ritjes bij Hawaii is " + ritjes );

    }

    public void betalen() {
        double kosten = 0;
        kosten += 2.90;
        omzet = kosten;
        ritjes += 1;
        Kassa.ritjes +=1;
        System.out.println("U heeft " + kosten + " betaald! Tabée");

    }
    public void omzet(){
        System.out.println("De omzet bij Hawaii is in totaal: " + omzet);


    }

    public boolean opstellingsKeuring(){

        return true;
    }

}