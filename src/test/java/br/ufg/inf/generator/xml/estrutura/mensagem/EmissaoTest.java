package br.ufg.inf.generator.xml.estrutura.mensagem;

import br.ufg.inf.generator.xml.estrutura.mensagem.Emissao;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class EmissaoTest {

    private static final String NOME_LOCAL = "Local Teste";

    @Test
    public void testDataValida() {
        final Emissao emissao = new Emissao();
        LocalDate localDate = LocalDate.of(2016, 8, 11);
        emissao.setData(localDate);
        assertEquals(localDate, emissao.getData());
    }

    @Test
    public void testLocalValido() {
        final Emissao emissao = new Emissao();
        emissao.setLocal(NOME_LOCAL);
        assertEquals(NOME_LOCAL, emissao.getLocal());
    }

    @Test(expected = IllegalStateException.class)
    public void testDataNulo() {
        final Emissao emissao = new Emissao();
        emissao.setLocal(NOME_LOCAL);
        emissao.setData(null);
        emissao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testLocalNulo() {
        final Emissao emissao = new Emissao();
        emissao.setData(LocalDate.of(2016, 8, 11));
        emissao.setLocal(null);
        emissao.toString();
    }
}
