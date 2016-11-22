package br.ufg.inf.generator.xml;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.Test;

import br.ufg.inf.generator.xml.Emissao;

public class EmissaoTest {

    @Test
    public void deveRetornarADataCorretamente() {
        final Emissao emissao = new Emissao();
        LocalDate localDate = new LocalDate(2016, 8, 11);
        emissao.setData(localDate);
        assertEquals(localDate, emissao.getData());
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDataNulo() {
        final Emissao emissao = new Emissao();
        emissao.setLocal("");
        emissao.toString();
    }

    @Test
    public void deveRetornarOLocalCorretamente() {
        final Emissao emissao = new Emissao();
        String nomeLocal = "Local Teste";
        emissao.setLocal(nomeLocal);
        assertEquals(nomeLocal, emissao.getLocal());
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirLocalNulo() {
        final Emissao emissao = new Emissao();
        emissao.setData(new LocalDate(2016, 8, 11));
        emissao.toString();
    }
}
