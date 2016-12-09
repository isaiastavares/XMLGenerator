package br.ufg.inf.generator.xml.md5;

import br.ufg.inf.generator.xml.md5.ArquivoRelacaoExecutaveis;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ArquivoRelacaoExecutaveisTest {

    private static String NOME;
    private static String MD5;

    @Before
    public void beforeMethod() {
        NOME = "Nome.dll";
        MD5 = "01207371072bb6436b29110542a41927";
    }

    @Test
    public void testNomeValido() {
        final ArquivoRelacaoExecutaveis instance = new ArquivoRelacaoExecutaveis();
        instance.setNome(NOME);
        String result = instance.getNome();
        assertEquals(NOME, result);
    }

    @Test
    public void testMd5Valido() {
        final ArquivoRelacaoExecutaveis instance = new ArquivoRelacaoExecutaveis();
        instance.setMd5(MD5);
        String result = instance.getMd5();
        assertEquals(MD5, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
        final ArquivoRelacaoExecutaveis instance = new ArquivoRelacaoExecutaveis();
        instance.setNome(null);
        instance.setMd5(MD5);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testMd5Nulo() {
        final ArquivoRelacaoExecutaveis instance = new ArquivoRelacaoExecutaveis();
        instance.setNome(NOME);
        instance.setMd5(null);
        instance.toString();
    }
}
