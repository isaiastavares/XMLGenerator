package br.ufg.inf.generator.xml.estrutura.sistemasgestao;

import br.ufg.inf.generator.xml.estrutura.LaudoBase;
import org.simpleframework.xml.Element;

public class EmpresaDesenvolvedora extends LaudoBase {

    @Element(name = "RazaoSocial", required = true)
    private String razaoSocial;

    @Element(name = "Cnpj", required = true)
    private String cnpj;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
