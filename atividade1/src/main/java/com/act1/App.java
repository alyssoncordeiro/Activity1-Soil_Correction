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

        System.out.println("O teor do fosforo é:" + fosforoTeor);
        System.out.println("O teor do potassio é:" + potassioTeor);
        System.out.println("O teor do calcio é:" + calcioTeor);
        System.out.println("O teor do magnesio é:" + magnesioTeor);
        System.out.println("O teor do enxofre é:" + enxofreTeor);
        System.out.println("O teor do aluminio é:" + aluminioTeor);
    }
}
