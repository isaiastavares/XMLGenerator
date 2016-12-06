package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

public class PeriodoAnaliseTest {

	@Test
    public void testDataInicioCorreto() {
		final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
		LocalDate localDate = new LocalDate(2016, 8, 11);
        periodoAnalise.setDataInicio(localDate);
        assertEquals(localDate, periodoAnalise.getDataInicio());
    }

    @Test(expected = IllegalStateException.class)
    public void testDataInicioNulo() {
        final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        periodoAnalise.setDataInicio(null);
        periodoAnalise.setDataFim(new LocalDate(2016, 8, 11));
        periodoAnalise.toString();
    }

    @Test
    public void testDataFimCorreto() {
		final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
		LocalDate localDate = new LocalDate(2016, 8, 11);
        periodoAnalise.setDataFim(localDate);
        assertEquals(localDate, periodoAnalise.getDataFim());
    }

    @Test(expected = IllegalStateException.class)
    public void testDataFimNulo() {
        final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        periodoAnalise.setDataInicio(new LocalDate(2016, 8, 11));
        periodoAnalise.setDataFim(null);
        periodoAnalise.toString();
    }
}
