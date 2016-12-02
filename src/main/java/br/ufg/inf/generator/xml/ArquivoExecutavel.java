package br.ufg.inf.generator.xml;

import java.util.ArrayList;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

public class ArquivoExecutavel extends NomeMD5 {

    @Element(name = "Nome", required = true)
    private String nome;

    @Element(name = "Md5", required = true)
    private String md5;

    @ElementList(name = "RequisitosExecutados", required = false)
    private ArrayList<RequisitoExecutado> requisitosExecutados;

    @Element(name = "Funcao", required = false)
    private String funcao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

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
