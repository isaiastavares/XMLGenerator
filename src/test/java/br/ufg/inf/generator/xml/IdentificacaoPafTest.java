/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.generator.xml;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Kalyn
 */
public class IdentificacaoPafTest {
    private String NOMECOMERCIAL;
    private String VERSAO;
    private ArquivoExecutavelPrincipal ARQUIVOEXECUTAVELPRINCIPAL;
    private ArquivoRelacaoExecutaveis ARQUIVORELACAOEXECUTAVEIS;
    private ArrayList<ArquivoExecutavel> ARQUIVOSEXECUTAVEIS;
    private ArrayList<ArquivoOutro> ARQUIVOSOUTROS;
    private EnvelopeSeguranca ENVELOPESEGURANCA;
    private PerfisRequisito PERFISREQUISITOS;
    
    @Before
    public void beforeMethod(){
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
        
        PERFISREQUISITOS = new PerfisRequisito();
        PERFISREQUISITOS.setPerfilRequisito("A");
        
    }
    @Test
    public void testGetSetNomeComercial() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setNomeComercial(NOMECOMERCIAL);
        String result = instance.getNomeComercial();
        assertEquals(NOMECOMERCIAL, result);
    }

    @Test
    public void testGetSetVersao() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setVersao(VERSAO);
        String result = instance.getVersao();
        assertEquals(VERSAO, result);
    }


    @Test
    public void testGetSetArquivoExecutavelPrincipal() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setArquivoExecutavelPrincipal(ARQUIVOEXECUTAVELPRINCIPAL);
        ArquivoExecutavelPrincipal result = instance.getArquivoExecutavelPrincipal();
        assertEquals(ARQUIVOEXECUTAVELPRINCIPAL, result);
    }
    
    @Test
    public void testGetSetArquivoRelacaoExecutaveis() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setArquivoRelacaoExevutaveis(ARQUIVORELACAOEXECUTAVEIS);
        ArquivoExecutavelPrincipal result = instance.getArquivoExecutavelPrincipal();
        assertEquals(ARQUIVORELACAOEXECUTAVEIS, result);
    }

    @Test
    public void testGetSetArquivosExecutaveis() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setArquivosExecutaveis(ARQUIVOSEXECUTAVEIS);
        ArrayList<ArquivoExecutavel> result = instance.getArquivosExecutaveis();
        assertEquals(ARQUIVOSEXECUTAVEIS, result);
    }

    @Test
    public void testGetSetArquivosOutros() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setArquivosOutros(ARQUIVOSOUTROS);
        ArrayList<ArquivoOutro> result = instance.getArquivosOutros();
        assertEquals(ARQUIVOSOUTROS, result);
    }

    @Test
    public void testGetSetEnvelopeSeguranca() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setEnvelopeSeguranca(ENVELOPESEGURANCA);
        EnvelopeSeguranca result = instance.getEnvelopeSeguranca();
        assertEquals(ENVELOPESEGURANCA, result);
    }

    @Test
    public void testGetSetPerfisRequisito() {
        IdentificacaoPaf instance = new IdentificacaoPaf();
        instance.setPerfisRequisito(PERFISREQUISITOS);
        PerfisRequisito result = instance.getPerfisRequisito();
        assertEquals(PERFISREQUISITOS, result);
    }

}
