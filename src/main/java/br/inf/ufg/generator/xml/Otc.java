package br.inf.ufg.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Otc")
public class Otc extends LaudoBase {

	@Element(name = "RazaoSocial", required = true)
    private String razaoSocial;

	@Element(name = "Cnpj", required = true)
    private String cnpj;

	@Element(name = "Ie", required = true)
    private String inscricaoEstadual;

	@Element(name = "Endereco", required = true)
    private Endereco endereco;

	@Element(name = "PeriodoAnalise", required = true)
    private PeriodoAnalise periodoAnalise;

	@Element(name = "VersaoEspecificacaoRequisitos", required = true)
    private String versaoEspecifRequisitos;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public PeriodoAnalise getPeriodoAnalise() {
		return periodoAnalise;
	}

	public void setPeriodoAnalise(PeriodoAnalise periodoAnalise) {
		this.periodoAnalise = periodoAnalise;
	}

	public String getVersaoEspecifRequisitos() {
		return versaoEspecifRequisitos;
	}

	public void setVersaoEspecifRequisitos(String versaoEspecifRequisitos) {
		this.versaoEspecifRequisitos = versaoEspecifRequisitos;
	}
}
