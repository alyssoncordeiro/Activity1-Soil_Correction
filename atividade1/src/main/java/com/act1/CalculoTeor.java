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
        Potassio f = new Potassio();

        f.setTexturaSolo(1);
        if (f.getTexturaSolo() == 1) {
            f.setValPotassio(0.35);
        } else if (f.getTexturaSolo() == 2) {
            f.setValPotassio(0.35);
        }
        return f.getValPotassio();
    }
}
