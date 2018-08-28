package com.itph.kermis;

import java.util.ArrayList;

public class Belastinginspecteur {


   public void belastingHeffen(ArrayList<Attractie> attractie){

        for(int a = 0;a<attractie.size();a++)
            if (attractie instanceof GokAttractie){
                ((GokAttractie) attractie).kansSpelBelastingBetaling();
            }
        System.out.println("U heeft " + Kassa.belastingen + " moeten betalen!");


    }

    public void randomLangsgaan(){

       
    }




}
