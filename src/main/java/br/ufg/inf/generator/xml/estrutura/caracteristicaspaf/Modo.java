package br.ufg.inf.generator.xml.estrutura.caracteristicaspaf;

import br.ufg.inf.generator.xml.estrutura.LaudoBase;
import org.simpleframework.xml.Text;

public class Modo extends LaudoBase {

    @Text(required = true)
    private String modoGeraArquivo;

    public String getModo() {
        return modoGeraArquivo;
    }

    public void setModo(String modo) {
        this.modoGeraArquivo = modo;
    }
}
