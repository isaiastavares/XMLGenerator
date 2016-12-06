package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

/**
 *
 * @author hiago
 */
public class SistemaGestaoTest {

    private static final String NOME = "dfkjdsfjkds";
    private static final EmpresaDesenvolvedora empresa = new EmpresaDesenvolvedora();
    private static final ArrayList<ArquivoExecutavel> arquivosExe = new ArrayList<ArquivoExecutavel>();
    private final SistemaGestao sistemaGestao = new SistemaGestao();

    @Test(expected = IllegalStateException.class)
    public void testNomeNulo() {
    	sistemaGestao.setNome(null);
        sistemaGestao.setEmpresaDesenvolvedora(empresa);
        sistemaGestao.setArquivosExecutaveis(arquivosExe);
        sistemaGestao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testEmpresaDesenvolvedoraNulo() {
        sistemaGestao.setNome("nomeEmpresaDesenvolvedora");
        sistemaGestao.setEmpresaDesenvolvedora(null);
        sistemaGestao.setArquivosExecutaveis(arquivosExe);
        sistemaGestao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testArquivosExecutaveisNulo() {
        sistemaGestao.setNome("nomeEmpresaDesenvolvedora");
        sistemaGestao.setEmpresaDesenvolvedora(empresa);
        sistemaGestao.setArquivosExecutaveis(null);
        sistemaGestao.toString();
    }

    @Test
    public void testNomeValido() {
        sistemaGestao.setNome(NOME);
        assertEquals(NOME, sistemaGestao.getNome());
    }

    @Test
    public void testEmpresaValido() {
        sistemaGestao.setEmpresaDesenvolvedora(empresa);
        assertEquals(empresa, sistemaGestao.getEmpresaDesenvolvedora());
    }

    @Test
    public void testArquivosValido() {
        sistemaGestao.setArquivosExecutaveis(arquivosExe);
        assertEquals(arquivosExe, sistemaGestao.getArquivosExecutaveis());
    }
}
