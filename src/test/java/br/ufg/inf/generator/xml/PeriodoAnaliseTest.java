package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

import br.ufg.inf.generator.xml.PeriodoAnalise;

public class PeriodoAnaliseTest {

	@Test
    public void deveRetornarDataInicioCorretamente() {
		final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
		LocalDate localDate = new LocalDate(2016, 8, 11);
        periodoAnalise.setDataInicio(localDate);
        assertEquals(localDate, periodoAnalise.getDataInicio());
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDataInicioNulo() {
        final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        periodoAnalise.setDataFim(new LocalDate(2016, 8, 11));
        periodoAnalise.toString();
    }

    @Test
    public void deveRetornarDataFimCorretamente() {
		final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
		LocalDate localDate = new LocalDate(2016, 8, 11);
        periodoAnalise.setDataFim(localDate);
        assertEquals(localDate, periodoAnalise.getDataFim());
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDataFimNulo() {
        final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        periodoAnalise.setDataInicio(new LocalDate(2016, 8, 11));
        periodoAnalise.toString();
    }
}
