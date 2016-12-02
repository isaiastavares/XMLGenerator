package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;

public class SistemasPed extends LaudoBase {

    @Element(name = "SistemaPed", required = true)
    private SistemaPed sistemaPed = new SistemaPed();

    public SistemaPed getSistemaPed() {
        return sistemaPed;
    }

    public void setSistemaPed(SistemaPed sistemaPed) {
        this.sistemaPed = sistemaPed;
    }
}
