/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.generator.xml;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matheus
 */
public class AplicacaoEspecialTest {
    
    public AplicacaoEspecialTest() {
    }

    /**
     * Test of getAplicacao method, of class AplicacaoEspecial.
     */
    @Test
    public void testGetAplicacao() {
        System.out.println("getAplicacao");
        AplicacaoEspecial instance = new AplicacaoEspecial();
        String expResult = "";
        String result = instance.getAplicacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAplicacao method, of class AplicacaoEspecial.
     */
    @Test
    public void testSetAplicacao() {
        System.out.println("setAplicacao");
        String aplicacao = "";
        AplicacaoEspecial instance = new AplicacaoEspecial();
        instance.setAplicacao(aplicacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
