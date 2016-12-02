package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;

public class Mensagem extends LaudoBase {

    @Element(name = "Numero", required = true)
    private String numero;

    @Element(name = "EmiteNfe", required = true)
    private Boolean emiteNFe;

    @Element(name = "Desenvolvedora", required = true)
    private Desenvolvedora desenvolvedora;

    @Element(name = "Otc", required = true)
    private Otc otc;

    @Element(name = "VersaoErPaf", required = true)
    private String versaoErPaf;

    @Element(name = "ComentarioOtc", required = true)
    private String comentarioOtc;

    @Element(name = "Declaracao", required = true)
    private String declaracao;

    @Element(name = "Emissao", required = true)
    private Emissao emissao;

    @Element(name = "ExecucaoTestes", required = true)
    private ExecucaoTestes execucaoTestes;

    @Element(name = "AprovacaoRelatorio", required = true)
    private AprovacaoRelatorio aprovacaoRelatorio;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getEmiteNFe() {
        return emiteNFe;
    }

    public void setEmiteNFe(Boolean emiteNFe) {
        this.emiteNFe = emiteNFe;
    }

    public Desenvolvedora getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(Desenvolvedora desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public Otc getOtc() {
        return otc;
    }

    public void setOtc(Otc otc) {
        this.otc = otc;
    }

    public String getVersaoErPaf() {
        return versaoErPaf;
    }

    public void setVersaoErPaf(String versaoErPaf) {
        this.versaoErPaf = versaoErPaf;
    }

    public String getComentarioOtc() {
        return comentarioOtc;
    }

    public void setComentarioOtc(String comentarioOtc) {
        this.comentarioOtc = comentarioOtc;
    }

    public String getDeclaracao() {
        return declaracao;
    }

    public void setDeclaracao(String declaracao) {
        this.declaracao = declaracao;
    }

    public Emissao getEmissao() {
        return emissao;
    }

    public void setEmissao(Emissao emissao) {
        this.emissao = emissao;
    }

	public ExecucaoTestes getExecucaoTestes() {
		return execucaoTestes;
	}

	public void setExecucaoTestes(ExecucaoTestes execucaoTestes) {
		this.execucaoTestes = execucaoTestes;
	}

	public AprovacaoRelatorio getAprovacaoRelatorio() {
		return aprovacaoRelatorio;
	}

	public void setAprovacaoRelatorio(AprovacaoRelatorio aprovacaoRelatorio) {
		this.aprovacaoRelatorio = aprovacaoRelatorio;
	}
}