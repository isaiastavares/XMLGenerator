package br.ufg.inf.generator.xml.estrutura.mensagem;

import br.ufg.inf.generator.xml.estrutura.identificacaopaf.EnvelopeSeguranca;
import br.ufg.inf.generator.xml.estrutura.LaudoBase;
import br.ufg.inf.generator.xml.estrutura.identificacaopaf.PerfilRequisito;
import br.ufg.inf.generator.xml.md5.ArquivoOutro;
import br.ufg.inf.generator.xml.md5.ArquivoRelacaoExecutaveis;
import br.ufg.inf.generator.xml.md5.ArquivoExecutavelPrincipal;
import br.ufg.inf.generator.xml.md5.ArquivoExecutavel;
import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

public class IdentificacaoPaf extends LaudoBase {

    @Element(name = "NomeComercial", required = true)
    private String nomeComercial;

    @Element(name = "Versao", required = true)
    private String versao;

    @Element(name = "ArquivoExecutavelPrincipal", required = true)
    private ArquivoExecutavelPrincipal arquivoExecutavelPrincipal;

    @Element(name = "ArquivoRelacaoExecutaveis", required = true)
    private ArquivoRelacaoExecutaveis arquivoRelacaoExecutaveis;

    @ElementList(name = "ArquivosExecutaveis", required = true)
    private ArrayList<ArquivoExecutavel> arquivosExecutaveis;

    @ElementList(name = "ArquivosOutros", required = true)
    private ArrayList<ArquivoOutro> arquivosOutros;

    @Element(name = "EnvelopeSeguranca", required = true)
    private EnvelopeSeguranca envelopeSeguranca;

    @ElementList(name = "PerfisRequisito", required = true)
    private ArrayList<PerfilRequisito> perfisRequisito;

    public String getNomeComercial() {
        return nomeComercial;
    }

    public void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public ArquivoExecutavelPrincipal getArquivoExecutavelPrincipal() {
        return arquivoExecutavelPrincipal;
    }

    public ArquivoRelacaoExecutaveis getArquivoRelacaoExecutaveis() {
        return arquivoRelacaoExecutaveis;
    }

    public void setArquivoRelacaoExecutaveis(ArquivoRelacaoExecutaveis arquivoRelacaoExevutaveis) {
        this.arquivoRelacaoExecutaveis = arquivoRelacaoExevutaveis;
    }

    public void setArquivoExecutavelPrincipal(ArquivoExecutavelPrincipal arquivoExecutavelPrincipal) {
        this.arquivoExecutavelPrincipal = arquivoExecutavelPrincipal;
    }

    public ArrayList<ArquivoExecutavel> getArquivosExecutaveis() {
        return arquivosExecutaveis;
    }

    public void setArquivosExecutaveis(ArrayList<ArquivoExecutavel> arquivosExecutaveis) {
        this.arquivosExecutaveis = arquivosExecutaveis;
    }

    public ArrayList<ArquivoOutro> getArquivosOutros() {
        return arquivosOutros;
    }

    public void setArquivosOutros(ArrayList<ArquivoOutro> arquivosOutros) {
        this.arquivosOutros = arquivosOutros;
    }

    public EnvelopeSeguranca getEnvelopeSeguranca() {
        return envelopeSeguranca;
    }

    public void setEnvelopeSeguranca(EnvelopeSeguranca envelopeSeguranca) {
        this.envelopeSeguranca = envelopeSeguranca;
    }

    public ArrayList<PerfilRequisito> getPerfisRequisito() {
        return perfisRequisito;
    }

    public void setPerfisRequisito(ArrayList<PerfilRequisito> perfisRequisito) {
        this.perfisRequisito = perfisRequisito;
    }

}
