package br.ufg.inf.generator.xml.estrutura.mensagem;

import br.ufg.inf.generator.xml.estrutura.identificacaopaf.PerfilRequisito;
import br.ufg.inf.generator.xml.estrutura.identificacaopaf.EnvelopeSeguranca;
import br.ufg.inf.generator.xml.estrutura.mensagem.IdentificacaoPaf;
import br.ufg.inf.generator.xml.md5.ArquivoRelacaoExecutaveis;
import br.ufg.inf.generator.xml.md5.ArquivoOutro;
import br.ufg.inf.generator.xml.md5.ArquivoExecutavelPrincipal;
import br.ufg.inf.generator.xml.md5.ArquivoExecutavel;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class IdentificacaoPafTest {

    private static String NOMECOMERCIAL;
    private static String VERSAO;
    private static ArquivoExecutavelPrincipal ARQUIVOEXECUTAVELPRINCIPAL;
    private static ArquivoRelacaoExecutaveis ARQUIVORELACAOEXECUTAVEIS;
    private static List<ArquivoExecutavel> ARQUIVOSEXECUTAVEIS;
    private static List<ArquivoOutro> ARQUIVOSOUTROS;
    private static EnvelopeSeguranca ENVELOPESEGURANCA;
    private static List<PerfilRequisito> PERFISREQUISITOS;

    @Before
    public void beforeMethod() {
        NOMECOMERCIAL = "PAF-ECF";

        VERSAO = "1.0";

        ARQUIVOEXECUTAVELPRINCIPAL = new ArquivoExecutavelPrincipal();
        ARQUIVOEXECUTAVELPRINCIPAL.setNome("Venda.exe");
        ARQUIVOEXECUTAVELPRINCIPAL.setMd5("a1207371072bb6436b29110542a419d5");

        ARQUIVORELACAOEXECUTAVEIS = new ArquivoRelacaoExecutaveis();
        ARQUIVORELACAOEXECUTAVEIS.setNome("Lista.TXT");
        ARQUIVORELACAOEXECUTAVEIS.setMd5("91207371072bb6436b29110542a41927");

        ARQUIVOSEXECUTAVEIS = new ArrayList<>();
        ArquivoExecutavel arquivoExecutavel = new ArquivoExecutavel();
        arquivoExecutavel.setNome("Nome.dll");
        arquivoExecutavel.setMd5("01207371072bb6436b29110542a41927");
        ARQUIVOSEXECUTAVEIS.add(arquivoExecutavel);

        ARQUIVOSOUTROS = new ArrayList<>();
        ArquivoOutro arquivoOutro = new ArquivoOutro();
        arquivoOutro.setNome("Relacao.txt");
        arquivoOutro.setMd5("aaa07371072bb6436b29110542a41927");
        ARQUIVOSOUTROS.add(arquivoOutro);

        ENVELOPESEGURANCA = new EnvelopeSeguranca();
        ENVELOPESEGURANCA.setMarca("Marca");
        ENVELOPESEGURANCA.setModelo("Modelo");
        ENVELOPESEGURANCA.setNumero("123456");

        PerfilRequisito perfil = new PerfilRequisito();
        perfil.setPerfil("V");
        PERFISREQUISITOS = new ArrayList<>();
        PERFISREQUISITOS.add(perfil);
    }

    @Test
    public void testNomeComercialValido() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setNomeComercial(NOMECOMERCIAL);
        String result = instance.getNomeComercial();
        assertEquals(NOMECOMERCIAL, result);
    }

    @Test
    public void testVersaoValida() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setVersao(VERSAO);
        String result = instance.getVersao();
        assertEquals(VERSAO, result);
    }

    @Test
    public void testArquivoExecutavelPrincipalValido() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setArquivoExecutavelPrincipal(ARQUIVOEXECUTAVELPRINCIPAL);
        ArquivoExecutavelPrincipal result = instance.getArquivoExecutavelPrincipal();
        assertEquals(ARQUIVOEXECUTAVELPRINCIPAL, result);
    }

    @Test
    public void testArquivoRelacaoExecutaveisValido() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setArquivoRelacaoExecutaveis(ARQUIVORELACAOEXECUTAVEIS);
        ArquivoRelacaoExecutaveis result = instance.getArquivoRelacaoExecutaveis();
        assertEquals(ARQUIVORELACAOEXECUTAVEIS, result);
    }

    @Test
    public void testArquivosExecutaveisValido() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setArquivosExecutaveis(ARQUIVOSEXECUTAVEIS);
        List<ArquivoExecutavel> result = instance.getArquivosExecutaveis();
        assertEquals(ARQUIVOSEXECUTAVEIS, result);
    }

    @Test
    public void testArquivosOutrosValido() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setArquivosOutros(ARQUIVOSOUTROS);
        List<ArquivoOutro> result = instance.getArquivosOutros();
        assertEquals(ARQUIVOSOUTROS, result);
    }

    @Test
    public void testEnvelopeSegurancaValido() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setEnvelopeSeguranca(ENVELOPESEGURANCA);
        EnvelopeSeguranca result = instance.getEnvelopeSeguranca();
        assertEquals(ENVELOPESEGURANCA, result);
    }

    @Test
    public void testPerfisRequisitoValido() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setPerfisRequisito(PERFISREQUISITOS);
        List<PerfilRequisito> result = instance.getPerfisRequisito();
        assertEquals(PERFISREQUISITOS, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testNomeComercialNulo() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setNomeComercial(null);
        instance.setVersao(VERSAO);
        instance.setArquivoExecutavelPrincipal(ARQUIVOEXECUTAVELPRINCIPAL);
        instance.setArquivoRelacaoExecutaveis(ARQUIVORELACAOEXECUTAVEIS);
        instance.setArquivosOutros(ARQUIVOSOUTROS);
        instance.setEnvelopeSeguranca(ENVELOPESEGURANCA);
        instance.setPerfisRequisito(PERFISREQUISITOS);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testVersaoNulo() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setNomeComercial(NOMECOMERCIAL);
        instance.setVersao(null);
        instance.setArquivoExecutavelPrincipal(ARQUIVOEXECUTAVELPRINCIPAL);
        instance.setArquivoRelacaoExecutaveis(ARQUIVORELACAOEXECUTAVEIS);
        instance.setArquivosOutros(ARQUIVOSOUTROS);
        instance.setEnvelopeSeguranca(ENVELOPESEGURANCA);
        instance.setPerfisRequisito(PERFISREQUISITOS);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testArquivoExecutavelPrincipalNulo() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setNomeComercial(NOMECOMERCIAL);
        instance.setVersao(VERSAO);
        instance.setArquivoExecutavelPrincipal(null);
        instance.setArquivoRelacaoExecutaveis(ARQUIVORELACAOEXECUTAVEIS);
        instance.setArquivosOutros(ARQUIVOSOUTROS);
        instance.setEnvelopeSeguranca(ENVELOPESEGURANCA);
        instance.setPerfisRequisito(PERFISREQUISITOS);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testArquivoRelacaoExecutaveisNulo() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setNomeComercial(NOMECOMERCIAL);
        instance.setVersao(VERSAO);
        instance.setArquivoExecutavelPrincipal(ARQUIVOEXECUTAVELPRINCIPAL);
        instance.setArquivoRelacaoExecutaveis(null);
        instance.setArquivosOutros(ARQUIVOSOUTROS);
        instance.setEnvelopeSeguranca(ENVELOPESEGURANCA);
        instance.setPerfisRequisito(PERFISREQUISITOS);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testArquivoOutrosNulo() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setNomeComercial(NOMECOMERCIAL);
        instance.setVersao(VERSAO);
        instance.setArquivoExecutavelPrincipal(ARQUIVOEXECUTAVELPRINCIPAL);
        instance.setArquivoRelacaoExecutaveis(ARQUIVORELACAOEXECUTAVEIS);
        instance.setArquivosOutros(null);
        instance.setEnvelopeSeguranca(ENVELOPESEGURANCA);
        instance.setPerfisRequisito(PERFISREQUISITOS);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testEnvelopeSegurancaNulo() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setNomeComercial(NOMECOMERCIAL);
        instance.setVersao(VERSAO);
        instance.setArquivoExecutavelPrincipal(ARQUIVOEXECUTAVELPRINCIPAL);
        instance.setArquivoRelacaoExecutaveis(ARQUIVORELACAOEXECUTAVEIS);
        instance.setArquivosOutros(ARQUIVOSOUTROS);
        instance.setEnvelopeSeguranca(null);
        instance.setPerfisRequisito(PERFISREQUISITOS);
        instance.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void testPerfilRequisitoNulo() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setNomeComercial(NOMECOMERCIAL);
        instance.setVersao(VERSAO);
        instance.setArquivoExecutavelPrincipal(ARQUIVOEXECUTAVELPRINCIPAL);
        instance.setArquivoRelacaoExecutaveis(ARQUIVORELACAOEXECUTAVEIS);
        instance.setArquivosOutros(ARQUIVOSOUTROS);
        instance.setEnvelopeSeguranca(ENVELOPESEGURANCA);
        instance.setPerfisRequisito(null);
        instance.toString();
    }
}
