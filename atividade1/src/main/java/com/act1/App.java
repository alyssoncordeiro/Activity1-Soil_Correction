package com.act1;

public class App {
    public static void main(String[] args) {
        CalculoTeor t = new CalculoTeor();
        double fosforoTeor, potassioTeor, calcioTeor, magnesioTeor;

        fosforoTeor = t.calculaFosforo();
        potassioTeor = t.calculaPotassio();
        calcioTeor = t.calculaCalcio();
        magnesioTeor = t.calculaMagnesio();

        System.out.println(fosforoTeor);
        System.out.println(potassioTeor);
        System.out.println(calcioTeor);
        System.out.println(magnesioTeor);
    }
}
