package br.ufg.inf.generator.xml;

import java.util.ArrayList;

import org.simpleframework.xml.ElementList;

public class TratamentoInterrupcao extends LaudoBase {

	@ElementList(name = "Modo", inline = true, required = true)
    private ArrayList<Modo> modos;

	public ArrayList<Modo> getModos() {
		return modos;
	}

	public void setModos(ArrayList<Modo> modos) {
		this.modos = modos;
	}
}
