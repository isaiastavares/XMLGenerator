package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "CaracteristicasPaf")
public class CaracteristicasPaf extends LaudoBase {

	@Element(name = "TratamentoInterrupcao", required = true)
    private TratamentoInterrupcao tratamentoInterrupcao;

	public TratamentoInterrupcao getTratamentoInterrupcao() {
		return tratamentoInterrupcao;
	}

	public void setTratamentoInterrupcao(TratamentoInterrupcao tratamentoInterrupcao) {
		this.tratamentoInterrupcao = tratamentoInterrupcao;
	}
}
