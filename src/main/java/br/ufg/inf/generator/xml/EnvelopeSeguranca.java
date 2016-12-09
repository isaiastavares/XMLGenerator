package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;

public class EnvelopeSeguranca extends MarcaModelo {

    @Element(name = "Numero", required = true)
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
