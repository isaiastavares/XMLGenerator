package br.ufg.inf.generator.xml;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author hiago
 */
public class SistemasGestaoTest {

    private static final String NOME = "dfkjdsfjkds";
    private static final SistemasGestao sistemasGestao = new SistemasGestao();
    private static final EmpresaDesenvolvedora empresa = new EmpresaDesenvolvedora();
    private static final ArquivosExecutaveis arquivosExe = new ArquivosExecutaveis();
    private static final ArquivoExecutavel arquivoExe = new ArquivoExecutavel();
    private static final RequisitosExecutados requisitosExecutados = new RequisitosExecutados();
    private final SistemaGestao sistemaGestao = new SistemaGestao();

    @Before
    public void setUp() {
        sistemaGestao.setNome(NOME);
        empresa.setCnpj("01.342.657.234524/0001");
        empresa.setRazaoSocial("Razao Social Ltda.");
        arquivoExe.setMd5("fajbeifbaieufheaufebaiu");
        arquivoExe.setNome("nomeArquivoExe");
        requisitosExecutados.setNome("S");
        arquivosExe.setArquivoExecutavel(arquivoExe);
    }

    @Test(expected = IllegalStateException.class)
    public void testSistemasGestaoNuloInvalido() {
        sistemasGestao.toString();
    }

    @Test
    public void testSistemasGestaoValido() {
        sistemasGestao.setSistemaGestao(sistemaGestao);
        assertEquals(sistemaGestao, sistemasGestao.getSistemaGestao());
    }
}
