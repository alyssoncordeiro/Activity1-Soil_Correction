package com.act1;

public class Somatoria extends App {
    public double somaCmol(double CalcioTeor, double MagnesioTeor, double PotassioTeor) {
        double somaCmol;

        somaCmol = CalcioTeor + MagnesioTeor + PotassioTeor;
        if (somaCmol > 0.01) {
            return somaCmol;
        } else {
            return 0;
        }
    }

    public double somaCtcCmol(double CalcioTeor, double MagnesioTeor, double PotassioTeor, double hal) {
        double ctcCmol;
        ctcCmol = CalcioTeor + MagnesioTeor + PotassioTeor + hal;

        if (ctcCmol > 0.01) {
            return ctcCmol;
        } else {
            return 0;
        }
    }

    public double vAt(double CalcioTeor, double MagnesioTeor, double PotassioTeor, double hAl) {
        double x;
        x = ((100 * (CalcioTeor + MagnesioTeor + PotassioTeor)) / (CalcioTeor + MagnesioTeor + PotassioTeor + hAl));
        return x;
    }

}
