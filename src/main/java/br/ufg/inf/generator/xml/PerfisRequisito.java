package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;

public class PerfisRequisito extends LaudoBase {

    @Element(name = "PerfilRequisito", required = true)
    private String perfilRequisito;

    public String getPerfilRequisito() {
        return perfilRequisito;
    }

    public void setPerfilRequisito(String perfilRequisito) {
        this.perfilRequisito = perfilRequisito;
    }

}
