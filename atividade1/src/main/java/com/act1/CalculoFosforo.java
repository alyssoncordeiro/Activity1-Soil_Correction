package com.act1;

public class CalculoFosforo extends App {
    private double fosforoEficiencia;

    public void setfosforoEficiencia(double fosforoEficiencia) {
        this.fosforoEficiencia = fosforoEficiencia;
    }

    public Double getfosforoEficiencia() {
        return fosforoEficiencia;
    }

    public Double valorFosforoFonte(CalculoTeor t) {
        if (t.fosforoFonte == 1) {
            return 18.0;
        } else if (t.fosforoFonte == 2) {
            return 41.0;
        } else if (t.fosforoFonte == 3) {
            return 48.0;
        } else if (t.fosforoFonte == 4) {
            return 45.0;
        } else if (t.fosforoFonte == 5) {
            return 18.0;
        } else if (t.fosforoFonte == 6) {
            return 33.0;
        } else if (t.fosforoFonte == 7) {
            return 29.0;
        } else if (t.fosforoFonte == 8) {
            return 32.0;
        } else if (t.fosforoFonte == 9) {
            return 24.0;
        } else if (t.fosforoFonte == 10) {
            return 18.5;
        } else if (t.fosforoFonte == 11) {
            return 52.0;
        } else if (t.fosforoFonte == 12) {
            return 18.0;
        }
        return fosforoEficiencia;
    }
}
