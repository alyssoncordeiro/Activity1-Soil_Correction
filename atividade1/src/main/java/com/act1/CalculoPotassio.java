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

}
