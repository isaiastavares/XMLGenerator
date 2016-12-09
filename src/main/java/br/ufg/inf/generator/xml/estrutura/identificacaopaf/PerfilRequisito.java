package br.ufg.inf.generator.xml.estrutura.identificacaopaf;

import br.ufg.inf.generator.xml.estrutura.LaudoBase;
import org.simpleframework.xml.Text;

public class PerfilRequisito extends LaudoBase {

    @Text(required = true)
    private String perfil;

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
