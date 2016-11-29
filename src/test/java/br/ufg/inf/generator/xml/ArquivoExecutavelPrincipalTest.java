/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.generator.xml;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kalyn
 */
public class ArquivoExecutavelPrincipalTest {
    private static final String NOME = "Venda.exe";
    private static final String MD5 = "a1207371072bb6436b29110542a419d5";
    
    
    @Test
    public void testGetSetNome() {
        ArquivoExecutavelPrincipal instance = new ArquivoExecutavelPrincipal();
        instance.setNome(NOME);
        String result = instance.getNome();
        assertEquals(NOME, result);
    }

    @Test
    public void testGetSetMd5() {
        ArquivoExecutavelPrincipal instance = new ArquivoExecutavelPrincipal();
        instance.setMd5(MD5);
        String result = instance.getMd5();
        assertEquals(MD5, result);
    }
    
}
