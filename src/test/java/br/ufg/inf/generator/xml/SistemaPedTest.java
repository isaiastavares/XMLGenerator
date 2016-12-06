package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class SistemaPedTest {

	private static final String NOME = "dfkjdsfjkds";
    private static final EmpresaDesenvolvedora empresa = new EmpresaDesenvolvedora();
    private static final ArrayList<ArquivoExecutavel> arquivosExe = new ArrayList<ArquivoExecutavel>();
    private final SistemaPed sistemaPed = new SistemaPed();

    @Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
    	sistemaPed.setNome(null);
        sistemaPed.setEmpresaDesenvolvedora(empresa);
        sistemaPed.setArquivosExecutaveis(arquivosExe);
        sistemaPed.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testEmpresaDesenvolvedoraNulo() {
        sistemaPed.setNome("nomeEmpresaDesenvolvedora");
        sistemaPed.setEmpresaDesenvolvedora(null);
        sistemaPed.setArquivosExecutaveis(arquivosExe);
        sistemaPed.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testArquivosExecutaveisNulo() {
        sistemaPed.setNome("nomeEmpresaDesenvolvedora");
        sistemaPed.setEmpresaDesenvolvedora(empresa);
        sistemaPed.setArquivosExecutaveis(null);
        sistemaPed.toString();
    }

    @Test
    public void testNomeValido() {
        sistemaPed.setNome(NOME);
        assertEquals(NOME, sistemaPed.getNome());
    }

    @Test
    public void testEmpresaValido() {
        sistemaPed.setEmpresaDesenvolvedora(empresa);
        assertEquals(empresa, sistemaPed.getEmpresaDesenvolvedora());
    }

    @Test
    public void testArquivosValido() {
        sistemaPed.setArquivosExecutaveis(arquivosExe);
        assertEquals(arquivosExe, sistemaPed.getArquivosExecutaveis());
    }
}
