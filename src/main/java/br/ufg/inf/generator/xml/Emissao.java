package br.ufg.inf.generator.xml;

import org.joda.time.LocalDate;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Emissao")
public class Emissao extends LaudoBase {

    @Element(name = "Data", required = true)
    private LocalDate data;

    @Element(name = "Local", required = true)
    private String local;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
