package br.ufg.inf.generator.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Kalyn
 */
public class RoteiroAnaliseTest {
    private String VERSAOROTEIRO;
    private String VERSAOERPAF;
    private String MES;
    private String ANO;
    
    @Before
    public void beforeMethod(){
        VERSAOROTEIRO = "1";
        VERSAOERPAF = "1";
        MES = "12";
        ANO = "2013";
    }
    
    @Test
    public void testVersaoRoteiroValido() {
        RoteiroAnalise instance = new RoteiroAnalise();
        instance.setVersaoRoteiro(VERSAOROTEIRO);
        String result = instance.getVersaoRoteiro();
        assertEquals(VERSAOROTEIRO, result);
    }
    
    @Test
    public void testVersaoErPafValido() {
        RoteiroAnalise instance = new RoteiroAnalise();
        instance.setVersaoErPaf(VERSAOERPAF);
        String result = instance.getVersaoErPaf();
        assertEquals(VERSAOERPAF, result);
    }

    @Test
    public void testMesValido() {
        RoteiroAnalise instance = new RoteiroAnalise();
        instance.setMes(MES);
        String result = instance.getMes();
        assertEquals(MES, result);
    }

    @Test
    public void testAnoValido() {
        RoteiroAnalise instance = new RoteiroAnalise();
        instance.setAno(ANO);
        String result = instance.getAno();
        assertEquals(ANO, result);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testVersaoRoteiroNulo(){
        RoteiroAnalise instance = new RoteiroAnalise();
        instance.setVersaoRoteiro(null);
        instance.setVersaoErPaf(VERSAOERPAF);
        instance.setMes(MES);
        instance.setAno(ANO);
        instance.toString();
    }
    
    @Test(expected = IllegalStateException.class)
    public void testVersaoErPafNulo(){
        RoteiroAnalise instance = new RoteiroAnalise();
        instance.setVersaoRoteiro(VERSAOROTEIRO);
        instance.setVersaoErPaf(null);
        instance.setMes(MES);
        instance.setAno(ANO);
        instance.toString();
    }
    
    @Test(expected = IllegalStateException.class)
    public void testMesNulo(){
        RoteiroAnalise instance = new RoteiroAnalise();
        instance.setVersaoRoteiro(VERSAOROTEIRO);
        instance.setVersaoErPaf(VERSAOERPAF);
        instance.setMes(null);
        instance.setAno(ANO);
        instance.toString();
    }
    
    @Test(expected = IllegalStateException.class)
    public void testAnoNulo(){
        RoteiroAnalise instance = new RoteiroAnalise();
        instance.setVersaoRoteiro(VERSAOROTEIRO);
        instance.setVersaoErPaf(VERSAOERPAF);
        instance.setMes(MES);
        instance.setAno(null);
        instance.toString();
    }
    
}
