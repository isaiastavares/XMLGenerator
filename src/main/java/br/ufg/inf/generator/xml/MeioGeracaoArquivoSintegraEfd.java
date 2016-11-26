package br.ufg.inf.generator.xml;

import java.util.ArrayList;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "MeioGeracaoArquivoSintegraEfd")
public class MeioGeracaoArquivoSintegraEfd extends LaudoBase {

	@ElementList(name = "Modo", inline = true, required = true)
    private ArrayList<Modo> modos;

	public ArrayList<Modo> getModos() {
		return modos;
	}

	public void setModos(ArrayList<Modo> modos) {
		this.modos = modos;
	}
}
