package br.ufg.inf.generator.xml;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class MensagemTest {

    /**
     * Test of getNumero method, of class Mensagem.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Mensagem instance = new Mensagem();
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Mensagem.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "";
        Mensagem instance = new Mensagem();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmiteNFe method, of class Mensagem.
     */
    @Test
    public void testGetEmiteNFe() {
        System.out.println("getEmiteNFe");
        Mensagem instance = new Mensagem();
        Boolean expResult = null;
        Boolean result = instance.getEmiteNFe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmiteNFe method, of class Mensagem.
     */
    @Test
    public void testSetEmiteNFe() {
        System.out.println("setEmiteNFe");
        Boolean emiteNFe = null;
        Mensagem instance = new Mensagem();
        instance.setEmiteNFe(emiteNFe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesenvolvedora method, of class Mensagem.
     */
    @Test
    public void testGetDesenvolvedora() {
        System.out.println("getDesenvolvedora");
        Mensagem instance = new Mensagem();
        Desenvolvedora expResult = null;
        Desenvolvedora result = instance.getDesenvolvedora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesenvolvedora method, of class Mensagem.
     */
    @Test
    public void testSetDesenvolvedora() {
        System.out.println("setDesenvolvedora");
        Desenvolvedora desenvolvedora = null;
        Mensagem instance = new Mensagem();
        instance.setDesenvolvedora(desenvolvedora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOtc method, of class Mensagem.
     */
    @Test
    public void testGetOtc() {
        System.out.println("getOtc");
        Mensagem instance = new Mensagem();
        Otc expResult = null;
        Otc result = instance.getOtc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOtc method, of class Mensagem.
     */
    @Test
    public void testSetOtc() {
        System.out.println("setOtc");
        Otc otc = null;
        Mensagem instance = new Mensagem();
        instance.setOtc(otc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdentificacaoPaf method, of class Mensagem.
     */
    @Test
    public void testGetIdentificacaoPaf() {
        System.out.println("getIdentificacaoPaf");
        Mensagem instance = new Mensagem();
        IdentificacaoPaf expResult = null;
        IdentificacaoPaf result = instance.getIdentificacaoPaf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdentificacaoPaf method, of class Mensagem.
     */
    @Test
    public void testSetIdentificacaoPaf() {
        System.out.println("setIdentificacaoPaf");
        IdentificacaoPaf identificacaoPaf = null;
        Mensagem instance = new Mensagem();
        instance.setIdentificacaoPaf(identificacaoPaf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCaracteristicasPaf method, of class Mensagem.
     */
    @Test
    public void testGetCaracteristicasPaf() {
        System.out.println("getCaracteristicasPaf");
        Mensagem instance = new Mensagem();
        CaracteristicasPaf expResult = null;
        CaracteristicasPaf result = instance.getCaracteristicasPaf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCaracteristicasPaf method, of class Mensagem.
     */
    @Test
    public void testSetCaracteristicasPaf() {
        System.out.println("setCaracteristicasPaf");
        CaracteristicasPaf caracteristicasPaf = null;
        Mensagem instance = new Mensagem();
        instance.setCaracteristicasPaf(caracteristicasPaf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSistemasGestao method, of class Mensagem.
     */
    @Test
    public void testGetSistemasGestao() {
        System.out.println("getSistemasGestao");
        Mensagem instance = new Mensagem();
        ArrayList<SistemaGestao> expResult = null;
        ArrayList<SistemaGestao> result = instance.getSistemasGestao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSistemasGestao method, of class Mensagem.
     */
    @Test
    public void testSetSistemasGestao() {
        System.out.println("setSistemasGestao");
        ArrayList<SistemaGestao> sistemasGestao = null;
        Mensagem instance = new Mensagem();
        instance.setSistemasGestao(sistemasGestao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSistemasPed method, of class Mensagem.
     */
    @Test
    public void testGetSistemasPed() {
        System.out.println("getSistemasPed");
        Mensagem instance = new Mensagem();
        ArrayList<SistemaPed> expResult = null;
        ArrayList<SistemaPed> result = instance.getSistemasPed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSistemasPed method, of class Mensagem.
     */
    @Test
    public void testSetSistemasPed() {
        System.out.println("setSistemasPed");
        ArrayList<SistemaPed> sistemasPed = null;
        Mensagem instance = new Mensagem();
        instance.setSistemasPed(sistemasPed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSistemasPedNfe method, of class Mensagem.
     */
    @Test
    public void testGetSistemasPedNfe() {
        System.out.println("getSistemasPedNfe");
        Mensagem instance = new Mensagem();
        ArrayList<SistemaPedNfe> expResult = null;
        ArrayList<SistemaPedNfe> result = instance.getSistemasPedNfe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSistemasPedNfe method, of class Mensagem.
     */
    @Test
    public void testSetSistemasPedNfe() {
        System.out.println("setSistemasPedNfe");
        ArrayList<SistemaPedNfe> sistemasPedNfe = null;
        Mensagem instance = new Mensagem();
        instance.setSistemasPedNfe(sistemasPedNfe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEcfAnaliseFuncional method, of class Mensagem.
     */
    @Test
    public void testGetEcfAnaliseFuncional() {
        System.out.println("getEcfAnaliseFuncional");
        Mensagem instance = new Mensagem();
        ArrayList<MarcaModelo> expResult = null;
        ArrayList<MarcaModelo> result = instance.getEcfAnaliseFuncional();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEcfAnaliseFuncional method, of class Mensagem.
     */
    @Test
    public void testSetEcfAnaliseFuncional() {
        System.out.println("setEcfAnaliseFuncional");
        ArrayList<MarcaModelo> ecfAnaliseFuncional = null;
        Mensagem instance = new Mensagem();
        instance.setEcfAnaliseFuncional(ecfAnaliseFuncional);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarcasModelosCompativeis method, of class Mensagem.
     */
    @Test
    public void testGetMarcasModelosCompativeis() {
        System.out.println("getMarcasModelosCompativeis");
        Mensagem instance = new Mensagem();
        ArrayList<MarcaModelo> expResult = null;
        ArrayList<MarcaModelo> result = instance.getMarcasModelosCompativeis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarcasModelosCompativeis method, of class Mensagem.
     */
    @Test
    public void testSetMarcasModelosCompativeis() {
        System.out.println("setMarcasModelosCompativeis");
        ArrayList<MarcaModelo> marcasModelosCompativeis = null;
        Mensagem instance = new Mensagem();
        instance.setMarcasModelosCompativeis(marcasModelosCompativeis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVersaoErPaf method, of class Mensagem.
     */
    @Test
    public void testGetVersaoErPaf() {
        System.out.println("getVersaoErPaf");
        Mensagem instance = new Mensagem();
        String expResult = "";
        String result = instance.getVersaoErPaf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVersaoErPaf method, of class Mensagem.
     */
    @Test
    public void testSetVersaoErPaf() {
        System.out.println("setVersaoErPaf");
        String versaoErPaf = "";
        Mensagem instance = new Mensagem();
        instance.setVersaoErPaf(versaoErPaf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoteiroAnalise method, of class Mensagem.
     */
    @Test
    public void testGetRoteiroAnalise() {
        System.out.println("getRoteiroAnalise");
        Mensagem instance = new Mensagem();
        RoteiroAnalise expResult = null;
        RoteiroAnalise result = instance.getRoteiroAnalise();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoteiroAnalise method, of class Mensagem.
     */
    @Test
    public void testSetRoteiroAnalise() {
        System.out.println("setRoteiroAnalise");
        RoteiroAnalise roteiroAnalise = null;
        Mensagem instance = new Mensagem();
        instance.setRoteiroAnalise(roteiroAnalise);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNaoConformidades method, of class Mensagem.
     */
    @Test
    public void testGetNaoConformidades() {
        System.out.println("getNaoConformidades");
        Mensagem instance = new Mensagem();
        ArrayList<NaoConformidade> expResult = null;
        ArrayList<NaoConformidade> result = instance.getNaoConformidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNaoConformidades method, of class Mensagem.
     */
    @Test
    public void testSetNaoConformidades() {
        System.out.println("setNaoConformidades");
        ArrayList<NaoConformidade> naoConformidades = null;
        Mensagem instance = new Mensagem();
        instance.setNaoConformidades(naoConformidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentarioOtc method, of class Mensagem.
     */
    @Test
    public void testGetComentarioOtc() {
        System.out.println("getComentarioOtc");
        Mensagem instance = new Mensagem();
        String expResult = "";
        String result = instance.getComentarioOtc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComentarioOtc method, of class Mensagem.
     */
    @Test
    public void testSetComentarioOtc() {
        System.out.println("setComentarioOtc");
        String comentarioOtc = "";
        Mensagem instance = new Mensagem();
        instance.setComentarioOtc(comentarioOtc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeclaracao method, of class Mensagem.
     */
    @Test
    public void testGetDeclaracao() {
        System.out.println("getDeclaracao");
        Mensagem instance = new Mensagem();
        String expResult = "";
        String result = instance.getDeclaracao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeclaracao method, of class Mensagem.
     */
    @Test
    public void testSetDeclaracao() {
        System.out.println("setDeclaracao");
        String declaracao = "";
        Mensagem instance = new Mensagem();
        instance.setDeclaracao(declaracao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmissao method, of class Mensagem.
     */
    @Test
    public void testGetEmissao() {
        System.out.println("getEmissao");
        Mensagem instance = new Mensagem();
        Emissao expResult = null;
        Emissao result = instance.getEmissao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmissao method, of class Mensagem.
     */
    @Test
    public void testSetEmissao() {
        System.out.println("setEmissao");
        Emissao emissao = null;
        Mensagem instance = new Mensagem();
        instance.setEmissao(emissao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExecucaoTestes method, of class Mensagem.
     */
    @Test
    public void testGetExecucaoTestes() {
        System.out.println("getExecucaoTestes");
        Mensagem instance = new Mensagem();
        ExecucaoTestes expResult = null;
        ExecucaoTestes result = instance.getExecucaoTestes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExecucaoTestes method, of class Mensagem.
     */
    @Test
    public void testSetExecucaoTestes() {
        System.out.println("setExecucaoTestes");
        ExecucaoTestes execucaoTestes = null;
        Mensagem instance = new Mensagem();
        instance.setExecucaoTestes(execucaoTestes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAprovacaoRelatorio method, of class Mensagem.
     */
    @Test
    public void testGetAprovacaoRelatorio() {
        System.out.println("getAprovacaoRelatorio");
        Mensagem instance = new Mensagem();
        AprovacaoRelatorio expResult = null;
        AprovacaoRelatorio result = instance.getAprovacaoRelatorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAprovacaoRelatorio method, of class Mensagem.
     */
    @Test
    public void testSetAprovacaoRelatorio() {
        System.out.println("setAprovacaoRelatorio");
        AprovacaoRelatorio aprovacaoRelatorio = null;
        Mensagem instance = new Mensagem();
        instance.setAprovacaoRelatorio(aprovacaoRelatorio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
