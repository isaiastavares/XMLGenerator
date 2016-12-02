package br.ufg.inf.generator.xml;

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

	@Element(name = "MeioGeracaoArquivoSintegraEfd", required = true)
    private MeioGeracaoArquivoSintegraEfd meioGeracaoArquivoSintegraEfd;

	@Element(name = "TratamentoInterrupcao", required = true)
    private TratamentoInterrupcao tratamentoInterrupcao;

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

	public MeioGeracaoArquivoSintegraEfd getMeioGeracaoArquivoSintegraEfd() {
		return meioGeracaoArquivoSintegraEfd;
	}

	public void setMeioGeracaoArquivoSintegraEfd(MeioGeracaoArquivoSintegraEfd meioGeracaoArquivoSintegraEfd) {
		this.meioGeracaoArquivoSintegraEfd = meioGeracaoArquivoSintegraEfd;
	}

	public TratamentoInterrupcao getTratamentoInterrupcao() {
		return tratamentoInterrupcao;
	}

	public void setTratamentoInterrupcao(TratamentoInterrupcao tratamentoInterrupcao) {
		this.tratamentoInterrupcao = tratamentoInterrupcao;
	}
}
