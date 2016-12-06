package br.ufg.inf.generator.xml;

import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

public class ArquivoExecutavel extends NomeMD5 {

    @ElementList(name = "RequisitosExecutados", required = false)
    private ArrayList<RequisitoExecutado> requisitosExecutados;

    @Element(name = "Funcao", required = false)
    private String funcao;

    public ArrayList<RequisitoExecutado> getRequisitosExecutados() {
        return requisitosExecutados;
    }

    public void setRequisitosExecutados(ArrayList<RequisitoExecutado> requisitosExecutados) {
        this.requisitosExecutados = requisitosExecutados;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
