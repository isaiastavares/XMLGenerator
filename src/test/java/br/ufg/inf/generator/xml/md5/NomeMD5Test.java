package br.ufg.inf.generator.xml.md5;

import br.ufg.inf.generator.xml.md5.NomeMD5;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NomeMD5Test {

    private static final String NOME = "AssinaNFe.exe";
    private static final String MD5 = "6de507486cd2b75468a78da4f01dd328";

    @Test
    public void testNomeValido() {
        NomeMD5 instance = new NomeMD5();
        instance.setNome(NOME);
        assertEquals(instance.getNome(), NOME);
    }

    @Test
    public void testMd5Valido() {
        NomeMD5 instance = new NomeMD5();
        instance.setMd5(MD5);
        assertEquals(instance.getMd5(), MD5);
    }

    @Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
        NomeMD5 instance = new NomeMD5();
        instance.setNome(null);
        instance.setMd5(MD5);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testMd5Nulo() {
        NomeMD5 instance = new NomeMD5();
        instance.setNome(NOME);
        instance.setMd5(null);
        instance.toString();
    }
}
