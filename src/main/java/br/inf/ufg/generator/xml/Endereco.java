package br.inf.ufg.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Endereco")
public class Endereco extends LaudoBase {

	@Element(name = "Logradouro", required = true)
    private String logradouro;

	@Element(name = "Numero", required = true)
    private String numero;

	@Element(name = "Complemento", required = true)
    private String complemento;

	@Element(name = "Bairro", required = true)
    private String bairro;

	@Element(name = "Municipio", required = true)
    private String municipio;

	@Element(name = "Uf", required = true)
    private String uf;

	@Element(name = "Cep", required = true)
    private String cep;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
