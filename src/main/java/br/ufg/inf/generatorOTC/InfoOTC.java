package br.ufg.inf.generatorOTC;

import br.ufg.inf.generatorEmpresaDesenv.xml.*;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Contato")
public class InfoOTC extends LaudoBase {

    @Element(name = "Razao Social", required = true)
    private String razaoSocial;

    @Element(name = "Cnpj", required = true)
    private String cnpj;

    @Element(name = "Inscricao Social", required = true)
    private String inscSocial;

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

    public String getInscSocial() {
        return inscSocial;
    }

    public void setInscSocial(String inscSocial) {
        this.inscSocial = inscSocial;
    }

}
