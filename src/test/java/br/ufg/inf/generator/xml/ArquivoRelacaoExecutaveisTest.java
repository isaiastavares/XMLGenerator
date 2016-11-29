package br.ufg.inf.generator.xml;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kalyn
 */
public class ArquivoRelacaoExecutaveisTest {
    private String NOME = "Nome.dll";
    private String MD5 = "01207371072bb6436b29110542a41927";
    

    @Test
    public void testGetSetNome() {
        ArquivoRelacaoExecutaveis instance = new ArquivoRelacaoExecutaveis();
        instance.setNome(NOME);
        String result = instance.getNome();
        assertEquals(NOME, result);
    }

    @Test
    public void testGetSetMd5() {
        ArquivoRelacaoExecutaveis instance = new ArquivoRelacaoExecutaveis();
        instance.setMd5(MD5);
        String result = instance.getMd5();
        assertEquals(MD5, result);
    }
    
}
