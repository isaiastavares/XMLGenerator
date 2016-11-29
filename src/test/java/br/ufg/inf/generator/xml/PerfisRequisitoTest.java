package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author hiago
 */
public class PerfisRequisitoTest {

    private static final String PERFILREQUISITO = "S";

    @Test(expected = IllegalStateException.class)
    public void testPerfilRequisitoNuloInvalido() {
        final PerfisRequisito perfilRequisito = new PerfisRequisito();
        perfilRequisito.toString();
    }

    @Test
    public void testCpfValido() {
        final PerfisRequisito perfilRequisito = new PerfisRequisito();
        perfilRequisito.setPerfilRequisito(PERFILREQUISITO);
        assertEquals(PERFILREQUISITO, perfilRequisito.getPerfilRequisito());
    }
}
