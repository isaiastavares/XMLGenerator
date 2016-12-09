package br.ufg.inf.generator.xml.estrutura.mensagem;

import br.ufg.inf.generator.xml.estrutura.mensagem.NaoConformidade;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NaoConformidadeTest {

    private static final String REQUISITO = "requisito teste";
    private static final int ITEM = 1;
    private static final String DESCRICAO = "descrição do item comercializado";

    @Test
    public void testRequisitoValido() {
        final NaoConformidade nConf = new NaoConformidade();
        nConf.setRequisito(REQUISITO);
        String resultado = nConf.getRequisito();
        assertEquals(REQUISITO, resultado);
    }

    @Test
    public void testDescricaoValido() {
        final NaoConformidade nConf = new NaoConformidade();
        nConf.setDescricao(DESCRICAO);
        String resultado = nConf.getDescricao();
        assertEquals(DESCRICAO, resultado);
    }

    @Test
    public void testItemValido() {
        final NaoConformidade nConf = new NaoConformidade();
        nConf.setItem(ITEM);
        int resultado = nConf.getItem();
        assertEquals(ITEM, resultado);
    }

    @Test(expected = IllegalStateException.class)
    public void testDescricaoInvalido() {
        final NaoConformidade nConf = new NaoConformidade();
        nConf.setRequisito(REQUISITO);
        nConf.setItem(ITEM);
        nConf.setDescricao(null);
        nConf.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testRequisitoInvalido() {
        final NaoConformidade nConf = new NaoConformidade();
        nConf.setRequisito(null);
        nConf.setItem(ITEM);
        nConf.setDescricao(DESCRICAO);
        nConf.toString();
    }
}
