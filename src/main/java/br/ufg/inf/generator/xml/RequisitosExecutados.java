package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;

public class RequisitosExecutados {

    @Element(name = "Nome", required = true)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
