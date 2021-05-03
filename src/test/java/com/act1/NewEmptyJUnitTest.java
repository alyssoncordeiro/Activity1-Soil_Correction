package com.act1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewEmptyJUnitTest {

    @Test
    public void test01() {
        CalculoTeor t = new CalculoTeor();
        Somatoria s = new Somatoria();
        t.setTexturaSolo(1);
        t.setFosforo(8.59);
        t.setPotassio(0.15);
        t.setCalcio(5.76);
        t.setMagnesio(1.63);
        t.setEnxofre(3.67);
        t.setAluminio(0.0);
        t.setHal(5.35);

        assertEquals(7.54, s.somatoriaCmol(t.getPotassio(), t.getCalcio(), t.getMagnesio())); //Calculo do S cmol
        assertEquals(12.89, s.somatoriaCtcCmol(t.getPotassio(), t.getCalcio(), t.getMagnesio(), t.getHal()));// Calculo do CTC cmol
        assertEquals(58.494957331264544, s.vAt(t.getPotassio(), t.getCalcio(), t.getMagnesio(), t.getHal()));// Calculo do V% Atual
        assertEquals(3.07, s.MOPercentual(30.7));//Calculo do M.O%
        assertEquals(17.848837209302324, s.calculaCarbono(3.07)); //Calculo do Carbono
    }
    
    @Test
    public void test02(){
        
    }

}
