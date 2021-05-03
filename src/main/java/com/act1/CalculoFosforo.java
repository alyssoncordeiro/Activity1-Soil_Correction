package com.act1;

public class CalculoFosforo extends CalculoTeor {
    private double fosforoEficiencia, fosforoTeorAtingir;
    private double[] valorFosforoFonte = { 18.0, 41.0, 48.0, 45.0, 18.0, 33.0, 29.0, 32.0, 24.0, 18.5, 52.0, 18.0 };
    private double[] calculaEnxofre = { 0.28, 0.2, 0.09, 0.16, 0.28, 0.52, 0.52, 0.45, 0.28, 0.44, 0.0, 0.18 };
    private double[] fontePotassioUtilizarVal = { 58.0, 52.0, 22.0, 44.0 };

    public void setFosforoTeorAtingir(double fosforoTeorAtingir) {
        this.fosforoTeorAtingir = fosforoTeorAtingir;
    }

    public double getFosforoTeorAtingir() {
        return fosforoTeorAtingir;
    }

    public void setFosforoEficiencia(double fosforoEficiencia) {
        this.fosforoEficiencia = fosforoEficiencia;
    }

    public double getFosforoEficiencia() {
        return fosforoEficiencia;
    }

    public void setFosforoFonte(int fosforoFonte) {
        this.fosforoFonte = fosforoFonte;
    }

    public int getFosforoFonte() {
        return fosforoFonte;
    }

    public void setPotassioFonteUtilizar(int potassioFonteUtilizar) {
        this.potassioFonteUtilizar = potassioFonteUtilizar;
    }

    public int getPotassioFonteUtilizar() {
        return potassioFonteUtilizar;
    }

    public double valorFosforoFonte(CalculoFosforo f) {
        return f.valorFosforoFonte[f.fosforoFonte - 1];
    }

    public double valorPotassioFonteUtilizar(CalculoFosforo f) {
        return f.fontePotassioUtilizarVal[f.potassioFonteUtilizar - 1];
    }

    double calculoEnxofre(int fonteFosforo, double quantidadeAplicar) {
        return quantidadeAplicar * calculaEnxofre[fonteFosforo - 1];
    }

    double quantidadeAplicar(double fosforoTeorAtingir, double fosforoEficiencia, double fosforoTeor,
            double fosforoFonte, double resultado) {
        if ((fosforoTeorAtingir - fosforoTeor) < 0.01) {
            return 0;
        } else {
            return ((((fosforoTeorAtingir - fosforoTeor) * 2 * 2.29) * 100 / fosforoEficiencia / 100) * 100
                    / resultado);
        }
    }

    double superfosfatoSimples(int fosforoFonte, double quantidadeAplicar, double calculoTeor) {
        if (fosforoFonte == 5) {
            return quantidadeAplicar * 0.15;
        } else if (fosforoFonte == 1) {
            return calculoTeor * 0.1 / 2.42;
        } else if (fosforoFonte == 12) {
            return calculoTeor * 0.11 / 2.42;
        } else {
            return 0;
        }
    }

    double calculaCusto(int fosforoFonte, double quantidadeAplicar, double valor) {
        if (fosforoFonte >= 1 && fosforoFonte <= 12) {
            return (valor * quantidadeAplicar / 1000);
        } else {
            return 0.0;
        }
    }

    double quantidadeAplicarPotassio(double potassioVerificado, double potassioFonteUtilizar) {
        double resultado = (((potassioVerificado * 39.1 * 10) * 2 * 1.2) * 100 / 0.85 / 100) * 100
                / potassioFonteUtilizar;
        return resultado;
    }

    double custoPotassio(int fontePotassioUtilizar, double valor, double quantidadeAplicarPotassio) {
        return valor * quantidadeAplicarPotassio / 1000;
    }

    double kgHectare(int potassioFonteUtilizar, double quantidadeAplicarPotassio) {
        if (potassioFonteUtilizar == 1) {
            return 0;
        } else if (potassioFonteUtilizar == 2) {
            return quantidadeAplicarPotassio * 0.17;
        } else if (potassioFonteUtilizar == 3) {
            return quantidadeAplicarPotassio * 0.22;
        } else {
            return 0;
        }
    }
}