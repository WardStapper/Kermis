package com.itph.kermis;

public class Ladderklimmen extends Attractie implements GokAttractie {

   static  double omzet = 0;
     int ritjes =0;

@Override
    public void draaien(){
        System.out.println("De attractie ladderklimmen draait!");

        kansSpelBelastingBetaling();
    Kassa.inspecteur +=1;
    System.out.println("Inspecteurpunten");
    }
//
    public void ritjes(){
        System.out.println("Het totaal aantal ritjes bij de Ladderklimmen is " + ritjes );
    }


    public void betalen(){

        double prijs = 5;
        omzet+= prijs;
        Kassa.totaalomzet += prijs;
        ritjes += 1;
        Kassa.ritjes +=1;
        System.out.println("U heeft " + prijs +  " betaald! Tabée");

    }

    public void omzet(){


        System.out.println("De omzet bij Ladderklimmen is in totaal: " + omzet);





    }

    @Override
    public void kansSpelBelastingBetaling() {

    Kassa.belastingen +=1.5;
    System.out.println("U heeft zojuist kansspelbelasting moeten lappen!");
    this.omzet -=1.5;







    }
}
