package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;

public class Ecf extends LaudoBase{
    @Element(name = "Marca", required = true)
    private String marca;
    @Element(name = "Modelo", required = true)
    private String modelo;

    public Ecf(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

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
