package br.ufg.inf.generator.xml.estrutura;

import br.ufg.inf.generator.xml.estrutura.RequisitoExecutado;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RequisitoExecutadoTest {

    private static final String REQUISITO_EXECUTADO = "XXVIII";

    @Test
    public void testRequisitoExecutadoValido() {
        RequisitoExecutado instance = new RequisitoExecutado();
        instance.setRequisitoExecutado(REQUISITO_EXECUTADO);
        assertEquals(instance.getRequisitoExecutado(), REQUISITO_EXECUTADO);
    }

    @Test(expected = IllegalStateException.class)
    public void testRequisitoExecutadoNulo() {
        RequisitoExecutado instance = new RequisitoExecutado();
        instance.setRequisitoExecutado(null);
        instance.toString();
    }
}
