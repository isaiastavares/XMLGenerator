package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name = "Modo")
public class Modo extends LaudoBase {

	@Text(required = true)
    private String modo;

	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}
}
