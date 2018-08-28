package com.itph.kermis;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import static com.itph.kermis.Kassa.attractie;

public class Belastinginspecteur {




    static int inspecteur = 0;



    public static void belastingHeffen(ArrayList<Attractie> attractie) {

        for (int a = 0; a < attractie.size(); a++)
            if (attractie instanceof GokAttractie) {
                ((GokAttractie) attractie).kansSpelBelastingBetaling();
            }

        System.out.println("U heeft " + Kassa.belastingen + " moeten betalen!");


    }

  public static boolean randomLangsgaan() {


       if (Kassa.ritjes == 0 || Kassa.ritjes % 15 ==0) {

           int randomInspectie = 0;
           int inspectieCount = 0;
            int inspectieNummer = ThreadLocalRandom.current().nextInt(0, 16);
            randomInspectie = inspectieNummer;
            inspectieCount = 0;
           System.out.println("U heeft inspectienummer: " + inspectieNummer);
            if (randomInspectie == inspectieCount){
                Kassa.ritjes = inspectieCount;
                System.out.println("De belastinginspecteur is random langsgekomen!");
                Belastinginspecteur.belastingHeffen(attractie);
                System.out.println("-----------------------------------------");



            }
        }



        return true;
    }
    }





