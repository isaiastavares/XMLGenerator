package br.ufg.inf.generator.xml.estrutura.mensagem;

import br.ufg.inf.generator.xml.estrutura.desenvolvedora.Contato;
import br.ufg.inf.generator.xml.estrutura.comum.Endereco;
import br.ufg.inf.generator.xml.estrutura.LaudoBase;
import org.simpleframework.xml.Element;

public class Desenvolvedora extends LaudoBase {

    @Element(name = "RazaoSocial", required = true)
    private String razaoSocial;

    @Element(name = "Cnpj", required = true)
    private String cnpj;

    @Element(name = "Ie", required = true)
    private String inscricaoEstadual;

    @Element(name = "Endereco", required = true)
    private Endereco endereco;

    @Element(name = "Contato", required = true)
    private Contato contato;

    @Element(name = "ResponsavelAcompanhamentoTestes", required = true)
    private String respAcompTestes;

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

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getRespAcompTestes() {
        return respAcompTestes;
    }

    public void setRespAcompTestes(String respAcompTestes) {
        this.respAcompTestes = respAcompTestes;
    }
}
