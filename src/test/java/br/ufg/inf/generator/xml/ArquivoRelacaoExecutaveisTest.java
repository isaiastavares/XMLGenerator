package br.ufg.inf.generator.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Kalyn
 */
public class ArquivoRelacaoExecutaveisTest {

    private String NOME;
    private String MD5;

    @Before
    public void beforeMethod() {
        NOME = "Nome.dll";
        MD5 = "01207371072bb6436b29110542a41927";
    }

    @Test
    public void testNomeValido() {
        ArquivoRelacaoExecutaveis instance = new ArquivoRelacaoExecutaveis();
        instance.setNome(NOME);
        String result = instance.getNome();
        assertEquals(NOME, result);
    }

    @Test
    public void testMd5Valido() {
        ArquivoRelacaoExecutaveis instance = new ArquivoRelacaoExecutaveis();
        instance.setMd5(MD5);
        String result = instance.getMd5();
        assertEquals(MD5, result);
    }

}
