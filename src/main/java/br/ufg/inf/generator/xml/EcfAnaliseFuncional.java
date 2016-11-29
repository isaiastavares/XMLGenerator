package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author Kalyn
 */
@Root(name = "EcfAnaliseFuncional")
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
