package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author hiago
 */
public class SistemaGestaoTest {

    private static final String NOME = "dfkjdsfjkds";
    private static final EmpresaDesenvolvedora empresa = new EmpresaDesenvolvedora();
    private static final ArquivosExecutaveis arquivosExe = new ArquivosExecutaveis();
    private static final ArquivoExecutavel arquivoExe = new ArquivoExecutavel();
    private static final RequisitosExecutados requisitosExecutados = new RequisitosExecutados();
    private final SistemaGestao sistemaGestao = new SistemaGestao();

    @Before
    public void setUp() {
        empresa.setCnpj("01.342.657.234524/0001");
        empresa.setRazaoSocial("Razao Social Ltda.");
        arquivoExe.setMd5("fajbeifbaieufheaufebaiu");
        arquivoExe.setNome("nomeArquivoExe");
        requisitosExecutados.setRequisitoExecutado("S");
        arquivosExe.setArquivoExecutavel(arquivoExe);

    }

    @Test(expected = IllegalStateException.class)
    public void testNomeNuloInvalido() {
        sistemaGestao.setEmpresaDesenvolvedora(empresa);
        sistemaGestao.setArquivosExecutaveis(arquivosExe);
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

    @Test(expected = IllegalStateException.class)
    public void testEmpresaNuloInvalido() {
        sistemaGestao.setNome("nomeEmpresaDesenvolvedora");
        sistemaGestao.setArquivosExecutaveis(arquivosExe);
        sistemaGestao.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testArquivosExeNuloInvalido() {
        sistemaGestao.setNome("nomeEmpresaDesenvolvedora");
        sistemaGestao.setEmpresaDesenvolvedora(empresa);
        sistemaGestao.toString();
    }
}
