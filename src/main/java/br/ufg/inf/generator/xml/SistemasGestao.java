package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "SistemasGestao")
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
