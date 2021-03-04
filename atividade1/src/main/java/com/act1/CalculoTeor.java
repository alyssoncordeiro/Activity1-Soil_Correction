package com.act1;

public class CalculoTeor extends App {
    public double calculaFosforo() {
        Fosforo f = new Fosforo();

        f.setTexturaSolo(1);
        if (f.getTexturaSolo() == 1) {
            f.setValFosforo(9.00);
        } else if (f.getTexturaSolo() == 2) {
            f.setValFosforo(12.00);
        }
        return f.getValFosforo();
    }

    public double calculaPotassio() {
        Potassio p = new Potassio();

        p.setTexturaSolo(1);
        if (p.getTexturaSolo() == 1) {
            p.setValPotassio(0.35);
        } else if (p.getTexturaSolo() == 2) {
            p.setValPotassio(0.35);
        }
        return p.getValPotassio();
    }

    public double calculaCalcio() {
        Calcio c = new Calcio();

        c.setTexturaSolo(1);
        if (c.getTexturaSolo() == 1) {
            c.setValCalcio(0.35);
        } else if (c.getTexturaSolo() == 2) {
            c.setValCalcio(0.35);
        }
        return c.getValCalcio();
    }
}
