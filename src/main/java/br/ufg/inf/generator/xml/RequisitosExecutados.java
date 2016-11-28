package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "RequisitosExecutados")
public class RequisitosExecutados {

    @Element(name = "RequisitoExecutado", required = true)
    private String requisitoExecutado;

    public String getRequisitoExecutado() {
        return requisitoExecutado;
    }

    public void setRequisitoExecutado(String requisitoExecutado) {
        this.requisitoExecutado = requisitoExecutado;
    }
    
}
