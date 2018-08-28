package com.itph.kermis;

public class Hawaii extends RisicoRijkeAttracties {

    static double omzet;
    int ritjes;


    public void draaien() {
        System.out.println("Welkom in de Hawaii!");
        opstellingsKeuring();
        hawaiiCount +=1;
        draaiLimiet();
        Belastinginspecteur.inspecteur +=1;
        System.out.println("Inspecteurpunten");


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

    public void draaiLimiet(){
        if (hawaiiCount !=0 || hawaiiCount % 10 ==0){
            System.out.println("Waarschuwing: U moet de Hawaii laten repareren! ");
            System.out.println("Wat wilt u nu doen? Druk m voor repareren, c om door te gaan");
            String repair = sc.next();
            repair = repair.toLowerCase();


            try {
                 throw new Exception();


            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Probleem opgevangen van Hawaii!!");
            }

            if (repair.equals("m")) {
                hawaiiCount = 0;
                System.out.println("Uw attractie is gerepareerd!");

            } else if (repair.equals("c")) {
                System.out.println("U gaat nu door!");

            }




        }


    }
    }

