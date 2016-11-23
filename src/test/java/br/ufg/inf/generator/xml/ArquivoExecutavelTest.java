package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArquivoExecutavelTest {

    private static final String NOME = "SAgrVecf.exe";
    private static final String MD5 = "69878722b61836d8feeef9cff95c358b";

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNomeNulo() {
        final ArquivoExecutavel arquivoExecutavel = new ArquivoExecutavel();
        arquivoExecutavel.setMd5(MD5);
        arquivoExecutavel.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirMD5Nulo() {
        final ArquivoExecutavel arquivoExecutavel = new ArquivoExecutavel();
        arquivoExecutavel.setNome(NOME);
        arquivoExecutavel.toString();
    }

    @Test
    public void deveRetornarNomeCorretamente() {
    	final ArquivoExecutavel arquivoExecutavel = new ArquivoExecutavel();
        arquivoExecutavel.setNome(NOME);
        assertEquals(NOME, arquivoExecutavel.getNome());
    }

    @Test
    public void deveRetornarMD5Corretamente() {
    	final ArquivoExecutavel arquivoExecutavel = new ArquivoExecutavel();
    	arquivoExecutavel.setMd5(MD5);
        assertEquals(MD5, arquivoExecutavel.getMd5());
    }
}
