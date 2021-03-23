package com.act1;

public class App {
    public static void main(String[] args) {
        CalculoTeor t = new CalculoTeor();

        System.out.println("\nValores ideais do solo: \n");
        System.out.println("Aluminio: " + t.aluminioTeor(t));
        System.out.println("Calcio: " + t.calcioTeor(t));
        System.out.println("Enxofre: " + t.enxofreTeor(t));
        System.out.println("Magnesio: " + t.magnesioTeor(t));
        System.out.println("Potassio: " + t.potassioTeor(t));
        System.out.println("Fosforo: " + t.fosforoTeor(t));
    }

}