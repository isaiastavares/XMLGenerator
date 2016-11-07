package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "PeriodoAnalise")
public class PeriodoAnalise extends LaudoBase {

	@Element(name = "DataInicio", required = true)
    private String dataInicio;

	@Element(name = "DataFim", required = true)
    private String dataFim;

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
}
