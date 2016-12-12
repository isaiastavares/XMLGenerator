package br.ufg.inf.generator.xml.estrutura;

import br.ufg.inf.generator.xml.estrutura.mensagem.TestadorAprovacaoRelatorio;
import br.ufg.inf.generator.xml.estrutura.mensagem.TestadorExecucaoTestes;
import br.ufg.inf.generator.xml.estrutura.mensagem.NaoConformidade;
import br.ufg.inf.generator.xml.estrutura.mensagem.Emissao;
import br.ufg.inf.generator.xml.estrutura.mensagem.RoteiroAnalise;
import br.ufg.inf.generator.xml.estrutura.sistemasgestao.Sistemas;
import br.ufg.inf.generator.xml.estrutura.mensagem.CaracteristicasPaf;
import br.ufg.inf.generator.xml.estrutura.mensagem.IdentificacaoPaf;
import br.ufg.inf.generator.xml.estrutura.mensagem.Otc;
import br.ufg.inf.generator.xml.estrutura.mensagem.Desenvolvedora;
import br.ufg.inf.generator.xml.estrutura.comum.MarcasModelosCompativeis;
import br.ufg.inf.generator.xml.estrutura.comum.MarcaModelo;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class MensagemTest {

    private static final String NUMERO = "01";
    private static final Boolean EMITE_NFE = true;
    private static final Desenvolvedora DESENVOLVEDORA = new Desenvolvedora();
    private static final Otc OTC = new Otc();
    private static final IdentificacaoPaf IDENTIFICACAO_PAF = new IdentificacaoPaf();
    private static final CaracteristicasPaf CARACTERISTICAS_PAF = new CaracteristicasPaf();
    private static final ArrayList<Sistemas> SISTEMA_GESTAO = new ArrayList<>();
    private static final ArrayList<Sistemas> SISTEMAS_PED = new ArrayList<>();
    private static final ArrayList<Sistemas> SISTEMAS_PED_NFE = new ArrayList<>();
    private static final ArrayList<MarcaModelo> ECF_ANALISE_FUNCIONAL = new ArrayList<>();
    private static final MarcasModelosCompativeis MARCAS_MODELOS_COMPATIVEIS = new MarcasModelosCompativeis();
    private static final String VERSAO_ER_PAF = "teste";
    private static final RoteiroAnalise ROTEIRO_ANALISE = new RoteiroAnalise();
    private static final ArrayList<NaoConformidade> NAO_CONFORMIDADES = new ArrayList<>();
    private static final String COMENTARIO_OTC = "teste";
    private static final String DECLARACAO = "teste";
    private static final Emissao EMISSAO = new Emissao();
    private static final TestadorExecucaoTestes EXECUCAO_TESTES = new TestadorExecucaoTestes();
    private static final TestadorAprovacaoRelatorio APROVACAO_RELATORIO = new TestadorAprovacaoRelatorio();

    @Test
    public void testNumeroValido() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        String resultado = NUMERO;
        Assert.assertEquals(resultado, msg.getNumero());
    }

    @Test
    public void testEmiteNFeValido() {
        final Mensagem msg = new Mensagem();
        msg.setEmiteNFe(EMITE_NFE);
        Boolean resultado = EMITE_NFE;
        Assert.assertEquals(resultado, msg.getEmiteNFe());
    }

    @Test
    public void testVersaoErPafValido() {
        final Mensagem msg = new Mensagem();
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        String resultado = VERSAO_ER_PAF;
        Assert.assertEquals(resultado, msg.getVersaoErPaf());
    }

    @Test
    public void testComentarioOtcValido() {
        final Mensagem msg = new Mensagem();
        msg.setComentarioOtc(COMENTARIO_OTC);
        String resultado = COMENTARIO_OTC;
        Assert.assertEquals(resultado, msg.getComentarioOtc());
    }

    @Test
    public void testDeclaracaoValido() {
        final Mensagem msg = new Mensagem();
        msg.setDeclaracao(DECLARACAO);
        String resultado = DECLARACAO;
        Assert.assertEquals(resultado, msg.getDeclaracao());
    }

    @Test(expected = IllegalStateException.class)
    public void testNumeroNulo() {
        final Mensagem msg = new Mensagem();
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testEmiteNFeNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testOtcNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testDesenvolvedoraNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testVersaoErPafNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testIdentificacaoPafNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testCaracteristicasPafNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testSistemasGestaoNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testSistemasPedNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testSistemasPedNfeNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testEcfAnaliseFuncionalNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testMarcasModelosCompativeisNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testRoteiroAnaliseNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testNaoConformidadesNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testComentarioOtcNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testDeclaracaoNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testEmissaoNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testExecucaoTestesNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setAprovacaoRelatorio(APROVACAO_RELATORIO);
        msg.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testAprovacaoRelatorioNulo() {
        final Mensagem msg = new Mensagem();
        msg.setNumero(NUMERO);
        msg.setEmiteNFe(EMITE_NFE);
        msg.setOtc(OTC);
        msg.setDesenvolvedora(DESENVOLVEDORA);
        msg.setVersaoErPaf(VERSAO_ER_PAF);
        msg.setIdentificacaoPaf(IDENTIFICACAO_PAF);
        msg.setCaracteristicasPaf(CARACTERISTICAS_PAF);
        msg.setSistemasGestao(SISTEMA_GESTAO);
        msg.setSistemasPed(SISTEMAS_PED);
        msg.setSistemasPedNfe(SISTEMAS_PED_NFE);
        msg.setEcfAnaliseFuncional(ECF_ANALISE_FUNCIONAL);
        msg.setMarcasModelosCompativeis(MARCAS_MODELOS_COMPATIVEIS);
        msg.setRoteiroAnalise(ROTEIRO_ANALISE);
        msg.setNaoConformidades(NAO_CONFORMIDADES);
        msg.setComentarioOtc(COMENTARIO_OTC);
        msg.setDeclaracao(DECLARACAO);
        msg.setEmissao(EMISSAO);
        msg.setExecucaoTestes(EXECUCAO_TESTES);
        msg.toString();
    }

}
