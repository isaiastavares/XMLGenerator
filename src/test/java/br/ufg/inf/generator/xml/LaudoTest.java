package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LaudoTest {

	@Test
    public void deveRetornarMensagemCorretamente() {
		final Laudo laudo = new Laudo();
		Mensagem mensagem = new Mensagem();
        laudo.setMensagem(mensagem);
        assertEquals(mensagem, laudo.getMensagem());
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirVersaoNulo() {
        final Laudo laudo = new Laudo();
        laudo.setMensagem(new Mensagem());
        laudo.toString();
    }

    @Test
    public void deveRetornarVersaoCorretamente() {
        final Laudo laudo = new Laudo();
        String versao = "1.10";
        laudo.setVersao(versao);
        assertEquals(versao, laudo.getVersao());
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirMensagemNulo() {
        final Laudo laudo = new Laudo();
        laudo.setVersao("1.10");
        laudo.toString();
    }
}
