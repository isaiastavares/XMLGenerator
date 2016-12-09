package br.ufg.inf.generator.xml.estrutura.identificacaopaf;

import br.ufg.inf.generator.xml.estrutura.identificacaopaf.PerfilRequisito;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PerfilRequisitoTest {

    private static final String PERFIL_REQUISITO = "V";

    @Test
    public void testPerfilValido() {
        PerfilRequisito instance = new PerfilRequisito();
        instance.setPerfil(PERFIL_REQUISITO);
        assertEquals(instance.getPerfil(), PERFIL_REQUISITO);
    }

    @Test(expected = IllegalStateException.class)
    public void testPerfilNulo() {
        PerfilRequisito instance = new PerfilRequisito();
        instance.setPerfil(null);
        instance.toString();
    }
}
