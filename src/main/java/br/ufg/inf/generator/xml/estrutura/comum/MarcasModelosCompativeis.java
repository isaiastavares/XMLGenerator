package br.ufg.inf.generator.xml.estrutura.comum;

import br.ufg.inf.generator.xml.estrutura.LaudoBase;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "MarcasModelosCompativeis")
public class MarcasModelosCompativeis extends LaudoBase {

    @ElementList(required = true, inline = true)
    private List<MarcaModelo> marcasModelos;

    public List<MarcaModelo> getMarcasModelos() {
        return marcasModelos;
    }

    public void setMarcasModelos(List<MarcaModelo> marcasModelos) {
        this.marcasModelos = marcasModelos;
    }
}
