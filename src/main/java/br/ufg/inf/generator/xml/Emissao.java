package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Emissao")
public class Emissao extends LaudoBase {

	@Element(name = "Data", required = true)
    private String data;

	@Element(name = "Local", required = true)
    private String local;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
}
