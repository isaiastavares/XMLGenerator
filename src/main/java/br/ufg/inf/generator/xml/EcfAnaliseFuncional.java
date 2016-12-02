package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;

public class EcfAnaliseFuncional {
    @Element(name = "MarcaModelo", required = true)
    private MarcaModelo marcaModelo;

    public MarcaModelo getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(MarcaModelo marcaModelo) {
        this.marcaModelo = marcaModelo;
    }
}
