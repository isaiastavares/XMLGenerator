package br.ufg.inf.generatorEmpresaDesenv.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Contato")
public class Contato extends LaudoBase {

    @Element(name = "Nome", required = true)
    private String nome;

    @Element(name = "Cpf", required = true)
    private String cpf;

    @Element(name = "Telefone", required = true)
    private String telefone;

    @Element(name = "Email", required = true)
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
