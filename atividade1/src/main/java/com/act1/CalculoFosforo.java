package com.act1;

public class CalculoFosforo extends CalculoTeor {
    private double fosforoEficiencia, fosforoTeorAtingir;

    public void setFosforoTeorAtingir(double fosforoTeorAtingir) {
        this.fosforoTeorAtingir = fosforoTeorAtingir;
    }

    public Double getFosforoTeorAtingir() {
        return fosforoTeorAtingir;
    }

    public void setFosforoEficiencia(double fosforoEficiencia) {
        this.fosforoEficiencia = fosforoEficiencia;
    }

    public Double getFosforoEficiencia() {
        return fosforoEficiencia;
    }

    public void setFosforoFonte(int fosforoFonte) {
        this.fosforoFonte = fosforoFonte;
    }

    public int getFosforoFonte() {
        return fosforoFonte;
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
        if (fontePotassioUtilizar == 1 || fontePotassioUtilizar == 2 || fontePotassioUtilizar == 3) {
            return ((valor * quantidadeAplicarPotassio) / 1000);
        }
        return 0;
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

    double calculaEnxofre(int fosforoFonte, double quantidadeAplicar) {
        if (fosforoFonte == 1) {
            return quantidadeAplicar * 0.28;
        } else if (fosforoFonte == 2) {
            return quantidadeAplicar * 0.2;
        } else if (fosforoFonte == 3) {
            return quantidadeAplicar * 0.09;
        } else if (fosforoFonte == 4) {
            return quantidadeAplicar * 0.16;
        } else if (fosforoFonte == 5) {
            return quantidadeAplicar * 0.28;
        } else if (fosforoFonte == 6) {
            return quantidadeAplicar * 0.52;
        } else if (fosforoFonte == 7) {
            return quantidadeAplicar * 0.52;
        } else if (fosforoFonte == 8) {
            return quantidadeAplicar * 0.45;
        } else if (fosforoFonte == 9) {
            return quantidadeAplicar * 0.28;
        } else if (fosforoFonte == 10) {
            return quantidadeAplicar * 0.44;
        } else if (fosforoFonte == 11) {
            return quantidadeAplicar * 0.0;
        } else if (fosforoFonte == 12) {
            return quantidadeAplicar * 0.18;
        } else {
            return 0.0;
        }
    }

}
