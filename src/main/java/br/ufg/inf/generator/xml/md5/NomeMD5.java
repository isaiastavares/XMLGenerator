package br.ufg.inf.generator.xml.md5;

import br.ufg.inf.generator.xml.estrutura.LaudoBase;
import org.simpleframework.xml.Element;

public class NomeMD5 extends LaudoBase {

    @Element(name = "Nome", required = true)
    protected String nome;

    @Element(name = "Md5", required = true)
    protected String md5;

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
