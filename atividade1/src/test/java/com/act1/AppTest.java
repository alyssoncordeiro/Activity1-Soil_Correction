package com.act1;

import org.junit.Test;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void testFosforoSolo1() {
        CalculoTeor t = new CalculoTeor();
        t.setTexturaSolo(1);

        try {
            Assert.assertEquals(9.0, t.fosforoTeor(t), 0);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testFosforoSolo2() {
        CalculoTeor t = new CalculoTeor();
        t.setTexturaSolo(2);

        try {
            Assert.assertEquals(12.0, t.fosforoTeor(t), 0);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testPotassioSolo1() {
        CalculoTeor t = new CalculoTeor();
        t.setTexturaSolo(1);

        try {
            Assert.assertEquals(0.35, t.potassioTeor(t), 0);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testPotassioSolo2() {
        CalculoTeor t = new CalculoTeor();
        t.setTexturaSolo(2);

        try {
            Assert.assertEquals(0.25, t.potassioTeor(t), 0);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testCalcioSolo1() {
        CalculoTeor t = new CalculoTeor();
        t.setTexturaSolo(1);

        try {
            Assert.assertEquals(6.00, t.calcioTeor(t), 0);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testCalcioSolo2() {
        CalculoTeor t = new CalculoTeor();
        t.setTexturaSolo(2);

        try {
            Assert.assertEquals(4.00, t.calcioTeor(t), 0);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testMagnesioSolo1() {
        CalculoTeor t = new CalculoTeor();
        t.setTexturaSolo(1);

        try {
            Assert.assertEquals(1.50, t.magnesioTeor(t), 0);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testMagnesioSolo2() {
        CalculoTeor t = new CalculoTeor();
        t.setTexturaSolo(2);

        try {
            Assert.assertEquals(1.00, t.magnesioTeor(t), 0);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testEnxofreSolo1() {
        CalculoTeor t = new CalculoTeor();
        t.setTexturaSolo(1);

        try {
            Assert.assertEquals(9.0, t.enxofreTeor(t), 0);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testEnxofreSolo2() {
        CalculoTeor t = new CalculoTeor();
        t.setTexturaSolo(2);

        try {
            Assert.assertEquals(6.0, t.enxofreTeor(t), 0);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testAluminioSolo1() {
        CalculoTeor t = new CalculoTeor();
        t.setTexturaSolo(1);

        try {
            Assert.assertEquals(0.0, t.aluminioTeor(t), 0);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testAluminioSolo2() {
        CalculoTeor t = new CalculoTeor();
        t.setTexturaSolo(2);

        try {
            Assert.assertEquals(0.0, t.aluminioTeor(t), 0);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void somatoriaSCmolSolo1() {
        CalculoTeor t = new CalculoTeor();
        Somatoria s = new Somatoria();

        t.setPotassio(0.35);
        t.setCalcio(6.00);
        t.setMagnesio(1.50);

        try {
            Assert.assertEquals(7.85, s.somatoriaCmol(t.getPotassio(), t.getCalcio(), t.getMagnesio()), 1);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void somatoriaCtcSolo1() {
        CalculoTeor t = new CalculoTeor();
        Somatoria s = new Somatoria();

        t.setPotassio(0.35);
        t.setCalcio(6.00);
        t.setMagnesio(1.50);
        t.setHal(5.35);

        try {
            Assert.assertEquals(13.20, s.somatoriaCtcCmol(t.getPotassio(), t.getCalcio(), t.getMagnesio(), t.getHal()),
                    1);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testVAtualSolo1() {
        CalculoTeor t = new CalculoTeor();
        Somatoria s = new Somatoria();

        t.setPotassio(0.35);
        t.setCalcio(6.00);
        t.setMagnesio(1.50);
        t.setHal(5.35);

        try {
            Assert.assertEquals(59.46, s.vAt(t.getPotassio(), t.getCalcio(), t.getMagnesio(), t.getHal()), 1);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "ERROR");
        }
    }

    @Test
    public void testeMOPercentual() {
        Somatoria s = new Somatoria();

        Assert.assertEquals(3.07, s.MOPercentual(30.7), 1);
    }

    @Test
    public void testeCalculaCarbono() {
        Somatoria s = new Somatoria();

        Assert.assertEquals(17.848837209302324, s.calculaCarbono(s.MOPercentual(30.7)), 1);
    }

    @Test
    public void testeParticipacaoPotassioCTC() {
        CalculoTeor t = new CalculoTeor();

        t.setPotassio(0.15);
        t.setCalcio(5.76);
        t.setMagnesio(1.63);
        t.setHal(5.35);

        Assert.assertEquals(1.2, t.participacaoPotassioCTC(t.getPotassio(), t.getCalcio(), t.getMagnesio(), t.getHal()),
                1);
    }

    @Test
    public void testeParticipacaoPotassioCTCIdeal() {
        CalculoTeor t = new CalculoTeor();

        t.setTexturaSolo(1);

        Assert.assertEquals(3.0, t.participacaoPotassioCTCIdeal(t), 0);
    }

    @Test
    public void testeQuantidadeAplicadaPotassio() {
        CalculoTeor t = new CalculoTeor();
        CalculoPotassio p = new CalculoPotassio();
        CalculoFosforo f = new CalculoFosforo();

        t.setTexturaSolo(1);
        p.setPotassioFonteUtilizar(1);
        t.setPotassio(0.15);
        t.setCalcio(5.76);
        t.setMagnesio(1.63);
        t.setHal(5.35);

        Assert.assertEquals(450.55,
                f.quantidadeAplicarPotassio(t.verificaParticipacaoPotassio(t), p.ValPotassioFonteUtilizar(p)), 1);
    }

    @Test
    public void testeKgHectare() {
        CalculoTeor t = new CalculoTeor();
        CalculoPotassio p = new CalculoPotassio();
        CalculoFosforo f = new CalculoFosforo();

        t.setTexturaSolo(1);
        p.setPotassioFonteUtilizar(1);
        t.setPotassio(0.15);
        t.setCalcio(5.76);
        t.setMagnesio(1.63);
        t.setHal(5.35);

        Assert.assertEquals(0,
                f.kgHectare(p.getPotassioFonteUtilizar(),
                        f.quantidadeAplicarPotassio(t.verificaParticipacaoPotassio(t), p.ValPotassioFonteUtilizar(p))),
                1);
    }

}
