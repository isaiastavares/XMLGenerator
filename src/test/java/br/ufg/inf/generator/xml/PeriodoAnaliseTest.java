package br.ufg.inf.generator.xml;

import br.ufg.inf.generatorEmpresaDesenv.xml.PeriodoAnalise;
import org.joda.time.LocalDate;
import org.junit.Test;

public class PeriodoAnaliseTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDataInicioNulo() {
        final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        periodoAnalise.setDataFim(new LocalDate(2016, 8, 11));
        periodoAnalise.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirDataFimNulo() {
        final PeriodoAnalise periodoAnalise = new PeriodoAnalise();
        periodoAnalise.setDataInicio(new LocalDate(2016, 8, 11));
        periodoAnalise.toString();
    }
}
