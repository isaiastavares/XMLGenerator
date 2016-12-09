package br.ufg.inf.generator.xml.estrutura;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Laudo")
public class Laudo extends LaudoBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "Mensagem", required = true)
    private Mensagem mensagem;

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
}
