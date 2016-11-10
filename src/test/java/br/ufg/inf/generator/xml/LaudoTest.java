package br.ufg.inf.generator.xml;

import org.junit.Test;

public class LaudoTest {

	@Test(expected = IllegalStateException.class)
    public void naoDevePermitirVersaoNulo() {
		final Laudo laudo = new Laudo();
		laudo.setMensagem(new Mensagem());
		laudo.toString();
    }

	@Test(expected = IllegalStateException.class)
    public void naoDevePermitirMensagemNulo() {
		final Laudo laudo = new Laudo();
		laudo.setVersao("1.10");
		laudo.toString();
    }
}
