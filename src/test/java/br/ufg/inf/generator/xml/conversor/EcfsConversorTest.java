package br.ufg.inf.generator.xml.conversor;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import br.ufg.inf.generator.xml.estrutura.comum.MarcasModelosCompativeis;

public class EcfsConversorTest {

    private static final String ARQUIVO_ECF = "ecfs.xml";
    private static final String ARQUIVO_ECF_INVALIDO = "ecfs-invalido.xml";
    private static final String UTF8 = "UTF-8";

    private static File fileECF;
    private static File fileECFInvalido;

    @Before
    public void init() throws Exception {
        URL url = Thread.currentThread().getContextClassLoader().getResource(ARQUIVO_ECF);
        fileECF = new File(url.toURI());

        URL urlInvalido = Thread.currentThread().getContextClassLoader().getResource(ARQUIVO_ECF_INVALIDO);
        fileECFInvalido = new File(urlInvalido.toURI());
    }

    @Test
    public void testParserEcfsStringEmObjeto() throws Exception {
        String conteudoECFs = FileUtils.readFileToString(fileECF, UTF8);
        MarcasModelosCompativeis ecfs = new EcfsConversor().ecfsParaObjeto(conteudoECFs);
        assertEquals("BEMATECH", ecfs.getMarcasModelos().get(0).getMarca());
        assertEquals("ECF-IF MP 2000 TH FI", ecfs.getMarcasModelos().get(0).getModelo());
        assertEquals("BEMATECH", ecfs.getMarcasModelos().get(1).getMarca());
        assertEquals("MP-2100 TH FI", ecfs.getMarcasModelos().get(1).getModelo());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParserEcfsStringInvalido() throws IOException {
        String conteudoECFs = FileUtils.readFileToString(fileECFInvalido, UTF8);
        MarcasModelosCompativeis ecfs = new EcfsConversor().ecfsParaObjeto(conteudoECFs);
        System.out.println(ecfs.toString());
    }

    @Test
    public void testParserEcfsFileEmObjeto() throws Exception {
        MarcasModelosCompativeis ecfs = new EcfsConversor().ecfsParaObjeto(fileECF);
        assertEquals("BEMATECH", ecfs.getMarcasModelos().get(0).getMarca());
        assertEquals("ECF-IF MP 2000 TH FI", ecfs.getMarcasModelos().get(0).getModelo());
        assertEquals("BEMATECH", ecfs.getMarcasModelos().get(1).getMarca());
        assertEquals("MP-2100 TH FI", ecfs.getMarcasModelos().get(1).getModelo());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParserEcfsFileInvalido() {
        new EcfsConversor().ecfsParaObjeto(fileECFInvalido);
    }

}
