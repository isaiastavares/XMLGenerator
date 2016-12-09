package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AplicacaoEspecialTest {

	private static final String APLICACAO_ESPECIAL = "Demais atividades";

	@Test
    public void testAplicacaoEspecialValido() {
		AplicacaoEspecial instance = new AplicacaoEspecial();
		instance.setAplicacao(APLICACAO_ESPECIAL);
        assertEquals(instance.getAplicacao(), APLICACAO_ESPECIAL);
    }

	@Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
		AplicacaoEspecial instance = new AplicacaoEspecial();
        instance.setAplicacao(null);
        instance.toString();
    }
}
