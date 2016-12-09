package br.ufg.inf.generator.xml;

import br.ufg.inf.generator.xml.estrutura.mensagem.CaracteristicasPaf;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class CaracteristicasPafTest {
    
    CaracteristicasPaf carac = new CaracteristicasPaf();

    /**
     * Test of getLinguagemProgramacao method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetLinguagemProgramacao() {
        carac.setLinguagemProgramacao("Java");
        assertEquals("java", carac.getLinguagemProgramacao());
    }

    /**
     * Test of setLinguagemProgramacao method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetLinguagemProgramacao() {
        System.out.println("setLinguagemProgramacao");
        String linguagemProgramacao = "";
        CaracteristicasPaf instance = new CaracteristicasPaf();
        instance.setLinguagemProgramacao(linguagemProgramacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSistemaOperacional method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetSistemaOperacional() {
        System.out.println("getSistemaOperacional");
        CaracteristicasPaf instance = new CaracteristicasPaf();
        String expResult = "";
        String result = instance.getSistemaOperacional();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSistemaOperacional method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetSistemaOperacional() {
        System.out.println("setSistemaOperacional");
        String sistemaOperacional = "";
        CaracteristicasPaf instance = new CaracteristicasPaf();
        instance.setSistemaOperacional(sistemaOperacional);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGerenciadorBancoDados method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetGerenciadorBancoDados() {
        System.out.println("getGerenciadorBancoDados");
        CaracteristicasPaf instance = new CaracteristicasPaf();
        List<String> expResult = null;
        List<String> result = instance.getGerenciadorBancoDados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGerenciadorBancoDados method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetGerenciadorBancoDados() {
        System.out.println("setGerenciadorBancoDados");
        List<String> gerenciadorBancoDados = null;
        CaracteristicasPaf instance = new CaracteristicasPaf();
        instance.setGerenciadorBancoDados(gerenciadorBancoDados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoDesenvolvimento method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetTipoDesenvolvimento() {
        System.out.println("getTipoDesenvolvimento");
        CaracteristicasPaf instance = new CaracteristicasPaf();
        String expResult = "";
        String result = instance.getTipoDesenvolvimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoDesenvolvimento method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetTipoDesenvolvimento() {
        System.out.println("setTipoDesenvolvimento");
        String tipoDesenvolvimento = "";
        CaracteristicasPaf instance = new CaracteristicasPaf();
        instance.setTipoDesenvolvimento(tipoDesenvolvimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoFuncionamento method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetTipoFuncionamento() {
        System.out.println("getTipoFuncionamento");
        CaracteristicasPaf instance = new CaracteristicasPaf();
        String expResult = "";
        String result = instance.getTipoFuncionamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoFuncionamento method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetTipoFuncionamento() {
        System.out.println("setTipoFuncionamento");
        String tipoFuncionamento = "";
        CaracteristicasPaf instance = new CaracteristicasPaf();
        instance.setTipoFuncionamento(tipoFuncionamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeioGeracaoArquivoStintegraEfd method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetMeioGeracaoArquivoStintegraEfd() {
        System.out.println("getMeioGeracaoArquivoStintegraEfd");
        CaracteristicasPaf instance = new CaracteristicasPaf();
        ArrayList<Modo> expResult = null;
        ArrayList<Modo> result = instance.getMeioGeracaoArquivoStintegraEfd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeioGeracaoArquivoStintegraEfd method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetMeioGeracaoArquivoStintegraEfd() {
        System.out.println("setMeioGeracaoArquivoStintegraEfd");
        ArrayList<Modo> meioGeracaoArquivoStintegraEfd = null;
        CaracteristicasPaf instance = new CaracteristicasPaf();
        instance.setMeioGeracaoArquivoStintegraEfd(meioGeracaoArquivoStintegraEfd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntegracaoPaf method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetIntegracaoPaf() {
        System.out.println("getIntegracaoPaf");
        CaracteristicasPaf instance = new CaracteristicasPaf();
        String expResult = "";
        String result = instance.getIntegracaoPaf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntegracaoPaf method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetIntegracaoPaf() {
        System.out.println("setIntegracaoPaf");
        String integracaoPaf = "";
        CaracteristicasPaf instance = new CaracteristicasPaf();
        instance.setIntegracaoPaf(integracaoPaf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormaImpressao method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetFormaImpressao() {
        System.out.println("getFormaImpressao");
        CaracteristicasPaf instance = new CaracteristicasPaf();
        ArrayList<Modo> expResult = null;
        ArrayList<Modo> result = instance.getFormaImpressao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormaImpressao method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetFormaImpressao() {
        System.out.println("setFormaImpressao");
        ArrayList<Modo> formaImpressao = null;
        CaracteristicasPaf instance = new CaracteristicasPaf();
        instance.setFormaImpressao(formaImpressao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTratamentoInterrupcao method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetTratamentoInterrupcao() {
        System.out.println("getTratamentoInterrupcao");
        CaracteristicasPaf instance = new CaracteristicasPaf();
        ArrayList<Modo> expResult = null;
        ArrayList<Modo> result = instance.getTratamentoInterrupcao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTratamentoInterrupcao method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetTratamentoInterrupcao() {
        System.out.println("setTratamentoInterrupcao");
        ArrayList<Modo> tratamentoInterrupcao = null;
        CaracteristicasPaf instance = new CaracteristicasPaf();
        instance.setTratamentoInterrupcao(tratamentoInterrupcao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAplicacoesEspeciais method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetAplicacoesEspeciais() {
        System.out.println("getAplicacoesEspeciais");
        CaracteristicasPaf instance = new CaracteristicasPaf();
        ArrayList<AplicacaoEspecial> expResult = null;
        ArrayList<AplicacaoEspecial> result = instance.getAplicacoesEspeciais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAplicacoesEspeciais method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetAplicacoesEspeciais() {
        System.out.println("setAplicacoesEspeciais");
        ArrayList<AplicacaoEspecial> aplicacoesEspeciais = null;
        CaracteristicasPaf instance = new CaracteristicasPaf();
        instance.setAplicacoesEspeciais(aplicacoesEspeciais);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
