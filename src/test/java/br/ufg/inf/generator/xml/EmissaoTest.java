package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

public class EmissaoTest {

	private static final String NOME_LOCAL = "Local Teste";

	@Test
    public void testDataValida() {
        final Emissao emissao = new Emissao();
        LocalDate localDate = new LocalDate(2016, 8, 11);
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
        emissao.setData(new LocalDate(2016, 8, 11));
        emissao.setLocal(null);
        emissao.toString();
    }
}
