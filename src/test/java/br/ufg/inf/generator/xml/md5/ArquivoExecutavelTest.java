package br.ufg.inf.generator.xml.md5;

import br.ufg.inf.generator.xml.md5.ArquivoExecutavel;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArquivoExecutavelTest {

    private static final String NOME = "SAgrVecf.exe";
    private static final String MD5 = "69878722b61836d8feeef9cff95c358b";

    @Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
        final ArquivoExecutavel arquivoExecutavel = new ArquivoExecutavel();
        arquivoExecutavel.setNome(null);
        arquivoExecutavel.setMd5(MD5);
        arquivoExecutavel.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testMD5Nulo() {
        final ArquivoExecutavel arquivoExecutavel = new ArquivoExecutavel();
        arquivoExecutavel.setNome(NOME);
        arquivoExecutavel.setMd5(null);
        arquivoExecutavel.toString();
    }

    @Test
    public void testNomeValido() {
        final ArquivoExecutavel arquivoExecutavel = new ArquivoExecutavel();
        arquivoExecutavel.setNome(NOME);
        assertEquals(NOME, arquivoExecutavel.getNome());
    }

    @Test
    public void testMD5Valido() {
        final ArquivoExecutavel arquivoExecutavel = new ArquivoExecutavel();
        arquivoExecutavel.setMd5(MD5);
        assertEquals(MD5, arquivoExecutavel.getMd5());
    }
}
