package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArquivoOutroTest {

    private static final String NOME = "SAgrVecf.exe";
    private static final String MD5 = "69878722b61836d8feeef9cff95c358b";

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNomeNulo() {
        final ArquivoOutro arquivoOutro = new ArquivoOutro();
        arquivoOutro.setMd5(MD5);
        arquivoOutro.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirMD5Nulo() {
        final ArquivoOutro arquivoOutro = new ArquivoOutro();
        arquivoOutro.setNome(NOME);
        arquivoOutro.toString();
    }

    @Test
    public void deveRetornarNomeCorretamente() {
    	final ArquivoOutro arquivoOutro = new ArquivoOutro();
        arquivoOutro.setNome(NOME);
        assertEquals(NOME, arquivoOutro.getNome());
    }

    @Test
    public void deveRetornarMD5Corretamente() {
    	final ArquivoOutro arquivoOutro = new ArquivoOutro();
    	arquivoOutro.setMd5(MD5);
        assertEquals(MD5, arquivoOutro.getMd5());
    }
}
