package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;

public class SistemasGestao extends LaudoBase {

    @Element(name = "SistemaGestao", required = true)
    private SistemaGestao sistemaGestao;

    public SistemaGestao getSistemaGestao() {
        return sistemaGestao;
    }

    public void setSistemaGestao(SistemaGestao sistemaGestao) {
        this.sistemaGestao = sistemaGestao;
    }
}
