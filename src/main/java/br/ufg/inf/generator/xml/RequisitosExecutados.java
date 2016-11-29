package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "RequisitosExecutados")
public class RequisitosExecutados {

    @Element(name = "Nome", required = true)
    private String nome;

    public String getRequisitoExecutado() {
        return nome;
    }

    public void setRequisitoExecutado(String nome) {
        this.nome = nome;
    }

}
