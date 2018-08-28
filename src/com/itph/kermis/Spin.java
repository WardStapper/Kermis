package com.itph.kermis;

import java.awt.image.renderable.RenderableImage;

public class Spin extends RisicoRijkeAttracties implements GokAttractie {
    static double omzet;
    int ritjes;


    public void draaien(){
        System.out.println("Spin is go!");
        opstellingsKeuring();
        spinCount += 1;
        System.out.println("Momenteel is de spinCount " + spinCount);
        draaiLimiet();
        kansSpelBelastingBetaling();
        Kassa.inspecteur +=1;
        System.out.println("Inspecteurpunten");
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



    public void draaiLimiet() {
        System.out.println("Draailimiet doet in ieder geval iets!");
        if (spinCount != 0 && spinCount == 6) {
            System.out.println("Waarschuwing: U moet  de Spin laten repareren!");
            System.out.println("Wat wilt u nu doen? Druk m voor repareren, c om door te gaan");
            String repair = sc.nextLine();
            repair = repair.toLowerCase();

            try {
                throw new Exception();

            }
            catch (NumberFormatException draaiLimiet){
                draaiLimiet.printStackTrace();
                System.out.println("U heeft een nummer ingevoerd ipv een letter, jammer!");

            }
            catch (Exception e) {
                e.printStackTrace();
                System.out.println("Probleem opgevangen van Spin!!");
            }


            if (repair.equals("m")) {
                spinCount = 0;
                System.out.println("Uw attractie is gerepareerd!");

            } else if (repair.equals("c")) {

                System.out.println("U gaat nu door!");

            }

        }


    }


    @Override
    public void kansSpelBelastingBetaling() {
        Kassa.belastingen +=1.575;
        System.out.println("U heeft zojuist kansspelbelasting moeten lappen!");
        this.omzet -=0.675;

    }
}

