package br.ufg.inf.generator.validadores.xml;

import br.ufg.inf.generator.validadores.xml.XMLValidador;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.ufg.inf.generator.xml.estrutura.Laudo;

@Ignore
public class XMLValidadorTest {

    private static Laudo laudo;

    @Before
    private void init() {
        laudo = new Laudo();
    }

    @Test
    public void deveValidarLaudo() {
        Assert.assertTrue(XMLValidador.validaLaudo(laudo.toString()));
    }
}
