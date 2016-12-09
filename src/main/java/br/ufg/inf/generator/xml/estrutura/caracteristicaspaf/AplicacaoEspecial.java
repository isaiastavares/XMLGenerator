package br.ufg.inf.generator.xml.estrutura.caracteristicaspaf;

import br.ufg.inf.generator.xml.estrutura.LaudoBase;
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
