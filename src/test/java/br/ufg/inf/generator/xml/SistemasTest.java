package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class SistemasTest {

    private static final String NOME = "dfkjdsfjkds";
    private static final EmpresaDesenvolvedora empresa = new EmpresaDesenvolvedora();
    private static final ArrayList<ArquivoExecutavel> arquivosExe = new ArrayList<ArquivoExecutavel>();
    private final Sistemas sistemas = new Sistemas();

    @Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
        sistemas.setNome(null);
        sistemas.setEmpresaDesenvolvedora(empresa);
        sistemas.setArquivosExecutaveis(arquivosExe);
        sistemas.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testEmpresaDesenvolvedoraNulo() {
        sistemas.setNome("nomeEmpresaDesenvolvedora");
        sistemas.setEmpresaDesenvolvedora(null);
        sistemas.setArquivosExecutaveis(arquivosExe);
        sistemas.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testArquivosExecutaveisNulo() {
        sistemas.setNome("nomeEmpresaDesenvolvedora");
        sistemas.setEmpresaDesenvolvedora(empresa);
        sistemas.setArquivosExecutaveis(null);
        sistemas.toString();
    }

    @Test
    public void testNomeValido() {
        sistemas.setNome(NOME);
        assertEquals(NOME, sistemas.getNome());
    }

    @Test
    public void testEmpresaValido() {
        sistemas.setEmpresaDesenvolvedora(empresa);
        assertEquals(empresa, sistemas.getEmpresaDesenvolvedora());
    }

    @Test
    public void testArquivosValido() {
        sistemas.setArquivosExecutaveis(arquivosExe);
        assertEquals(arquivosExe, sistemas.getArquivosExecutaveis());
    }
}
