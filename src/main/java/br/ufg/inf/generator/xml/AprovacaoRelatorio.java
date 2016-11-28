package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "AprovacaoRelatorio")
public class AprovacaoRelatorio extends LaudoBase {

    @Element(name = "Nome", required = true)
    private String nome;

    @Element(name = "Cargo", required = true)
    private String cargo;

    @Element(name = "Cpf", required = true)
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
