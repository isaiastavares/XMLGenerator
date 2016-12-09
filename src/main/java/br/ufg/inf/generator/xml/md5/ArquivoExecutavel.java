package br.ufg.inf.generator.xml.md5;

import br.ufg.inf.generator.xml.estrutura.RequisitoExecutado;
import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

public class ArquivoExecutavel extends NomeMD5 {

    @ElementList(name = "RequisitosExecutados", required = false)
    private List<RequisitoExecutado> requisitosExecutados;

    @Element(name = "Funcao", required = false)
    private String funcao;

    public List<RequisitoExecutado> getRequisitosExecutados() {
        return requisitosExecutados;
    }

    public void setRequisitosExecutados(List<RequisitoExecutado> requisitosExecutados) {
        this.requisitosExecutados = requisitosExecutados;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
