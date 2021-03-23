package com.act1;

public class Somatoria extends App {
    public double somatoriaCmol(double teorPotassio, double teorCalcio, double teorMagnesio) {
        double sCmol;

        sCmol = teorPotassio + teorCalcio + teorMagnesio;
        if (sCmol > 0.01) {
            return sCmol;
        } else {
            return 0;
        }
    }

    public double somatoriaCtcCmol(double teorPotassio, double teorCalcio, double teorMagnesio, double hal) {
        double ctcCmol;

        ctcCmol = teorPotassio + teorCalcio + teorMagnesio + hal;
        if (ctcCmol > 0.01) {
            return ctcCmol;
        } else {
            return 0;
        }
    }

    public double vAt(double teorPotassio, double teorCalcio, double teorMagnesio, double hal) {
        double x;

        x = ((100 * (teorPotassio + teorCalcio + teorMagnesio)) / (teorPotassio + teorCalcio + teorMagnesio + hal));

        return x;
    }

}