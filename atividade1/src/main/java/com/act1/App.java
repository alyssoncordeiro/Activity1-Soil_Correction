package com.act1;

public class App {
    public static void main(String[] args) {
        CalculoTeor t = new CalculoTeor();
        double fosforoTeor, potassioTeor, calcioTeor, magnesioTeor, enxofreTeor, aluminioTeor;

        fosforoTeor = t.calculaFosforo();
        potassioTeor = t.calculaPotassio();
        calcioTeor = t.calculaCalcio();
        magnesioTeor = t.calculaMagnesio();
        enxofreTeor = t.calculaEnxofre();
        aluminioTeor = t.calculaAluminio();

        System.out.println(fosforoTeor);
        System.out.println(potassioTeor);
        System.out.println(calcioTeor);
        System.out.println(magnesioTeor);
        System.out.println(enxofreTeor);
        System.out.println(aluminioTeor);
    }
}
