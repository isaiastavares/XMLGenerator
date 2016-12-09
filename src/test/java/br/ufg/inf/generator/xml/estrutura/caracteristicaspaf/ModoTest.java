package br.ufg.inf.generator.xml.estrutura.caracteristicaspaf;

import br.ufg.inf.generator.xml.estrutura.caracteristicaspaf.Modo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ModoTest {

    private static final String MODO_RECUPERACAO = "Recuperação de dados";

    @Test
    public void testModoValido() {
        Modo instance = new Modo();
        instance.setModo(MODO_RECUPERACAO);
        assertEquals(instance.getModo(), MODO_RECUPERACAO);
    }

    @Test(expected = IllegalStateException.class)
    public void testModoNulo() {
        Modo instance = new Modo();
        instance.setModo(null);
        instance.toString();
    }
}
