package br.ufg.inf.generator.xml.estrutura;

import br.ufg.inf.generator.xml.estrutura.Mensagem;
import br.ufg.inf.generator.xml.estrutura.Laudo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LaudoTest {

    @Test
    public void testMensagemCorreto() {
        final Laudo laudo = new Laudo();
        Mensagem mensagem = new Mensagem();
        laudo.setMensagem(mensagem);
        assertEquals(mensagem, laudo.getMensagem());
    }

    @Test
    public void testVersaoCorreto() {
        final Laudo laudo = new Laudo();
        String versao = "1.10";
        laudo.setVersao(versao);
        assertEquals(versao, laudo.getVersao());
    }

    @Test(expected = IllegalStateException.class)
    public void testMensagemNulo() {
        final Laudo laudo = new Laudo();
        laudo.setMensagem(null);
        laudo.setVersao("1.10");
        laudo.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testVersaoNulo() {
        final Laudo laudo = new Laudo();
        laudo.setMensagem(new Mensagem());
        laudo.setVersao(null);
        laudo.toString();
    }
}
