package br.ufg.inf.generator.validadores.xsd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.ufg.inf.generator.xml.Laudo;

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
