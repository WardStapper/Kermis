package com.itph.kermis;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kassa  {

    Belastinginspecteur belasting = new Belastinginspecteur();
    Scanner sc = new Scanner(System.in);
    static double totaalomzet = 0;
    static int ritjes = 0;
    static double belastingen = 0;
    static int inspecteur = 0;

    int keuzeNummer;

   static  ArrayList<Attractie> attractie = new ArrayList<>();

    public Kassa(){


        Botsautos botsautos = new Botsautos();
        Spookhuis spookhuis = new Spookhuis();
        Spin spin = new Spin();
        Ladderklimmen ladderklimmen = new Ladderklimmen();
        Hawaii hawaii = new Hawaii();
        Spiegelpaleis spiegelpaleis = new Spiegelpaleis();


        attractie.add(botsautos);
        attractie.add(spookhuis);
        attractie.add(spin);
        attractie.add(ladderklimmen);
        attractie.add(hawaii);
        attractie.add(spiegelpaleis);

    }

    public void maakKeuze (){
        System.out.println("Maak een keuze 1-6");

        for (int a = 0;a<attractie.size();a++){
            System.out.println("Kies " + (a+1) + " voor attractie " + attractie.get(a).getClass().getSimpleName());
          }

          keuzeNummer = sc.nextInt()-1;

/*        try{


            throw new InputMismatchException();

        }catch(InputMismatchException maakKeuze){
            keuzeNummer = 6;

            System.out.println("U heeft geen goede keuze gemaakt!");

        }*/

        attractie.get(keuzeNummer).draaien();
        attractie.get(keuzeNummer).betalen();

        }





    public void totaalOmzet(){
        System.out.println("De totaalomzet is momenteel " + totaalomzet);
        System.out.println("Nadat er belasting af is gegaan is dit " + (totaalomzet - belastingen));
        System.out.println("U heeft in totaal " + Kassa.belastingen + " belasting moeten betalen. " );

    }
    public void totaalRitjes(){
        System.out.println("Het totaal aantal verkochte tickets is " + ritjes);
    }
public void ritjesPerAttractie(){
        for (int a = 0; a<6;a++){
            attractie.get(a).ritjes();
        }


}
    public void omzetPerAttractie(){

        for(int a = 0; a<6;a++){
            attractie.get(a).omzet();
        }
    }

    public void belastingKnakkerRoepen(){
        belasting.belastingHeffen(attractie);

    }

    }




