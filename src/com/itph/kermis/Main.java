package com.itph.kermis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bezoeker bezoeker = new Bezoeker();
        bezoeker.startBezoek();
        bezoeker.bezoekKeuze();

        System.out.println("Tot ziens!");

    }


}