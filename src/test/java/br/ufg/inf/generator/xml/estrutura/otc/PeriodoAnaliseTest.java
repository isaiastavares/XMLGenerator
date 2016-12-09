package br.ufg.inf.generator.xml.estrutura.otc;

import br.ufg.inf.generator.xml.estrutura.otc.PeriodoAnalise;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class PeriodoAnaliseTest {

    @Test
    public void testDataInicioCorreto() {
        final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        LocalDate localDate = LocalDate.of(2016, 8, 11);
        periodoAnalise.setDataInicio(localDate);
        assertEquals(localDate, periodoAnalise.getDataInicio());
    }

    @Test(expected = IllegalStateException.class)
    public void testDataInicioNulo() {
        final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        periodoAnalise.setDataInicio(null);
        periodoAnalise.setDataFim(LocalDate.of(2016, 8, 11));
        periodoAnalise.toString();
    }

    @Test
    public void testDataFimCorreto() {
        final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        LocalDate localDate = LocalDate.of(2016, 8, 11);
        periodoAnalise.setDataFim(localDate);
        assertEquals(localDate, periodoAnalise.getDataFim());
    }

    @Test(expected = IllegalStateException.class)
    public void testDataFimNulo() {
        final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        periodoAnalise.setDataInicio(LocalDate.of(2016, 8, 11));
        periodoAnalise.setDataFim(null);
        periodoAnalise.toString();
    }
}
