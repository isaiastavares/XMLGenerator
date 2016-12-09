package br.ufg.inf.generator.xml.estrutura.comum;

import org.simpleframework.xml.Element;

import br.ufg.inf.generator.validadores.valores.StringValidador;
import br.ufg.inf.generator.xml.estrutura.LaudoBase;

public class Endereco extends LaudoBase {

    @Element(name = "Logradouro", required = true)
    private String logradouro;

    @Element(name = "Numero", required = true)
    private String numero;

    @Element(name = "Complemento", required = true)
    private String complemento;

    @Element(name = "Bairro", required = true)
    private String bairro;

    @Element(name = "Municipio", required = true)
    private String municipio;

    @Element(name = "Uf", required = true)
    private String uf;

    @Element(name = "Cep", required = true)
    private String cep;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        StringValidador.tamanho255(logradouro);
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        StringValidador.tamanho25(numero);
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        StringValidador.tamanho0ate255(complemento);
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        StringValidador.tamanho255(bairro);
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        StringValidador.tamanho255(municipio);
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        StringValidador.exatamente8N(cep);
        this.cep = cep;
    }
}
