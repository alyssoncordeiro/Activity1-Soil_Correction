package com.act1;

public class CalculoPotassio extends CalculoTeor {

    public void setPotassioFonteUtilizar(int potassioFonteUtilizar) {
        this.potassioFonteUtilizar = potassioFonteUtilizar;
    }

    public int getPotassioFonteUtilizar() {
        return potassioFonteUtilizar;
    }

    public Double ValPotassioFonteUtilizar(CalculoTeor t) {
        if (t.potassioFonteUtilizar == 1) {
            return 58.0;
        } else if (t.potassioFonteUtilizar == 2) {
            return 52.0;
        } else if (t.potassioFonteUtilizar == 3) {
            return 22.0;
        } else if (t.potassioFonteUtilizar == 4) {
            return 44.0;
        } else {
            return 0.0;
        }
    }

}
