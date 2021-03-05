package com.act1;

import java.util.Scanner;

public class CalculoTeor extends App {

    /*
     * textura do solo 1 = solo argiloso; textura do solo 2 = textura média
     */

    public double calculaFosforo() {
        Fosforo f = new Fosforo();
        double teorFos = 0;

        Scanner ler = new Scanner(System.in);
        System.out.printf("\nInforme o teor do fosforo = ");

        teorFos = ler.nextDouble();
        f.setTexturaSolo(teorFos);
        if (f.getTexturaSolo() == 1) {
            teorFos = 9.00;
        } else if (f.getTexturaSolo() == 2) {
            teorFos = 12.00;
        }
        f.setValFosforo(teorFos);
        return f.getValFosforo();
    }

    public double calculaPotassio() {
        Potassio p = new Potassio();
        double teorPo = 0;

        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o teor do potassio = ");

        teorPo = ler.nextDouble();
        p.setTexturaSolo(teorPo);
        if (p.getTexturaSolo() == 1) {
            teorPo = 0.35;
        } else if (p.getTexturaSolo() == 2) {
            teorPo = 0.25;
        }
        p.setValPotassio(teorPo);
        return p.getValPotassio();
    }

    public double calculaCalcio() {
        Calcio c = new Calcio();
        double teorCal = 0;

        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o teor do calcio = ");

        teorCal = ler.nextDouble();
        c.setTexturaSolo(teorCal);
        if (c.getTexturaSolo() == 1) {
            teorCal = 6.00;
        } else if (c.getTexturaSolo() == 2) {
            teorCal = 4.00;
        }
        c.setValCalcio(teorCal);
        return c.getValCalcio();
    }

    public double calculaMagnesio() {
        Magnesio m = new Magnesio();
        double teorMag = 0;

        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o teor do magnesio = ");

        teorMag = ler.nextDouble();
        m.setTexturaSolo(teorMag);
        if (m.getTexturaSolo() == 1) {
            teorMag = 1.50;
        } else if (m.getTexturaSolo() == 2) {
            teorMag = 1.00;
        }
        m.setValMagnesio(teorMag);
        return m.getValMagnesio();
    }

    public double calculaEnxofre() {
        Enxofre e = new Enxofre();
        double teorEnx = 0;

        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o teor do enxofre = ");

        teorEnx = ler.nextDouble();
        e.setTexturaSolo(teorEnx);
        if (e.getTexturaSolo() == 1) {
            teorEnx = 9.00;
        } else if (e.getTexturaSolo() == 2) {
            teorEnx = 6.00;
        }
        e.setValEnxofre(teorEnx);
        return e.getValEnxofre();
    }

    public double calculaAluminio() {
        Aluminio a = new Aluminio();
        double teorAlu = 0;

        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o teor do aluminio = ");

        teorAlu = ler.nextDouble();
        a.setTexturaSolo(teorAlu);
        if (a.getTexturaSolo() == 1) {
            teorAlu = 0.00;
        } else if (a.getTexturaSolo() == 2) {
            teorAlu = 0.00;
        }
        a.setValAluminio(teorAlu);
        return a.getValAluminio();
    }

    public static double HAL() {
        double hAl = 0;

        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o H + AL = ");
        hAl = ler.nextDouble();
        return (hAl);
    }
}
