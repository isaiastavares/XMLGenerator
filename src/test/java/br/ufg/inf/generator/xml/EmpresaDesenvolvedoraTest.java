package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmpresaDesenvolvedoraTest {

	private static final String RAZAO_SOCIAL = "SIAGRI SISTEMAS DE GESTAO LTDA.";
	private static final String CNPJ = "02435301000173";

	@Test
    public void testRazaoSocialValido() {
		EmpresaDesenvolvedora instance = new EmpresaDesenvolvedora();
		instance.setRazaoSocial(RAZAO_SOCIAL);
        assertEquals(instance.getRazaoSocial(), RAZAO_SOCIAL);
    }

	@Test
    public void testCnpj() {
		EmpresaDesenvolvedora instance = new EmpresaDesenvolvedora();
		instance.setCnpj(CNPJ);
        assertEquals(instance.getCnpj(), CNPJ);
    }

	@Test(expected = IllegalStateException.class)
    public void testRazaoSocialNulo() {
		EmpresaDesenvolvedora instance = new EmpresaDesenvolvedora();
        instance.setRazaoSocial(null);
        instance.setCnpj(CNPJ);
        instance.toString();
    }

	@Test(expected = IllegalStateException.class)
    public void testCnpjNulo() {
		EmpresaDesenvolvedora instance = new EmpresaDesenvolvedora();
		instance.setRazaoSocial(RAZAO_SOCIAL);
        instance.setCnpj(null);
        instance.toString();
    }
}