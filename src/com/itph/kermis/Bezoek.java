package com.itph.kermis;

import java.util.Scanner;

public class Bezoek {
        Belastinginspecteur belastingMan = new Belastinginspecteur();
        Scanner sc = new Scanner(System.in);
        Kassa kassa = new Kassa();
        boolean stopKermis = false;
        boolean correcteKeuze = false;


    public void bezoekje() {
        while (!stopKermis) {
            System.out.println("Welkom op de kermis, maak een keuze uit onderstaand menu: ");

            kassa.maakKeuze();
            belastingMan.randomLangsgaan();

        while(!correcteKeuze){
            System.out.println("Toets o voor een overzicht van de totaalomzet. Toets k voor het totaal aantal kaartjes, toets v om verder te gaan, toets q om af te sluiten, b voor belastingdienst");

            String input = sc.nextLine();
            input = input.toLowerCase();
            if (input.equals("o")) {
                kassa.totaalOmzet();
                kassa.omzetPerAttractie();
                correcteKeuze = true;

            } else if (input.equals("k")) {
                kassa.totaalRitjes();
                kassa.ritjesPerAttractie();
                System.out.println("--------------------------------------");
                correcteKeuze = true;

            } else if (input.equals("v")) {
                System.out.println("U heeft gekozen om verder te gaan!");
                correcteKeuze = true;


            } else if (input.equals("q")) {
                System.out.println("U heeft ervoor gekozen de kermis te verlaten, tot ziens!");
                System.exit(0);
            } else if (input.equals("b")) {
                System.out.println("Oké, u heeft de belastinginspecteur aangeroepen!");
                kassa.belastingKnakkerRoepen();
                correcteKeuze = true;
            } else {
                System.out.println("Dit is een ongeldige invoer, probeer nog een keer!");


            }
        }

        }
    }

        }




