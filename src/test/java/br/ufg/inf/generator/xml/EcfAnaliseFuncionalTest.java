/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.generator.xml;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Kalyn
 */
public class EcfAnaliseFuncionalTest {
    private MarcaModelo MARCAMODELO;
    
    @Before
    public void beforeMethod(){
        MARCAMODELO = new MarcaModelo();
        MARCAMODELO.setMarca("Marca");
        MARCAMODELO.setModelo("Modelo");
    }

    @Test
    public void testMarcaModeloValido() {
        EcfAnaliseFuncional instance = new EcfAnaliseFuncional();
        instance.setMarcaModelo(MARCAMODELO);
        MarcaModelo result = instance.getMarcaModelo();
        assertEquals(MARCAMODELO, result);
    }
}