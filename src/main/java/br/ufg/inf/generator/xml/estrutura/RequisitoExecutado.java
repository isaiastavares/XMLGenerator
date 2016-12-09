package br.ufg.inf.generator.xml.estrutura;

import org.simpleframework.xml.Text;

public class RequisitoExecutado extends LaudoBase {

    @Text(required = true)
    private String requisitoExecutado;

    public String getRequisitoExecutado() {
        return requisitoExecutado;
    }

    public void setRequisitoExecutado(String requisitoExecutado) {
        this.requisitoExecutado = requisitoExecutado;
    }

}
