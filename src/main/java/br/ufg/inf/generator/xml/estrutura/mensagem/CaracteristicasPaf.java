package br.ufg.inf.generator.xml.estrutura.mensagem;

import br.ufg.inf.generator.xml.estrutura.caracteristicaspaf.AplicacaoEspecial;
import br.ufg.inf.generator.xml.estrutura.LaudoBase;
import br.ufg.inf.generator.xml.estrutura.caracteristicaspaf.Modo;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

public class CaracteristicasPaf extends LaudoBase {

    @Element(name = "LinguagemProgramacao", required = true)
    private String linguagemProgramacao;

    @Element(name = "SistemaOperacional", required = true)
    private String sistemaOperacional;

    @ElementList(entry = "GerenciadorBancoDados", required = true, inline = true)
    private List<String> gerenciadorBancoDados;

    @Element(name = "TipoDesenvolvimento", required = true)
    private String tipoDesenvolvimento;

    @Element(name = "TipoFuncionamento", required = true)
    private String tipoFuncionamento;

    @ElementList(name = "MeioGeracaoArquivoSintegraEfd", required = true)
    private List<Modo> meioGeracaoArquivoStintegraEfd;

    @Element(name = "IntegracaoPaf", required = true)
    private String integracaoPaf;

    @ElementList(name = "FormaImpressao", required = true)
    private List<Modo> formaImpressao;

    @ElementList(name = "TratamentoInterrupcao", required = true)
    private List<Modo> tratamentoInterrupcao;

    @ElementList(name = "AplicacoesEspeciais", required = true)
    private List<AplicacaoEspecial> aplicacoesEspeciais;

    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public List<String> getGerenciadorBancoDados() {
        return gerenciadorBancoDados;
    }

    public void setGerenciadorBancoDados(List<String> gerenciadorBancoDados) {
        this.gerenciadorBancoDados = gerenciadorBancoDados;
    }

    public String getTipoDesenvolvimento() {
        return tipoDesenvolvimento;
    }

    public void setTipoDesenvolvimento(String tipoDesenvolvimento) {
        this.tipoDesenvolvimento = tipoDesenvolvimento;
    }

    public String getTipoFuncionamento() {
        return tipoFuncionamento;
    }

    public void setTipoFuncionamento(String tipoFuncionamento) {
        this.tipoFuncionamento = tipoFuncionamento;
    }

    public List<Modo> getMeioGeracaoArquivoStintegraEfd() {
        return meioGeracaoArquivoStintegraEfd;
    }

    public void setMeioGeracaoArquivoStintegraEfd(List<Modo> meioGeracaoArquivoStintegraEfd) {
        this.meioGeracaoArquivoStintegraEfd = meioGeracaoArquivoStintegraEfd;
    }

    public String getIntegracaoPaf() {
        return integracaoPaf;
    }

    public void setIntegracaoPaf(String integracaoPaf) {
        this.integracaoPaf = integracaoPaf;
    }

    public List<Modo> getFormaImpressao() {
        return formaImpressao;
    }

    public void setFormaImpressao(List<Modo> formaImpressao) {
        this.formaImpressao = formaImpressao;
    }

    public List<Modo> getTratamentoInterrupcao() {
        return tratamentoInterrupcao;
    }

    public void setTratamentoInterrupcao(List<Modo> tratamentoInterrupcao) {
        this.tratamentoInterrupcao = tratamentoInterrupcao;
    }

    public List<AplicacaoEspecial> getAplicacoesEspeciais() {
        return aplicacoesEspeciais;
    }

    public void setAplicacoesEspeciais(List<AplicacaoEspecial> aplicacoesEspeciais) {
        this.aplicacoesEspeciais = aplicacoesEspeciais;
    }

}
