package br.ufg.inf.generator.xml.estrutura.mensagem;

import br.ufg.inf.generator.xml.estrutura.comum.Endereco;
import br.ufg.inf.generator.xml.estrutura.LaudoBase;
import br.ufg.inf.generator.xml.estrutura.otc.PeriodoAnalise;
import org.simpleframework.xml.Element;

public class Otc extends LaudoBase {

    @Element(name = "RazaoSocial", required = true)
    private String razaoSocial;

    @Element(name = "Cnpj", required = true)
    private String cnpj;

    @Element(name = "Ie", required = true)
    private String inscricaoEstadual;

    @Element(name = "Endereco", required = true)
    private Endereco endereco;

    @Element(name = "PeriodoAnalise", required = true)
    private PeriodoAnalise periodoAnalise;

    @Element(name = "VersaoEspecificacaoRequisitos", required = true)
    private String versaoCotepe;

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

    public PeriodoAnalise getPeriodoAnalise() {
        return periodoAnalise;
    }

    public void setPeriodoAnalise(PeriodoAnalise periodoAnalise) {
        this.periodoAnalise = periodoAnalise;
    }

    public String getVersaoCotepe() {
        return versaoCotepe;
    }

    public void setVersaoCotepe(String versaoCotepe) {
        this.versaoCotepe = versaoCotepe;
    }
}
