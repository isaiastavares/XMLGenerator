package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Text;

public class RequisitoExecutado {

    @Text
    private String requisitoExecutado;

    public String getRequisitoExecutado() {
        return requisitoExecutado;
    }

    public void setRequisitoExecutado(String requisitoExecutado) {
        this.requisitoExecutado = requisitoExecutado;
    }

}
