package com.act1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CalculoTeor t = new CalculoTeor();
        double hAl = 0;

        double fosforoTeor, potassioTeor, calcioTeor, magnesioTeor, enxofreTeor, aluminioTeor, HAL;

        Somatoria s = new Somatoria();
        double somaSCmol, somaCtc, x;

        fosforoTeor = t.calculaFosforo();
        potassioTeor = t.calculaPotassio();
        calcioTeor = t.calculaCalcio();
        magnesioTeor = t.calculaMagnesio();
        enxofreTeor = t.calculaEnxofre();
        aluminioTeor = t.calculaAluminio();
        hAl = t.HAL();

        System.out.printf("Teor Fosforo = %.2f\n", fosforoTeor);
        System.out.printf("Teor Potassio = %.2f\n", potassioTeor);
        System.out.printf("Teor Calcio = %.2f\n", calcioTeor);
        System.out.printf("Teor Magnesio = %.2f\n", magnesioTeor);
        System.out.printf("Teor Enxofre = %.2f\n", enxofreTeor);
        System.out.printf("Teor Aluminio = %.2f\n", aluminioTeor);

        somaSCmol = s.somaCmol(potassioTeor, calcioTeor, magnesioTeor);
        somaCtc = s.somaCtcCmol(potassioTeor, calcioTeor, magnesioTeor, hAl);
        x = s.vAt(potassioTeor, calcioTeor, magnesioTeor, hAl);

        System.out.printf("Resultado S Cmol = %.2f\n", somaSCmol);
        System.out.printf("Resultado CTC Cmol = %.2f\n", somaCtc);
        System.out.printf("Resultado V Atual = %.2f\n", x);

    }

}
