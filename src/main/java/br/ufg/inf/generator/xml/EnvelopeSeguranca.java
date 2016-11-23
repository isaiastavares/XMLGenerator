package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "EnvelopeSeguranca")
public class EnvelopeSeguranca extends LaudoBase {

	@Element(name = "Marca", required = true)
    private String marca;

	@Element(name = "Modelo", required = true)
    private String modelo;

	@Element(name = "Numero", required = true)
    private String numero;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
