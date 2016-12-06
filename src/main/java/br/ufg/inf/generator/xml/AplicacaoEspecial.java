package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Text;

public class AplicacaoEspecial {

    @Text
    private String aplicacao;

    public String getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }
}
