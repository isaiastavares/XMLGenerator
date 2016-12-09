package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ModoTest {

	private static final String MODO = "Recuperação de dados";

	@Test
    public void testModoValido() {
		Modo instance = new Modo();
		instance.setModo(MODO);
        assertEquals(instance.getModo(), MODO);
    }

	@Test(expected = IllegalStateException.class)
    public void testModoNulo() {
		Modo instance = new Modo();
        instance.setModo(null);
        instance.toString();
    }
}
