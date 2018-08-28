package com.itph.kermis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   Kassa kassa = new Kassa();
   boolean stopKermis = false;
   boolean keuze = false;
   boolean eersteRit = false;
   while(!stopKermis){
       System.out.println("Welkom op de kermis, maak een keuze uit onderstaand menu: ");

   kassa.maakKeuze();




       System.out.println("Toets o voor een overzicht van de totaalomzet. Toets k voor het totaal aantal kaartjes, toets v om verder te gaan, toets q om af te sluiten");

       String input = sc.nextLine();
       input = input.toLowerCase();
       if (input.equals("o")) {
           kassa.totaalOmzet();
           kassa.omzetPerAttractie();


       } else if (input.equals("k")) {
           kassa.totaalRitjes();
           kassa.ritjesPerAttractie();
           System.out.println("--------------------------------------");

       } else if (input.equals("v")) {
           System.out.println("U heeft gekozen om verder te gaan!");


       }else if(input.equals("q")){
           System.out.println("U heeft ervoor gekozen de kermis te verlaten, tot ziens!");
           System.exit(0);
       }else if(input.equals("b")){
           System.out.println("Oké, u heeft de belastinginspecteur aangeroepen!");
           kassa.belastingKnakkerRoepen();
       }




   }

   }

   }


