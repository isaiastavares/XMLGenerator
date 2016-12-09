package br.ufg.inf.generator.xml.md5;

import br.ufg.inf.generator.xml.md5.ArquivoOutro;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArquivoOutroTest {

    private static final String NOME = "SAgrVecf.exe";
    private static final String MD5 = "69878722b61836d8feeef9cff95c358b";

    @Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
        final ArquivoOutro arquivoOutro = new ArquivoOutro();
        arquivoOutro.setNome(null);
        arquivoOutro.setMd5(MD5);
        arquivoOutro.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testMD5Nulo() {
        final ArquivoOutro arquivoOutro = new ArquivoOutro();
        arquivoOutro.setNome(NOME);
        arquivoOutro.setMd5(null);
        arquivoOutro.toString();
    }

    @Test
    public void testNomeValido() {
        final ArquivoOutro arquivoOutro = new ArquivoOutro();
        arquivoOutro.setNome(NOME);
        assertEquals(NOME, arquivoOutro.getNome());
    }

    @Test
    public void testMD5Valido() {
        final ArquivoOutro arquivoOutro = new ArquivoOutro();
        arquivoOutro.setMd5(MD5);
        assertEquals(MD5, arquivoOutro.getMd5());
    }
}
