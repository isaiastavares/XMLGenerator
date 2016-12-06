package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;

public class ArquivoExecutavelPrincipal extends LaudoBase {

    @Element(name = "Nome", required = true)
    private String nome;

    @Element(name = "Md5", required = true)
    private String md5;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }
}
