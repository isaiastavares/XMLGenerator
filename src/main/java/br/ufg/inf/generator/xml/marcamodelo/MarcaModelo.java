package br.ufg.inf.generator.xml.marcamodelo;

import br.ufg.inf.generator.xml.LaudoBase;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "MarcaModelo")
public class MarcaModelo extends LaudoBase {

    @Element(name = "Marca", required = true)
    private String marca;

    @Element(name = "Modelo", required = true)
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}