package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author hiago
 */
public class SistemasPedTest {

    private static final String NOME = "dfkjdsfjkds";
    private static final SistemasPed sistemasPed = new SistemasPed();
    private static final EmpresaDesenvolvedora empresa = new EmpresaDesenvolvedora();
    private static final ArquivosExecutaveis arquivosExe = new ArquivosExecutaveis();
    private static final ArquivoExecutavel arquivoExe = new ArquivoExecutavel();
    private static final RequisitosExecutados requisitosExecutados = new RequisitosExecutados();
    private static final SistemaPed sistemaPed = new SistemaPed();

    @Before
    public void setUp() {
        sistemasPed.setSistemaPed(sistemaPed);
        empresa.setCnpj("01.342.657.234524/0001");
        empresa.setRazaoSocial("Razao Social Ltda.");
        arquivoExe.setMd5("fajbeifbaieufheaufebaiu");
        arquivoExe.setNome("nomeArquivoExe");
        arquivoExe.setRequisitosExecutados(requisitosExecutados);
        requisitosExecutados.setNome("S");
        arquivosExe.setArquivoExecutavel(arquivoExe);
    }

    @Test(expected = IllegalStateException.class)
    public void testSistemasPedNuloInvalido() {
        sistemasPed.toString();
    }

    @Test
    public void testSistemaValido() {
        sistemasPed.setSistemaPed(sistemaPed);
        assertEquals(sistemaPed, sistemasPed.getSistemaPed());
    }
}
