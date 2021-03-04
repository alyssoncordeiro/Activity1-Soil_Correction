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
            p.setValPotassio(0.25);
        }
        return p.getValPotassio();
    }

    public double calculaCalcio() {
        Calcio c = new Calcio();

        c.setTexturaSolo(1);
        if (c.getTexturaSolo() == 1) {
            c.setValCalcio(6.00);
        } else if (c.getTexturaSolo() == 2) {
            c.setValCalcio(4.00);
        }
        return c.getValCalcio();
    }

    public double calculaMagnesio() {
        Magnesio m = new Magnesio();

        m.setTexturaSolo(1);
        if (m.getTexturaSolo() == 1) {
            m.setValMagnesio(1.50);
        } else if (m.getTexturaSolo() == 2) {
            m.setValMagnesio(1.00);
        }
        return m.getValMagnesio();
    }

    public double calculaEnxofre() {
        Enxofre e = new Enxofre();

        e.setTexturaSolo(1);
        if (e.getTexturaSolo() == 1) {
            e.setValEnxofre(9.00);
        } else if (e.getTexturaSolo() == 2) {
            e.setValEnxofre(6.00);
        }
        return e.getValEnxofre();
    }

    public double calculaAluminio() {
        Aluminio a = new Aluminio();

        a.setTexturaSolo(1);
        if (a.getTexturaSolo() == 1) {
            a.setValAluminio(0.00);
        } else if (a.getTexturaSolo() == 2) {
            a.setValAluminio(0.00);
        }
        return a.getValAluminio();
    }
}
