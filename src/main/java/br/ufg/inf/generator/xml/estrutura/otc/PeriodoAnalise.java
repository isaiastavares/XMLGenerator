package br.ufg.inf.generator.xml.estrutura.otc;

import br.ufg.inf.generator.xml.estrutura.LaudoBase;
import java.time.LocalDate;

import org.simpleframework.xml.Element;

public class PeriodoAnalise extends LaudoBase {

    @Element(name = "DataInicio", required = true)
    private LocalDate dataInicio;

    @Element(name = "DataFim", required = true)
    private LocalDate dataFim;

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

}
