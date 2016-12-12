package br.ufg.inf.generator.xml.estrutura.mensagem;

import br.ufg.inf.generator.xml.estrutura.caracteristicaspaf.AplicacaoEspecial;
import br.ufg.inf.generator.xml.estrutura.caracteristicaspaf.Modo;
import br.ufg.inf.generator.xml.estrutura.mensagem.CaracteristicasPaf;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CaracteristicasPafTest {

    CaracteristicasPaf carac = new CaracteristicasPaf();

    /**
     * Test of getLinguagemProgramacao method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetLinguagemProgramacao() {
        String linguagemProgramacao = "Java";
        carac.setLinguagemProgramacao(linguagemProgramacao);
        assertEquals(linguagemProgramacao, carac.getLinguagemProgramacao());
    }

    /**
     * Test of setLinguagemProgramacao method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetLinguagemProgramacao() {
        String linguagemProgramacao = "C";
        carac.setLinguagemProgramacao(linguagemProgramacao);
        assertEquals(linguagemProgramacao, carac.getLinguagemProgramacao());
    }

    /**
     * Test of getSistemaOperacional method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetSistemaOperacional() {
        String sistemaOperacional = "Windows";
        carac.setSistemaOperacional(sistemaOperacional);
        assertEquals(sistemaOperacional, carac.getSistemaOperacional());
    }

    /**
     * Test of setSistemaOperacional method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetSistemaOperacional() {
        String sistemaOperacional = "MAC";
        carac.setSistemaOperacional(sistemaOperacional);
        assertEquals(sistemaOperacional, carac.getSistemaOperacional());
    }

    /**
     * Test of getGerenciadorBancoDados method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetGerenciadorBancoDados() {
        List<String> gerenciadorBancoDados = new ArrayList<>();
        gerenciadorBancoDados.add("teste1");
        gerenciadorBancoDados.add("teste2");
        gerenciadorBancoDados.add("teste3");
        carac.setGerenciadorBancoDados(gerenciadorBancoDados);
        assertEquals(gerenciadorBancoDados, carac.getGerenciadorBancoDados());
    }

    /**
     * Test of setGerenciadorBancoDados method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetGerenciadorBancoDados() {
        List<String> gerenciadorBancoDados = new ArrayList<>();
        gerenciadorBancoDados.add("teste3");
        gerenciadorBancoDados.add("teste2");
        gerenciadorBancoDados.add("teste1");
        carac.setGerenciadorBancoDados(gerenciadorBancoDados);
        assertEquals(gerenciadorBancoDados, carac.getGerenciadorBancoDados());
    }

    /**
     * Test of getTipoDesenvolvimento method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetTipoDesenvolvimento() {
        String tipoDesenvolvimento = "Tipo1";
        carac.setTipoDesenvolvimento(tipoDesenvolvimento);
        assertEquals(tipoDesenvolvimento, carac.getTipoDesenvolvimento());
    }

    /**
     * Test of setTipoDesenvolvimento method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetTipoDesenvolvimento() {
        String tipoDesenvolvimento = "Tipo2";
        carac.setTipoDesenvolvimento(tipoDesenvolvimento);
        assertEquals(tipoDesenvolvimento, carac.getTipoDesenvolvimento());
    }

    /**
     * Test of getTipoFuncionamento method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetTipoFuncionamento() {
        String tipoFuncionamento = "Tipo1";
        carac.setTipoFuncionamento(tipoFuncionamento);
        assertEquals(tipoFuncionamento, carac.getTipoFuncionamento());
    }

    /**
     * Test of setTipoFuncionamento method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetTipoFuncionamento() {
        String tipoFuncionamento = "Tipo2";
        carac.setTipoFuncionamento(tipoFuncionamento);
        assertEquals(tipoFuncionamento, carac.getTipoFuncionamento());
    }

    /**
     * Test of getMeioGeracaoArquivoStintegraEfd method, of class
     * CaracteristicasPaf.
     */
    @Test
    public void testGetMeioGeracaoArquivoStintegraEfd() {
        Modo modo = new Modo();
        ArrayList<Modo> listModo = new ArrayList<>();
        listModo.add(modo);
        carac.setMeioGeracaoArquivoStintegraEfd(listModo);
        assertEquals(listModo, carac.getMeioGeracaoArquivoStintegraEfd());
    }

    /**
     * Test of setMeioGeracaoArquivoStintegraEfd method, of class
     * CaracteristicasPaf.
     */
    @Test
    public void testSetMeioGeracaoArquivoStintegraEfd() {
        Modo modo = new Modo();
        ArrayList<Modo> listModo = new ArrayList<>();
        listModo.add(modo);
        carac.setMeioGeracaoArquivoStintegraEfd(listModo);
        assertEquals(listModo, carac.getMeioGeracaoArquivoStintegraEfd());
    }

    /**
     * Test of getIntegracaoPaf method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetIntegracaoPaf() {
        String integracaoPaf = "IntegraçãoPaf";
        carac.setIntegracaoPaf(integracaoPaf);
        assertEquals(integracaoPaf, carac.getIntegracaoPaf());
    }

    /**
     * Test of setIntegracaoPaf method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetIntegracaoPaf() {
        String integracaoPaf = "IntegraçãoPaf";
        carac.setIntegracaoPaf(integracaoPaf);
        assertEquals(integracaoPaf, carac.getIntegracaoPaf());
    }

    /**
     * Test of getFormaImpressao method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetFormaImpressao() {
        Modo modo = new Modo();
        ArrayList<Modo> formaImpressão = new ArrayList<>();
        formaImpressão.add(modo);
        carac.setFormaImpressao(formaImpressão);
        assertEquals(formaImpressão, carac.getFormaImpressao());
    }

    /**
     * Test of setFormaImpressao method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetFormaImpressao() {
        Modo modo = new Modo();
        ArrayList<Modo> formaImpressão = new ArrayList<>();
        formaImpressão.add(modo);
        carac.setFormaImpressao(formaImpressão);
        assertEquals(formaImpressão, carac.getFormaImpressao());
    }

    /**
     * Test of getTratamentoInterrupcao method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetTratamentoInterrupcao() {
        Modo modo = new Modo();
        ArrayList<Modo> tratamentoInterrupcao = new ArrayList<>();
        tratamentoInterrupcao.add(modo);
        carac.setTratamentoInterrupcao(tratamentoInterrupcao);
        assertEquals(tratamentoInterrupcao, carac.getTratamentoInterrupcao());
    }

    /**
     * Test of setTratamentoInterrupcao method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetTratamentoInterrupcao() {
        Modo modo = new Modo();
        ArrayList<Modo> tratamentoInterrupcao = new ArrayList<>();
        tratamentoInterrupcao.add(modo);
        carac.setTratamentoInterrupcao(tratamentoInterrupcao);
        assertEquals(tratamentoInterrupcao, carac.getTratamentoInterrupcao());
    }

    /**
     * Test of getAplicacoesEspeciais method, of class CaracteristicasPaf.
     */
    @Test
    public void testGetAplicacoesEspeciais() {
        AplicacaoEspecial aplicacaoEspecial = new AplicacaoEspecial();
        ArrayList<AplicacaoEspecial> aplicacoesEspeciais = new ArrayList<>();
        aplicacoesEspeciais.add(aplicacaoEspecial);
        carac.setAplicacoesEspeciais(aplicacoesEspeciais);
        assertEquals(aplicacoesEspeciais, carac.getAplicacoesEspeciais());
    }

    /**
     * Test of setAplicacoesEspeciais method, of class CaracteristicasPaf.
     */
    @Test
    public void testSetAplicacoesEspeciais() {
        AplicacaoEspecial aplicacaoEspecial = new AplicacaoEspecial();
        ArrayList<AplicacaoEspecial> aplicacoesEspeciais = new ArrayList<>();
        aplicacoesEspeciais.add(aplicacaoEspecial);
        carac.setAplicacoesEspeciais(aplicacoesEspeciais);
        assertEquals(aplicacoesEspeciais, carac.getAplicacoesEspeciais());
    }

}
