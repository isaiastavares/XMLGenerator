package br.ufg.inf.generator.xml;

import org.simpleframework.xml.Element;

public class ArquivoExecutavel extends NomeMD5 {

    @Element(name = "Nome", required = true)
    private String nome;

    @Element(name = "Md5", required = true)
    private String md5;

    @Element(name = "RequisitosExecutados", required = false)
    private RequisitosExecutados requisitosExecutados;

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

    public RequisitosExecutados getRequisitosExecutados() {
        return requisitosExecutados;
    }

    public void setRequisitosExecutados(RequisitosExecutados requisitosExecutados) {
        this.requisitosExecutados = requisitosExecutados;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
