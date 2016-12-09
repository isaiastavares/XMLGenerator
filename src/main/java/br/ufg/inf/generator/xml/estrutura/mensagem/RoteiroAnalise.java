package br.ufg.inf.generator.xml.estrutura.mensagem;

import br.ufg.inf.generator.xml.estrutura.LaudoBase;
import org.simpleframework.xml.Element;

public class RoteiroAnalise extends LaudoBase {

    @Element(name = "VersaoRoteiro", required = true)
    private String versaoRoteiro;

    @Element(name = "VersaoErPaf", required = true)
    private String versaoErPaf;

    @Element(name = "Mes", required = true)
    private String mes;

    @Element(name = "Ano", required = true)
    private String ano;

    public String getVersaoRoteiro() {
        return versaoRoteiro;
    }

    public void setVersaoRoteiro(String versaoRoteiro) {
        this.versaoRoteiro = versaoRoteiro;
    }

    public String getVersaoErPaf() {
        return versaoErPaf;
    }

    public void setVersaoErPaf(String versaoErPaf) {
        this.versaoErPaf = versaoErPaf;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
