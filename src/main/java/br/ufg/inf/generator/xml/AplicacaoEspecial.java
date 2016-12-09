package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;

public class AplicacaoEspecial extends LaudoBase {

    @Element(name = "AplicacaoEspecial", required = true)
    private String aplicacao;

    public String getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }
}
