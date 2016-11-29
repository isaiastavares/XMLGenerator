package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author hiago
 */
public class SistemaPedTest {

    private static final String NOME = "dfkjdsfjkds";
    private static final EmpresaDesenvolvedora empresa = new EmpresaDesenvolvedora();
    private static final ArquivosExecutaveis arquivosExe = new ArquivosExecutaveis();
    private static final ArquivoExecutavel arquivoExe = new ArquivoExecutavel();
    private static final RequisitosExecutados requisitosExecutados = new RequisitosExecutados();
    private final SistemaPed sistemaPed = new SistemaPed();

    @Before
    public void setUp() {
        empresa.setCnpj("01.342.657.234524/0001");
        empresa.setRazaoSocial("Razao Social Ltda.");
        arquivoExe.setMd5("fajbeifbaieufheaufebaiu");
        arquivoExe.setNome("nomeArquivoExe");
        requisitosExecutados.setNome("S");
        arquivosExe.setArquivoExecutavel(arquivoExe);
    }

    @Test(expected = IllegalStateException.class)
    public void testNomeNuloInvalido() {
        sistemaPed.setEmpresaDesenvolvedora(empresa);
        sistemaPed.setArquivosExecutaveis(arquivosExe);
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

    @Test(expected = IllegalStateException.class)
    public void testEmpresaNuloInvalido() {
        sistemaPed.setNome("nomeEmpresaDesenvolvedora");
        sistemaPed.setArquivosExecutaveis(arquivosExe);
        sistemaPed.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testArquivosExeNuloInvalido() {
        sistemaPed.setNome("nomeEmpresaDesenvolvedora");
        sistemaPed.setEmpresaDesenvolvedora(empresa);
        sistemaPed.toString();
    }
}
