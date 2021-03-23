package com.act1;

public class CalculoTeor extends App {
    private double fosforo, potassio, calcio, magnesio, enxofre, aluminio, hal;
    int texturaSolo;

    public double getTexturaSolo() {
        return texturaSolo;
    }

    public void setTexturaSolo(int texturaSolo) {
        this.texturaSolo = texturaSolo;
    }

    public double getFosforo() {
        return fosforo;
    }

    public void setFosforo(double fosforo) {
        this.fosforo = fosforo;
    }

    public double getPotassio() {
        return potassio;
    }

    public void setPotassio(double potassio) {
        this.potassio = potassio;
    }

    public double getCalcio() {
        return calcio;
    }

    public void setCalcio(double calcio) {
        this.calcio = calcio;
    }

    public double getAluminio() {
        return aluminio;
    }

    public void setAluminio(double aluminio) {
        this.aluminio = aluminio;
    }

    public double getEnxofre() {
        return enxofre;
    }

    public void setEnxofre(double enxofre) {
        this.enxofre = enxofre;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(double magnesio) {
        this.magnesio = magnesio;
    }

    public double getHal() {
        return hal;
    }

    public void setHal(double Hal) {
        this.hal = Hal;
    }

    public Double fosforoTeor(CalculoTeor t) {
        if (t.texturaSolo == 1) {
            return 9.0;
        } else {
            return 12.0;
        }
    }

    public Double potassioTeor(CalculoTeor t) {
        if (t.texturaSolo == 1) {
            return 0.35;
        } else {
            return 0.25;
        }
    }

    public Double calcioTeor(CalculoTeor t) {
        if (t.texturaSolo == 1) {
            return 6.00;
        } else {
            return 4.00;
        }
    }

    public Double magnesioTeor(CalculoTeor t) {
        if (t.texturaSolo == 1) {
            return 1.50;
        } else {
            return 1.00;
        }
    }

    public Double enxofreTeor(CalculoTeor t) {
        if (t.texturaSolo == 1) {
            return 9.00;
        } else {
            return 6.00;
        }
    }

    public Double aluminioTeor(CalculoTeor t) {
        if (t.texturaSolo == 1) {
            return 0.0;
        } else {
            return 0.0;
        }
    }

}