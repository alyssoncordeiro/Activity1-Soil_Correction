package com.act1;

import java.util.Scanner;

public class CalculoTeor extends App {
    private double fosforo, potassio, calcio, magnesio, enxofre, aluminio, scmol, ctc, hal, vAtual;

    public double getFosforo() {
        return fosforo;
    }

    public double getPotassio() {
        return potassio;
    }

    public double getCalcio() {
        return calcio;
    }

    public double getAluminio() {
        return aluminio;
    }

    public double getEnxofre() {
        return enxofre;
    }

    public double getScmol() {
        return scmol;
    }

    public double getCtc() {
        return ctc;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public double getHal() {
        return hal;
    }

    public double getVAtual() {
        return vAtual;
    }

    /*
     * textura do solo 1 = solo argiloso; textura do solo 2 = textura média
     */
    public double calculaTeor() {
        Teor t = new Teor();
        double teorSolo = 0;

        Scanner ler = new Scanner(System.in);
        System.out.printf("\nInforme o tipo do solo = ");

        teorSolo = ler.nextDouble();
        t.setTexturaSolo(teorSolo);
        if (t.getTexturaSolo() == 1) {
            System.out.printf("\nSolo argiloso\n");
            System.out.printf("\nTeores Ideais:\n");
            this.fosforo = 9;
            this.potassio = 0.35;
            this.calcio = 6;
            this.magnesio = 1.5;
            this.enxofre = 9;
            this.aluminio = 0;
            this.hal = 5.35;

            this.vAtual = ((100 * (this.calcio + this.magnesio + this.potassio))
                    / (this.calcio + this.magnesio + this.potassio + hal));

            if (calcio + magnesio + potassio > 0.01) {
                this.scmol = this.calcio + this.magnesio + this.potassio;
            }
            if (calcio + magnesio + potassio + hal > 0.01) {
                this.ctc = this.calcio + this.magnesio + this.potassio + this.hal;
            }

        } else if (t.getTexturaSolo() == 2) {
            System.out.printf("\nSolo de textura média\n");
            System.out.printf("\nTeores Ideais:\n");
            this.fosforo = 12;
            this.potassio = 0.25;
            this.calcio = 4;
            this.magnesio = 1;
            this.enxofre = 6;
            this.aluminio = 0;
            this.hal = 5.35;

            this.vAtual = ((100 * (this.calcio + this.magnesio + this.potassio))
                    / (this.calcio + this.magnesio + this.potassio + hal));

            if (calcio + magnesio + potassio > 0.01) {
                this.scmol = this.calcio + this.magnesio + this.potassio;
            }
            if (calcio + magnesio + potassio + hal > 0.01) {
                this.ctc = this.calcio + this.magnesio + this.potassio + this.hal;
            }
        }
        t.setValTeor(teorSolo);
        return t.getValTeor();
    }

}
