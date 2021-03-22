package com.act1;

public class App {
    public static void main(String[] args) {
        CalculoTeor c = new CalculoTeor();
        c.calculaTeor();

        System.out.println("Aluminio: " + c.getAluminio());
        System.out.println("Calcio: " + c.getCalcio());
        System.out.println("Enxofre: " + c.getEnxofre());
        System.out.println("Magnesio: " + c.getMagnesio());
        System.out.println("Potassio: " + c.getPotassio());
        System.out.println("Fosforo: " + c.getFosforo());
        System.out.println("H+AL: " + c.getHal());
        System.out.println("S cmol: " + c.getScmol());
        System.out.println("CTC cmol: " + c.getCtc());
        System.out.println("V Atual: " + c.getVAtual());

    }

}
