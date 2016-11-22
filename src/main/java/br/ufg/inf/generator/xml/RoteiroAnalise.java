package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "RoteiroAnalise")
public class RoteiroAnalise extends LaudoBase {

    @Element(name = "VersaoRoteiro", required = true)
    private String versaoRoteiro;

    @Element(name = "Mes", required = true)
    private String mes;

    @Element(name = "Ano", required = true)
    private String ano;

	public String getVersaoRoteiro() {
		return versaoRoteiro;
	}

	public void setVersaoRoteiro(String versaoRoteiro) {
		this.versaoRoteiro = versaoRoteiro;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
}
