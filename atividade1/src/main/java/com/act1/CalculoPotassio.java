package com.act1;

public class CalculoPotassio extends CalculoTeor {

    public void setFontePotassioUtilizar(int fontePotassioUtilizar) {
        this.fontePotassioUtilizar = fontePotassioUtilizar;
    }

    public int getFontePotassioUtilizar() {
        return fontePotassioUtilizar;
    }

    public Double fontePotassioUtilizar(CalculoTeor t) {
        if (t.fontePotassioUtilizar == 1) {
            return 58.0;
        } else if (t.fontePotassioUtilizar == 2) {
            return 52.0;
        } else if (t.fontePotassioUtilizar == 3) {
            return 22.0;
        } else if (t.fontePotassioUtilizar == 4) {
            return 44.0;
        } else {
            return 0.0;
        }
    }

    public Double participacaoPotassioCTC(double teorPotassio, double teorCalcio, double teorMagnesio, double teorHAl) {
        return teorPotassio / (teorCalcio + teorMagnesio + teorPotassio + teorHAl) * 100;
    }

    public Double participacaoPotassioCTCIdeal(CalculoTeor t) {
        if (t.texturaSolo == 1) {
            return 3.0;
        } else {
            return 3.0;
        }
    }

    public Double verificaParticipacaoPotassio(CalculoTeor t) {
        double result = (t.potassio * t.participacaoPotassioCTCIdeal(t)
                / t.participacaoPotassioCTC(t.potassio, t.calcio, t.magnesio, t.hal)) - t.potassio;

        if (result < 0.01) {
            return 0.0;
        } else {
            return result;
        }
    }
}
