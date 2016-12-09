/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.generator.xml.md5;

import br.ufg.inf.generator.xml.md5.ArquivoExecutavelPrincipal;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Kalyn
 */
public class ArquivoExecutavelPrincipalTest {

    private static String NOME;
    private static String MD5;

    @Before
    public void beforeMethod() {
        NOME = "Venda.exe";
        MD5 = "a1207371072bb6436b29110542a419d5";
    }

    @Test
    public void testNomeValido() {
        ArquivoExecutavelPrincipal instance = new ArquivoExecutavelPrincipal();
        instance.setNome(NOME);
        String result = instance.getNome();
        assertEquals(NOME, result);
    }

    @Test
    public void testMd5Valido() {
        ArquivoExecutavelPrincipal instance = new ArquivoExecutavelPrincipal();
        instance.setMd5(MD5);
        String result = instance.getMd5();
        assertEquals(MD5, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
        ArquivoExecutavelPrincipal instance = new ArquivoExecutavelPrincipal();
        instance.setNome(null);
        instance.setMd5(MD5);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testMd5Nulo() {
        ArquivoExecutavelPrincipal instance = new ArquivoExecutavelPrincipal();
        instance.setNome(NOME);
        instance.setMd5(null);
        instance.toString();
    }

}
