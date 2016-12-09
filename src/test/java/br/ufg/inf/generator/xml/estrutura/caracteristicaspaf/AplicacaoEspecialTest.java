package br.ufg.inf.generator.xml.estrutura.caracteristicaspaf;

import br.ufg.inf.generator.xml.estrutura.caracteristicaspaf.AplicacaoEspecial;
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
    public void testAplicacaoEspecialNulo() {
        AplicacaoEspecial instance = new AplicacaoEspecial();
        instance.setAplicacao(null);
        instance.toString();
    }
}
