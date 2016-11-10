package br.ufg.inf.generator.xml;

import org.joda.time.LocalDate;
import org.junit.Test;

public class EmissaoTest {

	@Test(expected = IllegalStateException.class)
    public void naoDevePermitirDataNulo() {
        final Emissao emissao = new Emissao();
        emissao.setLocal("");
        emissao.toString();
    }

	@Test(expected = IllegalStateException.class)
    public void naoDevePermitirLocalNulo() {
        final Emissao emissao = new Emissao();
        emissao.setData(new LocalDate(2016, 8, 11));
        emissao.toString();
    }
}
