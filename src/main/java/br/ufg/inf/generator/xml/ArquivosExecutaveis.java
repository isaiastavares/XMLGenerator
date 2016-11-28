package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ArquivosExecutaveis")
public class ArquivosExecutaveis extends LaudoBase {

    @Element(name = "ArquivoExecutavel", required = true)
    private ArquivoExecutavel arquivoExecutavel;

    public ArquivoExecutavel getArquivoExecutavel() {
        return arquivoExecutavel;
    }

    public void setArquivoExecutavel(ArquivoExecutavel arquivoExecutavel) {
        this.arquivoExecutavel = arquivoExecutavel;
    }
    
}
